# The Traitors Game - Backend

Spring Boot backend for The Traitors multiplayer game.

## Tech Stack

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Security** (JWT authentication)
- **Spring Data JPA** (Hibernate)
- **WebSocket** (STOMP protocol)
- **PostgreSQL** (production) / **H2** (development)
- **Maven**

## Project Structure

```
backend/
├── src/main/java/com/traitors/
│   ├── TraitorsGameApplication.java
│   ├── config/          # Security, WebSocket configuration
│   ├── controller/      # REST controllers
│   ├── entity/          # JPA entities
│   ├── repository/      # Spring Data repositories
│   ├── service/         # Business logic
│   ├── dto/             # Data Transfer Objects
│   ├── security/        # JWT utilities
│   └── websocket/       # WebSocket handlers
├── src/main/resources/
│   ├── application.properties
│   └── static/          # Frontend files (optional)
└── pom.xml
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- PostgreSQL (optional for production)

### Running the Application

1. Clone the repository
2. Navigate to the backend directory
3. Run the application:

```bash
mvn spring-boot:run
```

The server will start at `http://localhost:8080`

### H2 Console (Development)

Access the H2 database console at: `http://localhost:8080/h2-console`

- JDBC URL: `jdbc:h2:mem:traitorsdb`
- Username: `sa`
- Password: (leave empty)

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - Login user

### Users
- `GET /api/users/profile` - Get current user profile
- `PUT /api/users/profile` - Update user profile

### Rooms
- `GET /api/rooms` - List all available rooms
- `POST /api/rooms` - Create new room
- `POST /api/rooms/{id}/join` - Join a room
- `POST /api/rooms/{id}/leave` - Leave a room

### Game
- `POST /api/games/{id}/start` - Start game
- `GET /api/games/{id}/state` - Get game state
- `POST /api/games/{id}/votes` - Submit vote

### WebSocket Endpoints
- `/ws` - WebSocket connection
- `/topic/game/{gameId}` - Game state updates
- `/topic/chat/{roomId}` - Chat messages

## Configuration

Edit `application.properties` to configure:
- Database connection
- JWT secret key
- CORS origins
- WebSocket settings

## Development

### Running Tests

```bash
mvn test
```

### Building for Production

```bash
mvn clean package
java -jar target/traitors-game-0.0.1-SNAPSHOT.jar
```

## Team Members

- **Person 1:** Authentication & Lobby System
- **Person 2:** Game Logic & Phase Management
- **Person 3:** Challenges, Voting & Communication

See `docs/task-division.md` for detailed responsibilities.
