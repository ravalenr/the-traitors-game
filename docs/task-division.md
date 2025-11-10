# 🎭 THE TRAITORS - Team Task Division
## 3-Person Development Team

---

## 👤 PERSON 1: Authentication & Lobby System
**Focus:** User management, game rooms, and player profiles

### **Backend Tasks**
- [ ] Set up Spring Boot project with Maven/Gradle
- [ ] Database schema design (Users, Games, Stats entities with JPA)
- [ ] User authentication system (register, login with Spring Security & JWT)
- [ ] User profile REST endpoints (GET/UPDATE profile, stats)
- [ ] Lobby/Room system REST API
    - POST /api/rooms - Create room endpoint
    - POST /api/rooms/{id}/join - Join room endpoint
    - POST /api/rooms/{id}/leave - Leave room endpoint
    - GET /api/rooms - List available rooms
    - Room capacity management service
- [ ] WebSocket/STOMP setup for lobby (players joining/leaving)
- [ ] Game initialization logic (assign roles randomly with @Service)

### **Frontend Tasks**
- [ ] Login/Register pages (HTML/CSS/JS with fetch API)
- [ ] User profile page (view stats, labels earned)
- [ ] Lobby browser (list of available games with dynamic rendering)
- [ ] Room creation interface (form with validation)
- [ ] Waiting room UI (players list, ready status, chat)
- [ ] Player card components (reusable HTML templates)
- [ ] WebSocket connection status indicators
- [ ] JWT token storage in localStorage/sessionStorage

### **Integration Points**
- Share User entity/DTO definitions with Person 2 & 3
- Provide WebSocket/STOMP connection setup for Person 2
- Room state management utilities for Person 3

---

## 👤 PERSON 2: Game Logic & Phase Management
**Focus:** Core game mechanics, state management, and day/night cycles

### **Backend Tasks**
- [ ] Game state management system (@Service layer)
    - Current phase tracker enum (Day/Night/Voting/Results)
    - Player alive/dead status in Game entity
    - XP pot tracking with BigDecimal
    - Round counter
- [ ] Day phase logic (@Service methods)
    - Challenge start/end triggers with @Scheduled
    - Discussion timer with CompletableFuture
    - Hot seat rotation system
- [ ] Night phase logic
    - Traitor murder selection with validation
    - Murder resolution service
    - Victim reveal at dawn via WebSocket broadcast
- [ ] Voting system backend (@RestController + @Service)
    - POST /api/games/{id}/votes - Vote collection
    - Vote tallying algorithm
    - Banishment logic
    - Pre-vote declaration tracking
- [ ] Victory condition checker (@Component)
    - Detect 3 players remaining trigger
    - Calculate winners algorithm
    - XP distribution with JPA transactions
- [ ] Label system REST API (liar, clever, smart, cheeky, bold)
    - POST /api/labels - Award labels endpoint
    - GET /api/users/{id}/labels - Track label history
- [ ] STOMP WebSocket events for game state updates

### **Frontend Tasks**
- [ ] Game screen main layout (HTML/CSS grid or flexbox)
- [ ] Phase indicator UI (Day/Night banner, timer with setInterval)
- [ ] Day phase interface
    - Discussion area (chat-like display)
    - Player grid with status (dynamic DOM creation)
    - Phase timer display with countdown
- [ ] Night phase interface
    - Traitor-only murder selection screen
    - Faithful waiting screen (conditional rendering)
    - Murder reveal animation (CSS transitions)
- [ ] Game state management (vanilla JS object/class pattern)
- [ ] End game screen
    - Winner announcement modal
    - XP distribution display
    - Match statistics table
- [ ] Player role indicator (secret - only you see it, stored in memory)
- [ ] Game flow animations and transitions (CSS + JS)

### **Integration Points**
- Receive room data from Person 1 via REST/WebSocket
- Provide game state to Person 3 for challenges/voting
- Share phase management utilities with Person 3

---

## 👤 PERSON 3: Challenges, Voting & Communication
**Focus:** Interactive features, voting UI, voice chat, and hot seat

### **Backend Tasks**
- [ ] Challenge system REST API
    - POST /api/challenges - Multiple challenge types (reflex, puzzle, teamwork)
    - POST /api/challenges/{id}/submit - Challenge result submission
    - XP calculation service for completed challenges
    - Challenge progress tracking with JPA
- [ ] Voting system API support
    - POST /api/votes/declare - Pre-vote declaration endpoints
    - POST /api/votes/submit - Final vote submission
    - Tie-breaker logic in @Service
- [ ] Chat system (STOMP WebSocket)
    - /topic/chat/day - General day chat broadcast
    - /topic/chat/traitors - Traitor-only night chat
    - Message broadcasting with @MessageMapping
    - Chat history with JPA entities
- [ ] Hot seat mechanic backend
    - Player selection rotation algorithm
    - POST /api/hotseat/questions - Question submission tracking
    - Timer enforcement with @Scheduled tasks
