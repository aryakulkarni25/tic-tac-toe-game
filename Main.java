import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      char[][] board = new char[3][3];
      for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[row].length; col++) {
          board[row][col] = ' ';
        }
      }

      char player = 'X';
      boolean gameOver = false;
      boolean gameDraw = false;

      while (!gameOver && !gameDraw) {
        printBoard(board);
        System.out.print("Player " + player + " enter: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        System.out.println();

        if (board[row][col] == ' ') {
          board[row][col] = player; // place the element
          gameOver = haveWon(board, player);
          if (gameOver) {
            System.out.println("Player " + player + " has won: ");
          } else {
            gameDraw = isDraw(board);
            if (gameDraw) {
              System.out.println("The game is a draw!");
            } else {
              player = (player == 'X') ? 'O' : 'X';
            }
          }
        } else {
          System.out.println("Invalid move. Try again!");
        }
      }

      printBoard(board);

      System.out.println("Do you want to play again? (y/n)");
      String answer = scanner.next();
      if (answer.equals("n")) {
        System.out.println("Thanks for playing!");
        break;
      }
    }
  }

  public static boolean haveWon(char[][] board, char player) {
    // check the rows
    for (int row = 0; row < board.length; row++) {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
        return true;
      }
    }

    // check for col
    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
        return true;
      }
    }

    // diagonal
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
      return true;
    }
    return false;
  }

  public static boolean isDraw(char[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        if (board[row][col] == ' ') {
          return false;
        }
      }
    }
    return true;
  }

public static void printBoard(char[][] board) {
  System.out.println("┌───┬───┬───┐");
  for (int row = 0; row < board.length; row++) {
    for (int col = 0; col < board[row].length; col++) {
      System.out.print("│ " + board[row][col] + " ");
    }
    System.out.println("│");
    if (row < 2) {
      System.out.println("├───┼───┼───┤");
    }
  }
  System.out.println("└───┴───┴───┘");
}

}

//Demonstrates programming skills: The project demonstrates your ability to write code in Java, implement logic, and create a simple game.

//Shows problem-solving abilities: Writing a game like tic-tac-toe requires problem-solving skills to determine the game's logic and implement it in code.

//Highlights attention to detail: Creating a visually appealing and user-friendly interface in HTML and CSS requires attention to detail, which is a valuable skill in many positions.

/*Project Title: Tic Tac Toe Game

Description: A Java-based implementation of the popular game Tic Tac Toe, where two players take turns marking their symbol (X or O) on a 3x3 grid until one player wins or the game ends in a draw. The program features a terminal-based user interface and includes basic functionalities such as input validation, winning conditions, and game restart.

Technologies used: Java, Git

Key skills demonstrated:

Proficiency in Java programming language
Familiarity with basic programming concepts such as loops, conditional statements, and functions
Ability to implement data structures such as arrays and multi-dimensional arrays
Familiarity with version control systems such as Git
Possible additional features to highlight:

Implementation of a graphical user interface using JavaFX or Swing
Integration of artificial intelligence algorithms to allow for single-player mode
Implementation of network capabilities to enable multiplayer mode with players on different machines. */