# 🎭 THE TRAITORS - Team Task Division
## 3-Person Development Team

---

## 👤 PERSON 1: Authentication & Lobby System
**Focus:** User management, game rooms, and player profiles

### **Backend Tasks**
- [ ] Set up Express server with TypeScript
- [ ] Database schema design (Users, Games, Stats tables)
- [ ] User authentication system (register, login, JWT tokens)
- [ ] User profile API endpoints (GET/UPDATE profile, stats)
- [ ] Lobby/Room system API
    - Create room endpoint
    - Join room endpoint
    - Leave room endpoint
    - List available rooms
    - Room capacity management
- [ ] WebSocket setup for lobby (players joining/leaving)
- [ ] Game initialization logic (assign roles randomly)

### **Frontend Tasks**
- [ ] Login/Register pages
- [ ] User profile page (view stats, labels earned)
- [ ] Lobby browser (list of available games)
- [ ] Room creation interface
- [ ] Waiting room UI (players list, ready status, chat)
- [ ] Player card components (avatar, username, stats)
- [ ] Connection status indicators

### **Integration Points**
- Share User type definitions with Person 2 & 3
- Provide WebSocket connection setup for Person 2
- Room state management hooks for Person 3

---

## 👤 PERSON 2: Game Logic & Phase Management
**Focus:** Core game mechanics, state management, and day/night cycles

### **Backend Tasks**
- [ ] Game state management system
    - Current phase tracker (Day/Night/Voting/Results)
    - Player alive/dead status
    - XP pot tracking
    - Round counter
- [ ] Day phase logic
    - Challenge start/end triggers
    - Discussion timer
    - Hot seat rotation system
- [ ] Night phase logic
    - Traitor murder selection
    - Murder resolution
    - Victim reveal at dawn
- [ ] Voting system backend
    - Vote collection
    - Vote tallying
    - Banishment logic
    - Pre-vote declaration tracking
- [ ] Victory condition checker
    - Detect 3 players remaining
    - Calculate winners
    - XP distribution
- [ ] Label system API (liar, clever, smart, cheeky, bold)
    - Award labels endpoint
    - Track label history
- [ ] WebSocket events for game state updates

### **Frontend Tasks**
- [ ] Game screen main layout
- [ ] Phase indicator UI (Day/Night banner, timer)
- [ ] Day phase interface
    - Discussion area
    - Player grid with status
    - Phase timer display
- [ ] Night phase interface
    - Traitor-only murder selection screen
    - Faithful waiting screen
    - Murder reveal animation
- [ ] Game state context/provider (React Context or Zustand)
- [ ] End game screen
    - Winner announcement
    - XP distribution display
    - Match statistics
- [ ] Player role indicator (secret - only you see it)
- [ ] Game flow animations and transitions

### **Integration Points**
- Receive room data from Person 1
- Provide game state to Person 3 for challenges/voting
- Share phase hooks with Person 3

---

## 👤 PERSON 3: Challenges, Voting & Communication
**Focus:** Interactive features, voting UI, voice chat, and hot seat

### **Backend Tasks**
- [ ] Challenge system API
    - Multiple challenge types (reflex, puzzle, teamwork)
    - Challenge result submission
    - XP calculation for completed challenges
    - Challenge progress tracking
- [ ] Voting system API support
    - Pre-vote declaration endpoints
    - Final vote submission
    - Tie-breaker logic
- [ ] Chat system (WebSocket)
    - General day chat
    - Traitor-only night chat
    - Message broadcasting
    - Chat history
- [ ] Hot seat mechanic backend
    - Player selection rotation
    - Question submission tracking
    - Timer enforcement
- [ ] Voice chat coordination (signal server for WebRTC)

### **Frontend Tasks**
- [ ] Challenge UI components
    - Challenge instructions screen
    - Interactive challenge games (mini-games)
    - Progress bars
    - Team coordination display
    - XP earned animation
- [ ] Voting interface
    - Pre-vote declaration screen
    - Final voting screen
    - Vote counter display
    - Results reveal animation
- [ ] Chat system
    - Chat box component
    - Message list
    - Real-time message updates
    - Traitor-only chat toggle
