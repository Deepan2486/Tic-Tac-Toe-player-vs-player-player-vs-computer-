README FILE:

Name: Deepan Maitra
Entry no.: 2019CSB1044

HOW TO PLAY THE GAME?

Step 1. When TicTacToe.class is invoked, a menu will be shown.
Step 2. Please input '1' for the player vs. player version, and '2' for player vs. computer version

****Player 1 vs. Player 2 version****
1. The terminal will show which player's turn it currently is, and which letter's turn (O or X) is this . It will also show the current status of the board. 
2. Looking at the current status, please input the row and coloumn where you want to put the new entry
3. Input row and coloumn as SPACE SEPARATED ENTRY, when asked. (Example: Input "2 1" for row 2 and coloumn 1)
4. The range of both rows and columns is 0-2. 
5. If you enter any location already occupied, it will display "Place already taken" and the turn will automatically move to the next player.


****Player vs. Computer version****
1. The terminal will show when the player's turn is. Player is always 'X' and player goes first. Computer is 'O'
2. Looking at the current status, please input the row and coloumn where you want to put the new entry
3. Input row and coloumn as SPACE SEPARATED ENTRY, when asked. (Example:Input "2 1" for row 2 and coloumn 1)
4. The range of both rows and columns is 0-2. 
5. After each of the player's move, it will show "Computer is giving it's turn" (Indicating the turn given by computer)
6. When player will give the next move, it will be seen that the computer has already given its convenient move prior to it. 
7. If you enter any location already occupied, it will display "Place already taken" and the turn will move to the next player, i.e, the computer again.

If in each case the game concludes in a tie, it will display the filled game board and show "The game is a draw."


EXPLANATION OF THE FILES AND CLASSES:
There are two classes. TicTacToe.java and play.java.
TicTacToe.java is the main driving program, with the main() function. It creates an object 'game' of the play.java class and uses its member methods ('game' object suggets that class 'play' can have multiple 'games' associated with it)
play.java is the class of which the objects are created. It also has all the necessary functions, which is called in TicTacToe.java to perform the operations. 


