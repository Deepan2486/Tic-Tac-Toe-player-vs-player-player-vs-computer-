import java.util.*;
class TicTacToe
{
    public static void main( String args[] )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("WELCOME TO THE GAME ! ");
        System.out.println("Enter 1 for player vs. player.");
        System.out.println("Enter 2 for player vs. Computer.");
        int choice=sc.nextInt();
        
        play game=new play(); //OBJECT CREATION
        int row;
        int col;
        
        switch (choice)
        {
       
            case 1: //CASE 1 FOR PLAYER VS. PLAYER
            System.out.println("Starting the game. Player 1 = O and Player 2 = X !");
            System.out.println("For each input, enter row and coloumn (limit: 0-2) as SPACE SEPARATED entry.");
            System.out.println("____________________________________________________");
            
            while(game.entries< 9)
            {
                System.out.println();
                System.out.println("Player 1's turn!");
                game.print();
                System.out.println("Enter (row, coloumn) for O ?");
                row=sc.nextInt();
                col=sc.nextInt();
                
                if(game.board[row][col]==' ')
                {game.board[row][col]='O'; game.entries++; }
                else
                System.out.println("Place already taken!");
                
                if(game.Winner('O')==true)
                {
                    System.out.println();
                    game.print();
                    System.out.println("Player 1 won !!");
                    return;
                }
                else if(game.entries>=9)
                break;
                
                System.out.println();
                System.out.println("Player 2's turn!");
                game.print();
                System.out.println("Enter (row, coloumn) for X ?");
                row=sc.nextInt();
                col=sc.nextInt();
                
                if(game.board[row][col]==' ')
                {game.board[row][col]='X'; game.entries++;}
                else
                System.out.println("Place already taken!");
                
                if(game.Winner('X')==true)
                {
                    System.out.println();
                    game.print();
                    System.out.println("Player 2 won !!");
                    return;
                }
                
                
            }
            
            if(game.entries==9)
            {
                System.out.println();
                game.print();
                System.out.println("The game is a draw!");
            }
            break;
            
            
            case 2: //CASE 2 STANDS FOR PLAYER VS. COMPUTER
            System.out.println("Starting the game. Player = X and Computer = O");
            System.out.println("For each input, enter row and coloumn (limit: 0-2) as SPACE SEPARATED entry.");
            System.out.println("____________________________________________________");
            
            while(game.entries< 9)
            {
                System.out.println();
                System.out.println("Player 1's turn!");
                game.print();
                System.out.println("Enter (row, coloumn) for X ?");
                row=sc.nextInt();
                col=sc.nextInt();
                
                if(game.board[row][col]==' ')
                {game.board[row][col]='X'; game.entries++;}
                else
                System.out.println("Place already taken!");
                
                if(game.Winner('X')==true)
                {
                    System.out.println();
                    game.print();
                    System.out.println("Player 1 won !!");
                    return;
                }
                else if(game.entries>=9)
                break;
                
                System.out.println();
                System.out.println("Computer is giving its turn....");
                game.computerNextMove(); //INVOKING FUNCTION THAT WILL GIVE THE TURN OF COMPUTER
                game.entries++;
                
                
                if(game.Winner('O')==true)
                {
                    System.out.println();
                    game.print();
                    System.out.println("Computer won!!");
                    return;
                }
                
            }
                
            if(game.entries==9)
            {
                System.out.println();
                game.print();
                System.out.println("The game is a draw!");
            }
            break;
            
            default:
            System.out.println("Please enter either choice 1 or 2.");
    }
  }
}

   