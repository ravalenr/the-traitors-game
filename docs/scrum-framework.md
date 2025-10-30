# 🎯 AGILE SCRUM FRAMEWORK
## The Traitors Game - 3-Person Team

---

## 📖 Scrum Basics (Simplified for 3 People)

### **What is Scrum?**
Agile framework that breaks work into short cycles (Sprints) with regular check-ins, demos, and improvements.

### **Key Roles (Adapted for 3-Person Team)**
- **Product Owner** - Decides WHAT to build and prioritizes features (rotate this role or share it)
- **Scrum Master** - Keeps team on track, removes blockers (rotate each sprint)
- **Developers** - Everyone! All 3 of you build the game

**For your team:** Rotate roles each sprint so everyone learns leadership and project management.

---

## 🏃 Sprint Structure

### **Sprint Duration: 2 Weeks**
Perfect balance for students - enough time to build features, not too long to lose momentum.

### **Sprint Timeline Example**
```
Week 1:
Monday    - Sprint Planning (1-2 hours)
Daily     - Daily Standup (15 min, same time each day)
Friday    - Mid-sprint check-in (30 min)

Week 2:
Monday    - Daily Standup
Wednesday - Daily Standup
Friday    - Sprint Review (1 hour)
Friday    - Sprint Retrospective (30 min)
          - Sprint Planning for next sprint (1 hour)
```

---

## 🗓️ Scrum Ceremonies

### **1. Sprint Planning (Start of Each Sprint)**
**Duration:** 1-2 hours  
**When:** First day of sprint  
**Who:** All 3 team members

**Agenda:**
1. Review Product Backlog
2. Select User Stories for this sprint
3. Break stories into tasks
4. Assign tasks to people
5. Set Sprint Goal

**Example Sprint Goal:** "Complete basic lobby system and player authentication"

**Output:**
- Sprint Backlog (selected user stories + tasks)
- Everyone knows what they're building
- Task assignments clear

---

### **2. Daily Standup**
**Duration:** 15 minutes MAX  
**When:** Same time every day (e.g., 10am or 7pm on Discord)  
**Who:** All 3 team members

**Each person answers 3 questions:**
1. What did I complete yesterday?
2. What will I work on today?
3. Any blockers/issues?

**Rules:**
- Keep it short and focused
- Don't solve problems here - flag them and solve later
- Use async standup if schedules don't align (post in Discord/Slack)

**Example:**
> **Person 1:** Yesterday I finished login API. Today I'm working on JWT tokens. No blockers.
>
> **Person 2:** Finished game state types. Today starting phase transitions. Need help understanding WebSocket events.
>
> **Person 3:** Chat UI is done. Today adding voice chat library. No blockers.

---

### **3. Sprint Review (End of Sprint)**
**Duration:** 1 hour  
**When:** Last day of sprint  
**Who:** All 3 team members (+ friends to demo to!)

**Agenda:**
1. Demo what you built (working features only!)
2. Each person shows their work
3. Test it together
4. Discuss what worked / what didn't
5. Get feedback from testers if available

**Goal:** Show off progress and celebrate wins! 🎉

---

### **4. Sprint Retrospective (After Review)**
**Duration:** 30 minutes  
**When:** Right after Sprint Review  
**Who:** All 3 team members

**Three questions:**
1. What went well?
2. What didn't go well?
3. What will we improve next sprint?

**Example:**
```
WENT WELL:
- Good communication in Discord
- Hit our sprint goal!
- Code reviews helped catch bugs

DIDN'T GO WELL:
- Merge conflicts were messy
- Underestimated task complexity
- Missed 2 standups

IMPROVE NEXT SPRINT:
- Better git branch strategy
- Break tasks into smaller pieces
- Set standup reminder bot
```

---

## 📋 Product Backlog (Prioritized Features)

### **Epic 1: User Authentication & Profiles**
- [ ] As a player, I can create an account so I can save my progress
- [ ] As a player, I can log in so I can access my profile
- [ ] As a player, I can view my stats so I can track my performance
- [ ] As a player, I can see labels I've earned so I can show my reputation

### **Epic 2: Lobby & Room Management**
- [ ] As a player, I can create a game room so friends can join
- [ ] As a player, I can browse available rooms so I can find games
- [ ] As a player, I can join a room so I can play with others
- [ ] As a host, I can start the game when enough players are ready
- [ ] As a player, I can chat in the lobby while waiting

