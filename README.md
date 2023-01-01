#Rock-Paper-Scissors Game

This is a simple rock-paper-scissors game with an Angular frontend and a Spring Boot backend.

##Prerequisites

- **[Node.js](https://nodejs.org)**
- **[Angular CLI](https://angular.io/cli)**
- **[Java Development Kit (JDK)](https://www.oracle.com/de/java/technologies/downloads/)**
- **[Maven](https://maven.apache.org/download.cgi)**

##Running the Application

1. Clone the repository:

    >git clone https://github.com/your-username/rock-paper-scissors.git

2. Go to the frontend directory:

   > cd rock-paper-scissors/frontend

3. Install the dependencies:

   > npm install

4. Build and run the frontend:

    >ng serve

The frontend will be served at ``http://localhost:4200``.

5. Go to the backend directory:

    > cd ../backend

6. Build and run the backend:

    > mvn spring-boot:run

The backend will be served at ``http://localhost:8080``.

7. Open the frontend in a web browser:

   > http://localhost:4200

##Playing the Game

1. Choose your symbol (rock, paper, or scissors) by clicking on the corresponding button.
2. The computer's symbol will be displayed.
3. The winner of the round will be displayed.
4. Play as many rounds as you like.

##Troubleshooting
- If you are having issues building or running the frontend, try running **´ng build´** followed by **´ng serve´**.
- If you are having issues building or running the backend, try running **´mvn clean package´** followed by **´mvn spring-boot:run´**.