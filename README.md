# 🎭 THE TRAITORS: Online Multiplayer Game
## Project Pitch

---

## 🎮 Game Concept

An online multiplayer deception game inspired by *The Traitors* reality TV show. Players must work together during the day while secretly identifying traitors who eliminate them at night. Trust no one.

---

## 👥 How It Works

### **Game Setup**
- **5-12 players** per match
- **1-2 traitors** randomly assigned (depends on player count)
- All other players are **Faithfuls**
- Everyone starts with **0 XP points**

### **Day Phase (Challenge Time)**
- All players participate in **team challenges**
- During the challenges, players can label other players with badges, such as "liar, reliable, bold, smart, ..."
- Completing challenges earns **XP points** for the group pot
- Players discuss and **vote to banish** one suspected traitor- 
- - Discussion method to be defined, audio would enhance deceiving element of the game.
- If a Traitor is banished → XP stays in the pot
- If a Faithful is banished → Less people to share the prize

### **Night Phase (Murder Time)**
- Traitors secretly choose one **Faithful to eliminate**
- Murdered players are out of the game
- Random night phases could implement more dynamic voting or "murder on plain sight"
- The group discovers who died at the start of next day

### **Victory Conditions**
- **Faithfuls Win:** Banish all Traitors before 3 players remain
    - Remaining Faithfuls split the XP pot equally
- **Traitors Win:** Survive until only 3 players remain with at least 1 Traitor
    - Traitors take ALL the XP points

---

## 🎯 Why This Game is AWESOME

✨ **Psychological Warfare** - Who can you trust? Every conversation matters

🎲 **High Replayability** - Different traitors, different strategies every match

🗣️ **Social Interaction** - Built-in voice/text chat for accusations and alliances

🏆 **Competitive Stakes** - XP leaderboards and player statistics

⚡ **Fast-Paced Rounds** - 20-30 minute matches, perfect for gaming sessions

---

## 🛠️ Technical Stack (What We'll Build)

### **Frontend**
- HTML5, CSS3, Vanilla JavaScript
- Real-time UI updates
- Interactive voting system
- Challenge mini-games
- WebSocket client for real-time communication

### **Backend**
- Java (Spring Boot)
- WebSocket connections for real-time gameplay
- Spring Security for authentication & profiles
- RESTful APIs for game management
- PostgreSQL or MySQL database
- Maven/Gradle for dependency management

### **Features to Implement**
- User accounts & login system
- Lobby system with game rooms
- Real-time chat (day phase discussions)
- Secret chat (traitors-only at night)
- Multiple challenge types (puzzle, reflex, teamwork)
- XP & ranking system
- Player statistics dashboard

---

## 🎨 Game Phases Breakdown

### Phase 1: Lobby
- Players join game rooms
- Host starts when minimum 5 players ready
- Roles secretly assigned

### Phase 2: Day Round (5-7 minutes)
- **Challenge:** Complete team objective for XP
- **Discussion:** Open chat to debate suspicions
- **Voting:** Banish one player (majority vote)

### Phase 3: Night Round (2 minutes)
- **Murder:** Traitors vote on who to eliminate
- **Results:** Revealed at dawn

### Phase 4: Endgame
- Game ends when 3 players remain
- XP distributed based on victory condition
- Stats updated, MVP awarded

---

## 🚀 Development Roadmap

### **Phase 1 - MVP (Minimum Viable Product)**
- Basic lobby system
- Simple text-based challenges
- Voting mechanism
- Day/Night cycle
- Win/Loss conditions

### **Phase 2 - Enhanced Experience**
- Multiple challenge types
- Voice chat integration
- Animations & sound effects
- Player profiles & stats

### **Phase 3 - Advanced Features**
- Tournament mode
- Custom game rules
- Spectator mode
- Mobile responsive design

---

## 💡 Why This is Perfect for Fullstack Practice

✅ Real-time communication (WebSockets with STOMP protocol)

✅ Complex game state management

✅ Spring Security authentication & JWT sessions

✅ JPA/Hibernate database design (users, matches, stats)

✅ Vanilla JavaScript DOM manipulation & animations

✅ RESTful API development with Spring Boot

✅ Multiplayer synchronization with WebSocket

✅ Security (preventing cheating, input validation)

---

## 🎬 Let's Make This Happen!

This project combines:
- **Social deduction** (fun gameplay)
- **Real-time tech** (impressive portfolio piece)
- **Team collaboration** (learn together)
- **Scalable complexity** (start simple, grow features)

**Ready to betray your friends? 🗡️**

---

*Questions? Ideas? Let's discuss and refine this together!*