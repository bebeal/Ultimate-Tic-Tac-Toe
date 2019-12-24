# Ultimate-Tic-Tac-Toe
A GUI made with JavaFX to play Ultimate Tic Tac Toe using a Model-View-Controller Design Pattern

# Prerequisites
Must have JRE 1.8.0 to run the .exe

# Rules
The larger 3 x 3 tic tac toe board is reffered to as the global board. The global board contains 9 local 3 x 3 tic tac toe boards. 

Initially, the first player can move anywhere. Whichever square he plays at in the local board dictates where the next player is allowed to move on the global board. That is, if the first player plays at the bottom right square in a local board, the second player is limited to placing a move in the bottom right of the global board. This pattern follows. Valid local boards are highlighted to indicate where the player is allowed to move.

Player 1 can initially move anywhere, plays at the bottom right square in a local board. Player 2 is limited to placing a move in the bottom right of the global board. 
![](1.png)

Player 2 plays at the top middle in the local board. Player 1 is limited to placing a move in top middle of the global board
![](2.png)

If the board a player gets sent to isn't valid then the player can move to any valid location.

The objective is to win 3 local boards in a row. The game ends in a tie if nobody wins the global board and there are no valid moves left.

# Built With
* Maven - Dependency Management
    * launch4j - Cross-platform Java executable wrapper
* JavaFX - GUI Library for Java

## Future Updates
* A home page screen to play/change settings in the game
* An option to play against a bot using a min/max algorithm