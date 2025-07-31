# Tic-Tac-Toe Console Game (Java)

This is a simple two-player Tic-Tac-Toe game implemented in Java using the console for input/output. The game logic is object-oriented and includes classes for the game board and players.

## 🧩 Features

- 2-player game (Player X and Player O)
- Input validation (prevents overwriting occupied cells or entering invalid coordinates)
- Checks for:
  - Row win
  - Column win
  - Diagonal win
  - Draw
- Board is displayed after every move

## 🚀 How to Run

1. **Clone or download this project.**

2. **Compile the program** using:
   ```bash
   javac LaunchGame.java
Run the game using:

bash
Copy
Edit
java LaunchGame
🛠️ Project Structure
bash
Copy
Edit
LaunchGame.java        # Main class that drives the game
TicTacToe.java         # Handles the board, rules, and win/draw logic
HumanPlayer.java       # Handles player move input and validation
🎮 How to Play
You'll be prompted to enter row and column values (0-based index, i.e., from 0 to 2).

Players take turns placing their marks (X or O) on the board.

The first player to align three marks in a row, column, or diagonal wins.

If all 9 cells are filled without a winner, the game ends in a draw.

📷 Sample Output
markdown
Copy
Edit
-------------
|   |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
Bob turn
Enter the row and col
0
0
-------------
| X |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
...
Bob has won!
✅ Future Enhancements
Add a Computer vs Human mode (AI)

Add GUI using Java Swing

Add a scoreboard

📚 Concepts Used
Object-Oriented Programming (Classes, Objects)

Static and Instance methods

2D Arrays

Conditionals and Loops

Scanner for user input

👨‍💻 Author
Abhinav Prakash
Built as part of Java OOPs learning project