- [ ] Voice chat coordination (WebRTC signaling server with WebSocket)

### **Frontend Tasks**
- [ ] Challenge UI components (HTML/CSS/JS)
    - Challenge instructions screen
    - Interactive challenge games (canvas-based mini-games)
    - Progress bars (CSS animations)
    - Team coordination display
    - XP earned animation
- [ ] Voting interface
    - Pre-vote declaration screen (form with fetch)
    - Final voting screen (radio buttons + submit)
    - Vote counter display (dynamic updates)
    - Results reveal animation (CSS transitions)
- [ ] Chat system (vanilla JS + WebSocket)
    - Chat box component (scrollable div)
    - Message list (dynamically appended DOM)
    - Real-time message updates via STOMP.js
    - Traitor-only chat toggle (conditional display)
- [ ] Voice chat integration (WebRTC API)
    - Microphone controls (mute/unmute buttons)
    - Voice indicators (visual feedback on speaking)
    - Audio quality settings
- [ ] Hot seat interface
    - Hot seat spotlight UI (highlighted player)
    - Question submission box (form input)
    - Timer countdown (setInterval)
    - Q&A display (list rendering)
- [ ] Label awarding interface
    - Label selection modal (custom modal with JS)
    - Label display on player cards (badges)
    - Label history tooltip (hover events)

### **Integration Points**
- Use game state from Person 2 via REST API/WebSocket
- Use player data from Person 1 via REST endpoints
- Coordinate STOMP WebSocket subscriptions with both

---

## 🤝 Shared Responsibilities

### **Everyone**
- [ ] Shared DTOs (Data Transfer Objects) for API contracts
- [ ] Code reviews for each other (pull requests)
- [ ] Testing their own features (JUnit for backend, manual testing for frontend)
- [ ] JavaDoc for backend, JSDoc for frontend
- [ ] API documentation (Swagger/OpenAPI)

### **Weekly Sync Points**
- Integration testing together
- Resolve merge conflicts
- Demo progress to each other
- Plan next sprint

---

## 📂 Project Structure