### **Epic 3: Core Game Mechanics**
- [ ] As a player, I am randomly assigned as Faithful or Traitor at game start
- [ ] As a player, I can see which phase it is (Day/Night) so I know what's happening
- [ ] As a Traitor, I can secretly see other Traitors so we can coordinate
- [ ] As a Traitor, I can vote to murder a Faithful at night
- [ ] As a player, I see who was murdered at the start of each day

### **Epic 4: Day Phase - Challenges**
- [ ] As a player, I can participate in team challenges to earn XP
- [ ] As a player, I can see the XP pot growing as we complete challenges
- [ ] As a player, I can see challenge instructions clearly
- [ ] As a player, I can complete different challenge types (reflex, puzzle, teamwork)

### **Epic 5: Day Phase - Discussion & Voting**
- [ ] As a player, I can chat with everyone during the day to discuss suspicions
- [ ] As a player, I can publicly declare who I plan to vote for
- [ ] As a player, I can vote to banish someone I suspect is a Traitor
- [ ] As a player, I can see voting results and who got banished
- [ ] As a player, I can see if the banished player was Traitor or Faithful

### **Epic 6: Hot Seat Mechanic**
- [ ] As a player, I am randomly selected for the hot seat each round
- [ ] As a player not in hot seat, I can submit questions quickly
- [ ] As a hot seat player, I must answer questions within time limit
- [ ] As a player, I can see the hot seat timer counting down

### **Epic 7: Label System**
- [ ] As a player, I can label others as (liar, clever, smart, cheeky, bold) during the day
- [ ] As a player, I can see labels I've received
- [ ] As a player, labels I earn are saved to my profile stats

### **Epic 8: Voice Communication**
- [ ] As a player, I can enable voice chat during day phase
- [ ] As a player, I can mute/unmute my microphone
- [ ] As a player, I can see who is currently speaking
- [ ] As a Traitor, I can use voice chat only with other Traitors at night

### **Epic 9: Victory & End Game**
- [ ] As a player, I can see when the game ends (3 players remaining)
- [ ] As a winner, I can see my XP reward
- [ ] As a player, I can see end-game statistics (who was who, key moments)
- [ ] As a player, I can see MVP and labels awarded

### **Epic 10: Polish & UX**
- [ ] As a player, I see smooth animations between phases
- [ ] As a player, I hear sound effects for key moments (murder, banishment)
- [ ] As a player, the UI is responsive and works on different screen sizes
- [ ] As a player, I can reconnect if I disconnect mid-game

---

## 📝 User Story Template

```
As a [type of user],
I want [goal/desire],
So that [benefit/reason].

Acceptance Criteria:
- [ ] Specific testable condition
- [ ] Another condition
- [ ] Another condition

Definition of Done:
- [ ] Code written and tested
- [ ] Code reviewed by teammate
- [ ] Merged to main branch
- [ ] Feature works in deployed environment
```

**Example:**
```
As a player,
I want to vote to banish someone,
So that I can eliminate suspected Traitors.

Acceptance Criteria:
- [ ] Voting UI shows all alive players
- [ ] I can select one player to vote for
- [ ] My vote is submitted to the backend
- [ ] I cannot change vote after submitting
- [ ] Voting results are shown after everyone votes

Definition of Done:
- [x] Voting component created
- [x] Vote API endpoint working
- [x] Vote stored in database
- [x] Code reviewed by Person 2
- [x] Merged to main
- [x] Tested with 5 players
```

---

## 🎯 Suggested Sprint Breakdown

### **Sprint 0: Setup (1 week)**
**Sprint Goal:** Development environment ready, basic project structure

**Tasks:**
- [ ] Set up GitHub repository
- [ ] Initialize backend (Express + TypeScript + PostgreSQL)
- [ ] Initialize frontend (React + TypeScript + Vite)
- [ ] Connect frontend to backend (test API call)
- [ ] Set up CI/CD basics (optional)
- [ ] Define shared TypeScript types

**Definition of Done:** All 3 devs can run project locally and see "Hello World"

---

### **Sprint 1: Authentication (2 weeks)**
**Sprint Goal:** Players can register, login, and view profile

**User Stories:**
- Create account
- Login
- View profile

**Tasks:**
- Backend: User model, auth endpoints, JWT
- Frontend: Login page, register page, protected routes
- Integration: Auth context, token storage

**Demo:** Create account → Login → See profile page

