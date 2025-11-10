# 🚀 Getting Started with The Traitors Game

Welcome to The Traitors Game development! This guide will help you get set up quickly.

## 📋 Prerequisites

Before you begin, ensure you have:

- **Java 17+** (check with `java -version`)
- **Maven 3.6+** (check with `mvn -version`)
- **PostgreSQL** (optional, H2 is used for development)
- **Git** for version control
- **A modern web browser** (Chrome, Firefox, Safari, Edge)
- **VS Code** or **IntelliJ IDEA** (recommended IDEs)

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot 3.2.0
- Spring Security (JWT)
- Spring Data JPA (Hibernate)
- WebSocket (STOMP protocol)
- PostgreSQL / H2 Database
- Maven

### Frontend
- HTML5
- CSS3 (Grid, Flexbox, Animations)
- Vanilla JavaScript (ES6+)
- Fetch API
- STOMP.js (WebSocket)
- WebRTC (Voice chat)

## 📂 Project Structure

```
the-traitors-game/
├── backend/                 # Spring Boot backend
│   ├── src/main/java/com/traitors/
│   │   ├── TraitorsGameApplication.java
│   │   ├── config/         # Security & WebSocket config
│   │   ├── controller/     # REST controllers
│   │   ├── entity/         # JPA entities
│   │   ├── repository/     # Spring Data repos
│   │   ├── service/        # Business logic
│   │   ├── dto/            # Data Transfer Objects
│   │   ├── security/       # JWT utilities
│   │   └── websocket/      # WebSocket handlers
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
│
├── frontend/               # Vanilla HTML/CSS/JS frontend
│   ├── index.html
│   ├── pages/             # HTML pages
│   ├── css/               # Stylesheets
│   ├── js/                # JavaScript modules
│   └── assets/            # Images, sounds
│
├── docs/                  # Documentation
│   ├── scrum-framework.md
│   ├── task-division.md
│   └── GETTING_STARTED.md
│
└── README.md
```

## 🎯 Quick Start

### 1. Clone the Repository

```bash
git clone <your-repo-url>
cd the-traitors-game
```

### 2. Start the Backend

```bash
cd backend
mvn spring-boot:run
```

The backend server will start at `http://localhost:8080`

Access H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:traitorsdb`
- Username: `sa`
- Password: (empty)

### 3. Start the Frontend

**Option A: Using VS Code Live Server**
1. Install "Live Server" extension
2. Right-click `frontend/index.html`
3. Select "Open with Live Server"

**Option B: Using Python HTTP Server**
```bash
cd frontend
python -m http.server 8000
```
Then open `http://localhost:8000`

**Option C: Serve from Spring Boot**
Copy frontend files to `backend/src/main/resources/static/` and access at `http://localhost:8080`

## 👥 Team Responsibilities

### Person 1: Authentication & Lobby System
**Backend:**
- User authentication (Spring Security + JWT)
- User profile endpoints
- Room/Lobby management API
- WebSocket setup

**Frontend:**
- Login/Register pages
- User profile page
- Lobby browser
- Waiting room UI

### Person 2: Game Logic & Phase Management
**Backend:**
- Game state management
- Phase transitions (Day/Night/Voting)
- Victory condition checker
- Label system

**Frontend:**
- Main game screen
- Phase indicator UI
- Game state management
- End game screen

### Person 3: Challenges, Voting & Communication
**Backend:**
- Challenge system API
- Voting system
- Chat system (WebSocket)
- Hot seat mechanic

**Frontend:**
- Challenge UI & mini-games
- Voting interface
- Chat system
- Voice chat (WebRTC)

## 📚 Key Concepts

### Authentication Flow
1. User registers: `POST /api/auth/register`
2. User logs in: `POST /api/auth/login` → receives JWT token
3. Token stored in `localStorage`
4. Token included in subsequent requests: `Authorization: Bearer <token>`

### WebSocket Communication
```javascript
// Connect to WebSocket
const stompClient = Stomp.over(() => new WebSocket('ws://localhost:8080/ws'));

stompClient.connect({}, () => {
    // Subscribe to game updates
    stompClient.subscribe('/topic/game/123', (message) => {
        const gameState = JSON.parse(message.body);
        // Update UI
    });
});
```

### API Endpoints

#### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - Login user

#### Users
- `GET /api/users/profile` - Get user profile
- `PUT /api/users/profile` - Update profile

#### Rooms
- `GET /api/rooms` - List rooms
- `POST /api/rooms` - Create room
- `POST /api/rooms/{id}/join` - Join room

#### Game
- `POST /api/games/{id}/start` - Start game
- `GET /api/games/{id}/state` - Get game state
- `POST /api/games/{id}/votes` - Submit vote

## 🔧 Configuration

### Backend Configuration (`application.properties`)

```properties
# Server
server.port=8080

# Database (H2 for development)
spring.datasource.url=jdbc:h2:mem:traitorsdb
spring.h2.console.enabled=true

# JWT
jwt.secret=your-secret-key-change-this
jwt.expiration=86400000

# CORS
cors.allowed.origins=http://localhost:3000,http://localhost:8080
```

### Frontend Configuration

Update API base URL in `js/utils/api.js`:
```javascript
const API_BASE_URL = 'http://localhost:8080';
```

## 🧪 Testing

### Backend Tests
```bash
cd backend
mvn test
```

### Frontend Testing
- Manual testing in browser
- Use browser DevTools console for debugging
- Test WebSocket connections in Network tab

## 🐛 Common Issues

### CORS Errors
**Solution:** Add your frontend origin to `cors.allowed.origins` in `application.properties`

### WebSocket Connection Failed
**Solution:**
- Check backend is running on port 8080
- Verify WebSocket URL: `ws://localhost:8080/ws`
- Check CORS settings for WebSocket

### JWT Token Expired
**Solution:** Implement token refresh or redirect to login

### Database Connection Failed
**Solution:** Ensure H2 console is enabled or PostgreSQL is running

## 📖 Next Steps

1. **Sprint 0:** Set up development environment (this guide!)
2. **Sprint 1:** Implement authentication system
3. **Sprint 2:** Build lobby system
4. **Sprint 3:** Create basic game flow
5. **Sprint 4+:** Add challenges, voice chat, polish

See `docs/scrum-framework.md` for detailed sprint planning.

## 📝 Development Workflow

### Git Workflow
```bash
# Create feature branch
git checkout -b feature/your-feature-name

# Make changes, commit
git add .
git commit -m "feat: your feature description"

# Push and create pull request
git push origin feature/your-feature-name
```

### Daily Workflow
1. Pull latest changes: `git pull origin main`
2. Start backend: `mvn spring-boot:run`
3. Start frontend: Open with Live Server
4. Make changes
5. Test locally
6. Commit and push
7. Create pull request for review

## 🎮 Ready to Build!

You're all set! Start with Sprint 0 tasks:
- [ ] Verify all team members can run the project
- [ ] Test "Hello World" endpoint
- [ ] Explore project structure
- [ ] Set up your IDE
- [ ] Create your first feature branch

For detailed task breakdown, see:
- `docs/task-division.md` - Individual responsibilities
- `docs/scrum-framework.md` - Sprint planning

**Good luck, and may the best traitor (or faithful) win! 🎭**