```
the-traitors-game/
├── backend/                                    (Spring Boot Application)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/traitors/
│   │   │   │   ├── TraitorsGameApplication.java
│   │   │   │   ├── config/
│   │   │   │   │   ├── SecurityConfig.java          [Person 1]
│   │   │   │   │   └── WebSocketConfig.java         [Person 1]
│   │   │   │   ├── controller/
│   │   │   │   │   ├── AuthController.java          [Person 1]
│   │   │   │   │   ├── UserController.java          [Person 1]
│   │   │   │   │   ├── RoomController.java          [Person 1]
│   │   │   │   │   ├── GameController.java          [Person 2]
│   │   │   │   │   ├── VoteController.java          [Person 2]
│   │   │   │   │   ├── ChallengeController.java     [Person 3]
│   │   │   │   │   └── ChatController.java          [Person 3]
│   │   │   │   ├── entity/
│   │   │   │   │   ├── User.java                    [Person 1]
│   │   │   │   │   ├── Room.java                    [Person 1]
│   │   │   │   │   ├── Game.java                    [Person 2]
│   │   │   │   │   ├── GamePlayer.java              [Person 2]
│   │   │   │   │   ├── Vote.java                    [Person 2]
│   │   │   │   │   ├── Challenge.java               [Person 3]
│   │   │   │   │   ├── Label.java                   [Person 2]
│   │   │   │   │   └── ChatMessage.java             [Person 3]
│   │   │   │   ├── repository/
│   │   │   │   │   ├── UserRepository.java          [Person 1]
│   │   │   │   │   ├── RoomRepository.java          [Person 1]
│   │   │   │   │   ├── GameRepository.java          [Person 2]
│   │   │   │   │   ├── VoteRepository.java          [Person 2]
│   │   │   │   │   ├── ChallengeRepository.java     [Person 3]
│   │   │   │   │   └── ChatMessageRepository.java   [Person 3]
│   │   │   │   ├── service/
│   │   │   │   │   ├── AuthService.java             [Person 1]
│   │   │   │   │   ├── RoomService.java             [Person 1]
│   │   │   │   │   ├── GameService.java             [Person 2]
│   │   │   │   │   ├── VoteService.java             [Person 2]
│   │   │   │   │   ├── ChallengeService.java        [Person 3]
│   │   │   │   │   └── ChatService.java             [Person 3]
│   │   │   │   ├── dto/
│   │   │   │   │   ├── LoginRequest.java            [Everyone]
│   │   │   │   │   ├── AuthResponse.java            [Everyone]
│   │   │   │   │   ├── RoomDTO.java                 [Everyone]
│   │   │   │   │   ├── GameStateDTO.java            [Everyone]
│   │   │   │   │   └── ...                          [Everyone]
│   │   │   │   ├── security/
│   │   │   │   │   ├── JwtTokenProvider.java        [Person 1]
│   │   │   │   │   └── JwtAuthenticationFilter.java [Person 1]
│   │   │   │   └── websocket/
│   │   │   │       ├── GameWebSocketHandler.java    [Person 2]
│   │   │   │       └── ChatWebSocketHandler.java    [Person 3]
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── static/                          (Serve frontend files)
│   │   └── test/                                    (JUnit tests)
│   ├── pom.xml or build.gradle
│   └── README.md
│
├── frontend/                                    (Vanilla HTML/CSS/JS)
│   ├── index.html                               (Landing page)
│   ├── pages/
│   │   ├── login.html                           [Person 1]
│   │   ├── register.html                        [Person 1]
│   │   ├── profile.html                         [Person 1]
│   │   ├── lobby.html                           [Person 1]
│   │   └── game.html                            [Person 2]
│   ├── css/
│   │   ├── styles.css                           (Global styles)
│   │   ├── auth.css                             [Person 1]
│   │   ├── lobby.css                            [Person 1]
│   │   ├── game.css                             [Person 2]
│   │   ├── challenges.css                       [Person 3]
│   │   └── chat.css                             [Person 3]
│   ├── js/
│   │   ├── utils/
│   │   │   ├── api.js                           (Fetch wrapper) [Everyone]
│   │   │   ├── websocket.js                     (STOMP setup) [Person 1]
│   │   │   └── auth.js                          (JWT handling) [Person 1]
│   │   ├── auth/
│   │   │   ├── login.js                         [Person 1]
│   │   │   └── register.js                      [Person 1]
│   │   ├── lobby/
│   │   │   ├── roomList.js                      [Person 1]
│   │   │   └── waitingRoom.js                   [Person 1]
│   │   ├── game/
│   │   │   ├── gameState.js                     [Person 2]
│   │   │   ├── phaseManager.js                  [Person 2]
│   │   │   └── endGame.js                       [Person 2]
│   │   ├── challenges/
│   │   │   ├── challengeManager.js              [Person 3]
│   │   │   └── miniGames.js                     [Person 3]
│   │   ├── voting/
│   │   │   └── votingUI.js                      [Person 3]
│   │   └── chat/
│   │       ├── chatManager.js                   [Person 3]
│   │       └── voiceChat.js                     [Person 3]
│   └── assets/
│       ├── images/
│       └── sounds/
│
├── docs/
│   ├── scrum-framework.md
│   ├── task-division.md
│   └── API.md                                   (API documentation)
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

## 🔧 Suggested Dependencies & Libraries

### **Backend (Maven/Gradle)**
```xml
<!-- Spring Boot Starters -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- Database -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>

<!-- JWT -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>

<!-- Testing -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

### **Frontend (Vanilla JS + CDN/npm)**
```javascript
// STOMP.js for WebSocket (via CDN)
<script src="https://cdn.jsdelivr.net/npm/@stomp/stompjs@7.0.0/bundles/stomp.umd.min.js"></script>

// SockJS (fallback for WebSocket)
<script src="https://cdn.jsdelivr.net/npm/sockjs-client@1.6.1/dist/sockjs.min.js"></script>

// Optional: Simple-peer for WebRTC voice chat
<script src="https://unpkg.com/simple-peer@9.11.1/simplepeer.min.js"></script>
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
- [ ] Initialize Spring Boot project (use Spring Initializr)
- [ ] Create frontend folder structure (HTML/CSS/JS)
- [ ] Set up PostgreSQL database (local instance)
- [ ] Define shared DTOs in `/dto/` package
- [ ] Configure application.properties (DB, JWT, WebSocket)
- [ ] First successful connection (backend REST API + frontend fetch)

### **Person 1 First Tasks**
- [ ] Spring Boot server running on port 8080
- [ ] Database connection working (test with H2 or PostgreSQL)
- [ ] Basic auth REST endpoints (POST /api/auth/register, /api/auth/login)
- [ ] JWT token generation with Spring Security
- [ ] Login page in vanilla HTML/CSS/JS with fetch API

### **Person 2 First Tasks**
- [ ] Game entity and DTOs defined
- [ ] Basic game service methods (createGame, startGame)
- [ ] Phase transition logic (skeleton in GameService)
- [ ] game.html page layout with CSS

### **Person 3 First Tasks**
- [ ] WebSocket/STOMP chat implementation
- [ ] Chat UI component (chatManager.js)
- [ ] Basic voting interface (votingUI.js)
- [ ] Vote submission working (POST /api/votes/submit)

---

## 🎮 Good Luck, Team!

Remember:
- Start simple, add complexity gradually
- Communication is key
- Help each other when blocked
- Celebrate small wins
- Have fun building this!

**First milestone:** Get 5 people in a room and change from Day to Night phase! 🌙