# The Traitors Game - Frontend

Vanilla JavaScript, HTML, and CSS frontend for The Traitors multiplayer game.

## Tech Stack

- **HTML5**
- **CSS3** (Grid, Flexbox, Animations)
- **Vanilla JavaScript** (ES6+)
- **Fetch API** (REST communication)
- **STOMP.js** (WebSocket communication)
- **WebRTC** (Voice chat)

## Project Structure

```
frontend/
├── index.html           # Landing page
├── pages/
│   ├── login.html       # Login page
│   ├── register.html    # Registration page
│   ├── profile.html     # User profile
│   ├── lobby.html       # Game lobby
│   └── game.html        # Main game screen
├── css/
│   ├── styles.css       # Global styles
│   ├── auth.css         # Authentication pages
│   ├── lobby.css        # Lobby styles
│   ├── game.css         # Game screen styles
│   ├── challenges.css   # Challenge UI styles
│   └── chat.css         # Chat UI styles
├── js/
│   ├── utils/
│   │   ├── api.js           # Fetch wrapper
│   │   ├── websocket.js     # STOMP setup
│   │   └── auth.js          # JWT handling
│   ├── auth/
│   │   ├── login.js         # Login logic
│   │   └── register.js      # Registration logic
│   ├── lobby/
│   │   ├── roomList.js      # Room browser
│   │   └── waitingRoom.js   # Waiting room UI
│   ├── game/
│   │   ├── gameState.js     # Game state management
│   │   ├── phaseManager.js  # Phase transitions
│   │   └── endGame.js       # End game screen
│   ├── challenges/
│   │   ├── challengeManager.js  # Challenge system
│   │   └── miniGames.js         # Mini-game implementations
│   ├── voting/
│   │   └── votingUI.js      # Voting interface
│   └── chat/
│       ├── chatManager.js   # Chat system
│       └── voiceChat.js     # WebRTC voice chat
└── assets/
    ├── images/
    └── sounds/
```

## Getting Started

### Prerequisites

- A modern web browser (Chrome, Firefox, Edge, Safari)
- Backend server running at `http://localhost:8080`

### Running the Frontend

#### Option 1: Using Live Server (Recommended)

1. Install Live Server extension in VS Code
2. Right-click on `index.html`
3. Select "Open with Live Server"

#### Option 2: Using Python's HTTP Server

```bash
cd frontend
python -m http.server 8000
```

Then open `http://localhost:8000` in your browser

#### Option 3: Served by Spring Boot

Copy frontend files to `backend/src/main/resources/static/` and access via `http://localhost:8080`

## Key Features

### API Communication

The frontend communicates with the backend using:
- **REST API** for HTTP requests (Fetch API)
- **WebSocket** for real-time updates (STOMP protocol)

### Authentication

JWT tokens are stored in `localStorage` and included in API requests:

```javascript
const token = localStorage.getItem('jwt_token');
fetch('/api/endpoint', {
    headers: {
        'Authorization': `Bearer ${token}`
    }
});
```

### WebSocket Connection

```javascript
const stompClient = Stomp.over(() => new WebSocket('ws://localhost:8080/ws'));
stompClient.connect({}, () => {
    stompClient.subscribe('/topic/game/123', (message) => {
        // Handle game updates
    });
});
```

### Game State Management

Game state is managed using JavaScript objects and updated in real-time via WebSocket events.

## Pages Overview

### Landing Page (`index.html`)
- Game introduction
- Links to login/register

### Authentication Pages
- `login.html` - User login
- `register.html` - New user registration

### Lobby Page (`lobby.html`)
- Browse available rooms
- Create new game room
- Join existing rooms

### Game Page (`game.html`)
- Main game interface
- Phase indicators (Day/Night)
- Player grid
- Chat interface
- Voting system
- Challenge mini-games

## Development Guidelines

### Code Style

- Use ES6+ features (arrow functions, const/let, template literals)
- Organize code into modules/functions
- Comment complex logic
- Use meaningful variable names

### Naming Conventions

- Files: `camelCase.js`
- Classes: `PascalCase`
- Functions: `camelCase()`
- Constants: `UPPER_SNAKE_CASE`

### Adding New Features

1. Create HTML structure
2. Style with CSS
3. Add JavaScript logic
4. Connect to backend API
5. Test thoroughly

## Team Members

- **Person 1:** Authentication & Lobby UI
- **Person 2:** Game UI & Phase Management
- **Person 3:** Challenges, Voting & Chat UI

See `docs/task-division.md` for detailed responsibilities.

## Browser Compatibility

Tested on:
- Chrome 90+
- Firefox 88+
- Safari 14+
- Edge 90+

## External Libraries

### STOMP.js (WebSocket)
```html
<script src="https://cdn.jsdelivr.net/npm/@stomp/stompjs@7.0.0/bundles/stomp.umd.min.js"></script>
```

### SockJS (WebSocket fallback)
```html
<script src="https://cdn.jsdelivr.net/npm/sockjs-client@1.6.1/dist/sockjs.min.js"></script>
```

### Simple-peer (WebRTC voice chat)
```html
<script src="https://unpkg.com/simple-peer@9.11.1/simplepeer.min.js"></script>
```

## Troubleshooting

### CORS Issues
Make sure backend CORS configuration allows your frontend origin.

### WebSocket Connection Failed
Check that the backend WebSocket endpoint is accessible and CORS settings are correct.

### JWT Token Expired
Implement token refresh logic or redirect to login page.