---

### **Sprint 2: Lobby System (2 weeks)**
**Sprint Goal:** Players can create and join game rooms

**User Stories:**
- Create room
- Join room
- See players in room
- Basic lobby chat

**Tasks:**
- Backend: Room management, WebSocket setup
- Frontend: Lobby browser, room creation, waiting room
- Integration: Real-time player updates

**Demo:** 3 people join same room and see each other

---

### **Sprint 3: Basic Game Flow (2 weeks)**
**Sprint Goal:** Complete one game loop (Day → Night → Voting)

**User Stories:**
- Assign roles at game start
- Day phase with timer
- Night phase (Traitor murder)
- Basic voting

**Tasks:**
- Backend: Game state machine, phase transitions, voting logic
- Frontend: Game screen, phase UI, basic voting interface
- Integration: WebSocket game events

**Demo:** 5 people play a full round (Day → Night → Vote → Next Day)

---

### **Sprint 4: Challenges (2 weeks)**
**Sprint Goal:** One interactive challenge type working

**User Stories:**
- Complete team challenge
- Earn XP for pot

**Tasks:**
- Backend: Challenge system, XP calculation
- Frontend: Challenge UI, one mini-game
- Integration: Challenge results submission

**Demo:** Complete a challenge and watch XP increase

---

### **Sprint 5: Enhanced Voting + Hot Seat (2 weeks)**
**Sprint Goal:** Full voting mechanics and hot seat pressure

**User Stories:**
- Pre-vote declaration
- Hot seat Q&A
- Vote results with animation

**Tasks:**
- Backend: Pre-vote tracking, hot seat system
- Frontend: Voting UI polish, hot seat interface
- Integration: Real-time hot seat coordination

**Demo:** Experience hot seat → vote with pressure

---

### **Sprint 6: Voice Chat + Labels (2 weeks)**
**Sprint Goal:** Voice communication and player labeling

**User Stories:**
- Enable voice chat
- Label other players
- See labels on profiles

**Tasks:**
- Backend: Label system API, WebRTC signaling
- Frontend: Voice controls, label UI
- Integration: Voice connections, label display

**Demo:** Talk with voice and label suspicious players

---

### **Sprint 7: Victory System + Stats (2 weeks)**
**Sprint Goal:** End game properly with stats and rewards

**User Stories:**
- Game ends at 3 players
- See victory/defeat
- View match statistics

**Tasks:**
- Backend: Victory detection, XP distribution, stats tracking
- Frontend: End game screen, stats display
- Integration: Match history saved

**Demo:** Play full game to completion and see stats

---

### **Sprint 8+: Polish & Additional Features**
**Sprint Goal:** Add more challenge types, animations, bug fixes

**Ongoing:**
- More challenge types
- Sound effects
- UI animations
- Mobile responsiveness
- Bug fixes from testing

---

## 🛠️ Tools for Your Team

### **Project Management (Pick One)**
**Free Options:**
- **Trello** - Simple Kanban board (easiest)
- **Jira** - Professional Scrum tools (free for small teams)
- **GitHub Projects** - Integrated with your repo
- **Notion** - Flexible, good for docs + tasks

**Recommended:** Start with Trello or GitHub Projects

### **Communication**
- **Discord** - Voice + text channels
- **Slack** - More professional (free tier works)

### **Version Control**
- **GitHub** - Code repository + project board
- **Git branching strategy:**
    - `main` - production ready
    - `develop` - integration branch
    - `feature/feature-name` - individual features

### **Documentation**
- **Notion** - Team wiki
- **Google Docs** - Quick collaborative docs
- **README.md** - In your GitHub repo

---

## 📊 Tracking Progress

### **Sprint Burndown Chart** (Optional but helpful)
Track how many story points or tasks are left each day.

**Simple version:**
- Day 1: 20 tasks remaining
- Day 5: 15 tasks remaining
- Day 10: 8 tasks remaining
- Day 14: 0 tasks remaining ✅

### **Velocity Tracking**
Track how many story points you complete per sprint. Helps predict future sprints.

**Example:**
- Sprint 1: 13 points completed
- Sprint 2: 15 points completed
- Sprint 3: 18 points completed (getting faster!)

---

## 🎯 Definition of Done (Team Agreement)

