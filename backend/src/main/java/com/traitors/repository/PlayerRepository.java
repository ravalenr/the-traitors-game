package com.traitors.repository;

import com.traitors.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * PlayerRepository — handles all database operations for the Player entity.
 *
 * By extending JpaRepository<Player, String> we get these methods FOR FREE:
 *   save(player)              → INSERT or UPDATE
 *   findById(id)              → SELECT WHERE id = ?
 *   findAll()                 → SELECT * FROM players
 *   delete(player)            → DELETE WHERE id = ?
 *   existsById(id)            → SELECT COUNT(*) WHERE id = ?
 *   count()                   → SELECT COUNT(*) FROM players
 *   ... and many more
 *
 * The String generic is the type of our @Id field (we use UUID strings).
 *
 * We can also declare method signatures and Spring generates the SQL automatically.
 * The method name IS the query — Spring parses it using a naming convention.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    // ─────────────────────────────────────────────────────────────
    // Spring-generated queries (method name → SQL)
    // ─────────────────────────────────────────────────────────────

    /**
     * findBy + Username → WHERE username = ?
     * Returns Optional so callers must handle "not found" without null checks.
     *
     * Generated SQL: SELECT * FROM players WHERE username = ?
     */
    Optional<Player> findByUsername(String username);

    /**
     * existsBy + Username → SELECT COUNT(*) WHERE username = ?
     * Used during registration to check if a username is already taken.
     *
     * Generated SQL: SELECT COUNT(*) > 0 FROM players WHERE username = ?
     */
    boolean existsByUsername(String username);

    /**
     * findBy + XpTotal + OrderByDesc → ORDER BY xp_total DESC
     * Returns the top N players for the leaderboard.
     *
     * Generated SQL: SELECT * FROM players ORDER BY xp_total DESC LIMIT ?
     */
    List<Player> findTop10ByOrderByXpTotalDesc();

    /**
     * findBy + Username + ContainingIgnoreCase → LIKE %?% (case-insensitive)
     * Used for searching players by partial username.
     *
     * Generated SQL: SELECT * FROM players WHERE LOWER(username) LIKE LOWER(?)
     */
    List<Player> findByUsernameContainingIgnoreCase(String partialUsername);


    // ─────────────────────────────────────────────────────────────
    // Custom JPQL queries (we write these manually with @Query)
    // ─────────────────────────────────────────────────────────────

    /**
     * @Query lets us write JPQL (Java Persistence Query Language).
     * JPQL looks like SQL but uses class/field names instead of table/column names.
     *
     * Here: "p" is our Player object, NOT the raw table.
     * p.xpTotal → maps to the xp_total column automatically.
     */
    @Query("SELECT p FROM Player p WHERE p.xpTotal >= :minXp ORDER BY p.xpTotal DESC")
    List<Player> findPlayersWithMinimumXp(@Param("minXp") int minXp);

    /**
     * @Modifying + @Transactional → required for UPDATE/DELETE queries.
     * Without these annotations, Spring will throw an exception.
     *
     * :playerId and :amount are named parameters matched by @Param.
     */
    @Modifying
    @Transactional
    @Query("UPDATE Player p SET p.xpTotal = p.xpTotal + :amount WHERE p.id = :playerId")
    void addXpToPlayer(@Param("playerId") String playerId, @Param("amount") int amount);

    /**
     * Increments win counter and adds XP in one query.
     * Called at game end when a player is on the winning team.
     */
    @Modifying
    @Transactional
    @Query("UPDATE Player p SET p.wins = p.wins + 1, p.xpTotal = p.xpTotal + :xpEarned WHERE p.id = :playerId")
    void recordWin(@Param("playerId") String playerId, @Param("xpEarned") int xpEarned);

    /**
     * Increments loss counter.
     * Called at game end for all players on the losing team.
     */
    @Modifying
    @Transactional
    @Query("UPDATE Player p SET p.losses = p.losses + 1 WHERE p.id = :playerId")
    void recordLoss(@Param("playerId") String playerId);
}