- [ ] Voice chat integration
    - Microphone controls (mute/unmute)
    - Voice indicators (who's speaking)
    - Audio quality settings
- [ ] Hot seat interface
    - Hot seat spotlight UI
    - Question submission box
    - Timer countdown
    - Q&A display
- [ ] Label awarding interface
    - Label selection modal
    - Label display on player cards
    - Label history tooltip

### **Integration Points**
- Use game state from Person 2
- Use player data from Person 1
- Coordinate WebSocket events with both

---

## 🤝 Shared Responsibilities

### **Everyone**
- [ ] TypeScript type definitions (shared types file)
- [ ] Code reviews for each other
- [ ] Testing their own features
- [ ] Documentation for their components

### **Weekly Sync Points**
- Integration testing together
- Resolve merge conflicts
- Demo progress to each other
- Plan next sprint

---

## 📂 Project Structure

```
traitors-game/
├── backend/
│   ├── src/
│   │   ├── controllers/
│   │   │   ├── authController.ts        [Person 1]
│   │   │   ├── gameController.ts        [Person 2]
│   │   │   ├── challengeController.ts   [Person 3]
│   │   │   └── voteController.ts        [Person 3]
│   │   ├── models/
│   │   │   ├── User.ts                  [Person 1]
│   │   │   ├── Game.ts                  [Person 2]
│   │   │   └── Challenge.ts             [Person 3]
│   │   ├── services/
│   │   │   ├── authService.ts           [Person 1]
│   │   │   ├── gameService.ts           [Person 2]
│   │   │   └── challengeService.ts      [Person 3]
│   │   ├── socket/
│   │   │   ├── lobbySocket.ts           [Person 1]
│   │   │   ├── gameSocket.ts            [Person 2]
│   │   │   └── chatSocket.ts            [Person 3]
│   │   ├── types/
│   │   │   └── shared.ts                [Everyone]
│   │   └── server.ts                    [Person 1 sets up]
│   └── package.json
│
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   │   ├── Auth/                    [Person 1]
│   │   │   ├── Lobby/                   [Person 1]
│   │   │   ├── Game/                    [Person 2]
│   │   │   ├── Challenges/              [Person 3]
│   │   │   ├── Voting/                  [Person 3]
│   │   │   └── Chat/                    [Person 3]
│   │   ├── contexts/
│   │   │   ├── AuthContext.tsx          [Person 1]
│   │   │   ├── GameContext.tsx          [Person 2]
│   │   │   └── SocketContext.tsx        [Person 1]
│   │   ├── hooks/
│   │   │   ├── useAuth.ts               [Person 1]
│   │   │   ├── useGame.ts               [Person 2]
│   │   │   └── useVoiceChat.ts          [Person 3]
│   │   ├── pages/
│   │   │   ├── LoginPage.tsx            [Person 1]
│   │   │   ├── LobbyPage.tsx            [Person 1]
│   │   │   ├── GamePage.tsx             [Person 2]
│   │   │   └── ProfilePage.tsx          [Person 1]
│   │   ├── types/
│   │   │   └── shared.ts                [Everyone]
│   │   └── App.tsx                      [Person 1 sets up routing]
│   └── package.json
│
└── README.md
```

---

## 🎯 Development Phases

### **Phase 1: Foundation (Week 1-2)**
- **Person 1:** Basic auth + lobby creation working
- **Person 2:** Game state machine + phase transitions
- **Person 3:** Simple text chat + basic voting UI

**Goal:** Players can create account, join lobby, start game, see phases change

---

### **Phase 2: Core Gameplay (Week 3-4)**
- **Person 1:** Profile stats + room management polish
- **Person 2:** Day/night logic + role assignment + victory conditions
- **Person 3:** One challenge type working + voting mechanics complete

**Goal:** Full game loop works - can play a complete match

---

### **Phase 3: Enhanced Features (Week 5-6)**
- **Person 1:** User stats dashboard + label display
- **Person 2:** Label awarding system + end game stats
- **Person 3:** Hot seat system + voice chat + 2-3 more challenge types

**Goal:** All core features implemented, game is fun to play

---

### **Phase 4: Polish (Week 7+)**
- **Everyone:** Bug fixes, animations, sound effects, UI polish
- **Everyone:** Play testing with friends
- **Everyone:** Performance optimization

**Goal:** Production-ready game

---

## 🔧 Suggested Libraries

### **Backend**
```json
{
  "express": "^4.18.0",
  "socket.io": "^4.6.0",
  "jsonwebtoken": "^9.0.0",
  "bcrypt": "^5.1.0",
  "pg": "^8.11.0",           // PostgreSQL
  "typeorm": "^0.3.0",       // ORM (optional)
  "cors": "^2.8.5",
  "dotenv": "^16.0.0"
}
```

### **Frontend**
```json
{
  "react": "^18.2.0",
  "react-router-dom": "^6.21.0",
  "socket.io-client": "^4.6.0",
  "axios": "^1.6.0",
  "zustand": "^4.5.0",        // State management (optional)
  "simple-peer": "^9.11.1",   // WebRTC for voice
  "react-hot-toast": "^2.4.1" // Notifications
}
```

---

## 💡 Tips for Success

### **Communication**
- Daily stand-ups (even 5 minutes on Discord)
- Use GitHub issues for task tracking
- Clear commit messages
- Document your APIs

### **Git Workflow**
- `main` branch = stable code
- Each person works on feature branches
- Pull requests for merging
- Review each other's code

### **Integration**
- Define TypeScript interfaces together FIRST
- Mock data initially, integrate real APIs later
- Test WebSocket events thoroughly
- Handle edge cases (disconnects, errors)

### **When Stuck**
- Check documentation
- Ask in group chat
- Pair program on video call
- Take breaks and revisit

---

## 🚀 Getting Started Checklist

### **Initial Setup (Do Together)**
- [ ] Create GitHub repository
- [ ] Set up project structure (folders above)
- [ ] Initialize backend (Express + TypeScript)
- [ ] Initialize frontend (React + TypeScript + Vite)
- [ ] Set up PostgreSQL database
- [ ] Define shared types in `/types/shared.ts`
- [ ] Set up development environment (.env files)
- [ ] First successful connection (backend + frontend)

### **Person 1 First Tasks**
- [ ] Express server running
- [ ] Database connection working
- [ ] Basic auth endpoints (register/login)
- [ ] JWT token generation
- [ ] Login page in React

### **Person 2 First Tasks**
- [ ] Game state TypeScript types
- [ ] Basic game context provider
- [ ] Phase transition logic (skeleton)
- [ ] Game page layout

### **Person 3 First Tasks**
- [ ] WebSocket chat implementation
- [ ] Chat UI component
- [ ] Basic voting interface
- [ ] Vote submission working

---

## 🎮 Good Luck, Team!

Remember:
- Start simple, add complexity gradually
- Communication is key
- Help each other when blocked
- Celebrate small wins
- Have fun building this!

**First milestone:** Get 5 people in a room and change from Day to Night phase! 🌙