A feature is DONE when:
- [ ] Code is written and follows team standards
- [ ] Code is tested (manual testing at minimum)
- [ ] Code is reviewed by at least 1 teammate
- [ ] Code is merged to main branch (no conflicts)
- [ ] Feature works on deployed version (if deployed)
- [ ] Documentation updated if needed

**Agree on this as a team at Sprint 0!**

---

## 💡 Scrum Tips for Student Teams

### **1. Keep Ceremonies Short**
Don't spend 2 hours in daily standup. 15 min MAX.

### **2. Use Async When Needed**
Can't all meet? Post standup updates in Discord:
```
📅 Daily Standup - Oct 30
🟢 @Person1: ✅ Login API done | 🚧 Working on JWT | ❌ No blockers
🟢 @Person2: ✅ Game state types | 🚧 Phase transitions | ⚠️ Need WebSocket help
🟢 @Person3: ✅ Chat UI | 🚧 Voice chat | ❌ No blockers
```

### **3. Demo Early, Demo Often**
Show features as soon as they work, even if ugly. Catching issues early = less rework.

### **4. Celebrate Wins**
Finished a sprint goal? Order pizza. Shipped authentication? High fives all around.

### **5. Don't Over-Engineer**
Start simple. Get it working. Then make it pretty.

### **6. It's Okay to Fail Tasks**
Didn't finish everything? That's FINE. Move incomplete stories to next sprint. Adjust estimates.

### **7. Rotate Roles**
Everyone should experience being Scrum Master. Builds leadership skills.

---

## 📋 Sprint Planning Template

```markdown
# Sprint [Number] Planning
**Dates:** [Start Date] - [End Date]
**Sprint Goal:** [One sentence goal]

## Team Capacity
- Person 1: [hours available this sprint]
- Person 2: [hours available this sprint]  
- Person 3: [hours available this sprint]

## Sprint Backlog

### User Story 1: [Title]
**Priority:** High/Medium/Low
**Story Points:** [1-8]
**Assigned to:** Person X

**Tasks:**
- [ ] Task 1 [Person X] - [estimated hours]
- [ ] Task 2 [Person Y] - [estimated hours]

### User Story 2: [Title]
...

## Definition of Done
- Code written
- Code reviewed
- Merged to main
- Feature tested

## Risks/Concerns
- [Any concerns about the sprint]
```

---

## 🔄 Example Sprint in Action

### **Sprint 3: Basic Game Flow**

**Monday (Sprint Planning):**
- Selected 3 user stories
- Broke into 15 tasks
- Everyone picks their tasks
- Sprint goal set

**Tuesday-Thursday (Daily Work):**
- Daily standups at 10am
- Person 1 works on game state
- Person 2 works on phase UI
- Person 3 works on voting backend
- Help each other when stuck

**Friday Week 1 (Mid-Sprint Check):**
- Quick demo of progress
- Game state working!
- Phase UI 50% done
- Voting needs more work

**Monday-Thursday Week 2 (Sprint to Finish):**
- Final push
- Code reviews happening
- Integration testing

**Friday Week 2 (Sprint Review & Retro):**
- **Demo:** 5 people play full round! 🎉
- **Retro:** Voting took longer than expected, adjust estimates next time
- **Planning:** Start Sprint 4 - Challenges

---

## 🚀 Getting Started with Scrum

### **Step 1: Sprint 0 Kickoff**
- [ ] All 3 teammates read this document
- [ ] Set up Trello/GitHub Projects board
- [ ] Create Discord server with channels
- [ ] Schedule recurring meeting times
- [ ] Define team working agreement

### **Step 2: First Sprint Planning**
- [ ] Review full Product Backlog together
- [ ] Pick stories for Sprint 1 (Authentication)
- [ ] Break stories into tasks
- [ ] Assign tasks
- [ ] Set daily standup time

### **Step 3: Start Building!**
- [ ] Do daily standups
- [ ] Build features
- [ ] Help each other
- [ ] Have fun!

---

## 🎮 You've Got This!

Scrum seems like a lot at first, but you'll get the rhythm quickly. The key benefits:

✅ Everyone knows what they're working on
✅ Regular check-ins catch problems early
✅ Demos keep motivation high
✅ You'll actually finish the project!

**Remember:** Scrum is flexible. Adapt it to what works for your team. The goal is to help you build The Traitors game, not to follow rules perfectly.

**First action:** Create your Trello board and schedule your Sprint 0 planning meeting! 🚀

Good luck, team! May the Faithfuls win... or maybe the Traitors? 🎭