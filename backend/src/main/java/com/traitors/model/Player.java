package com.traitors.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Player entity — maps directly to the `players` table in the database.
 *
 * @Entity   → tells JPA this class is a database table
 * @Table    → specifies which table name to use
 * @Id      → marks the primary key field
 * @Column  → customizes column constraints (nullable, unique, length...)
 *
 * We use UUID strings as IDs instead of auto-increment integers.
 * This is safer for multiplayer games — players can't guess other player IDs.
 */
@Entity
@Table(name = "players")
public class Player {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "username", unique = true, nullable = false, length = 50)
    private String username;

    /**
     * NEVER store plain-text passwords.
     * This field always holds a BCrypt hash (e.g. "$2a$10$abc123...")
     * The original password is never stored anywhere.
     */
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "xp_total")
    private int xpTotal = 0;

    @Column(name = "wins")
    private int wins = 0;

    @Column(name = "losses")
    private int losses = 0;

    /**
     * @Column(updatable = false) means this value is set once on INSERT
     * and never changed by JPA on UPDATE queries.
     */
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    /**
     * @PrePersist runs automatically just before INSERT.
     * We use it to set the UUID and timestamp so we never forget to set them manually.
     */
    @PrePersist
    protected void onCreate() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
    }

    // ─────────────────────────────────────────
    // Constructors
    // ─────────────────────────────────────────

    public Player() {
        // JPA requires a no-arg constructor
    }

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ─────────────────────────────────────────
    // Getters & Setters
    // ─────────────────────────────────────────

    public String getId() { return id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getXpTotal() { return xpTotal; }
    public void setXpTotal(int xpTotal) { this.xpTotal = xpTotal; }

    public int getWins() { return wins; }
    public void setWins(int wins) { this.wins = wins; }

    public int getLosses() { return losses; }
    public void setLosses(int losses) { this.losses = losses; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Player{id='" + id + "', username='" + username + "', xp=" + xpTotal + "}";
    }
}