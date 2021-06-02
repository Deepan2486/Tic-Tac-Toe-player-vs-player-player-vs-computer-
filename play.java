public class play
{
    char board[][]= new char[3][3];
    int entries;
    
    public play()
    {
       for(int i=0;i<3;i++) 
        {
            for(int j=0;j<3;j++)
            { 
                board[i][j]=' '; //INITIALISING ALL VALUES WITH EMPTY VALUES
            }
        } 
        entries=0;
    
    }
    
    public void print()
    {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]+ " ");
        System.out.println("------------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]+ " ");
        System.out.println("------------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]+ " ");
    }
    
    public boolean Winner(char c)
    {
        int count=0;
        
        for(int i=0;i<3;i++) //CHECKING IF THE LEFT DIAGONAL IS FULL 
        {
            for(int j=0;j<3;j++)
            {
                if(i==j && this.board[i][j]==c)
                count++;
            }
        }
        
        if(count==3)
        return true;
        count=0;
        
        for(int i=0;i<3;i++) //CHECKING IF THE RIGHT DIAGONAL IS FULL
        {
            for(int j=0;j<3;j++)
            {
                if(i+j==2 && this.board[i][j]==c)
                count++;
            }
        }
        
        if(count==3)
        return true;
        count=0;
        
        //CHECKING IF ANY ROW IS FULL
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(this.board[i][j]==c)
                count++;
            }
            
            if(count==3)
            return true;
            count=0;
        }
        count=0;
        
        //CHECKING IF COLOUMN ROW IS FULL
        for(int j=0;j<3;j++)
        {
            for(int i=0;i<3;i++)
            {
                if(this.board[i][j]==c)
                count++;
            }
            
            if(count==3)
            return true;
            count=0;
        }
        
        return false; //IF NO WINNING ROW/COLOUMN/DIAGONAL IS THERE, RETURNS FALSE
    }
    
    public void computerNextMove()
    {
        if(this.entries==1) //CHECKING IF THIS IS THE FIRST TURN OF COMPUTER
        {
            for(int i=0;i<3;i++)
            {
            for(int j=0;j<3;j++)
                {
                 if(board[i][j]==' ')
                 {
                  board[i][j]='O';
                  return;
                 }
                }   
           }
        }
        
         for(int i=0;i<3;i++) //CHECKING IF OPPONENT PLAYER CAN WIN IN THIS TURN. IF YES, THEN COMPUTER BLOCKS THAT LOCATION
        {
            for(int j=0;j<3;j++)
            {
                if(this.board[i][j]==' ')
                {
                    this.board[i][j]='X';
                    if(this.Winner('X')==true) //IF ONE MORE ENTRY CAN MAKE THE OPPONENT PLAYER WIN
                    {
                        this.board[i][j]='O'; //COMPUTER BLOCKING THE LOCATION
                        return;
                    }
                    else
                    this.board[i][j]=' ';
                
                }
            
            }
        
        }
        
        for(int i=0;i<3;i++) //CHECKING IF COMPUTER CAN WIN IN THIS TURN. IF YES, THEN PUT WINNING ENTRY
        {
            for(int j=0;j<3;j++)
            {
                if(this.board[i][j]==' ')
                {
                    this.board[i][j]='O';
                    if(this.Winner('O')==true) //IF ONE MORE ENTRY CAN MAKE COMPUTER WIN
                    return;
                    else
                    this.board[i][j]=' ';
                
                }
            
            }
        
        }
        
        
         for( int i=0;i<3;i++) //FILLING ADJACENT ENTRY OF 'O' IF EMPTY
         {
             for(int j=0;j<3;j++)
             {
                 if(board[i][j]=='O') //FOUND ONE ENTRY
                 {
                    
                     if(i+1<3 && board[i+1][j]==' ' ) //CHECKING IF ANY CONVINIENT ADJACENT ENTRY IS FULL OR NOT
                    {board[i+1][j]='O';return;}
                    
                    else if(j+1<3 && board[i][j+1]==' ' )
                    {board[i][j+1]='O'; return;}
                    
                    else if(j-1>=0 && board[i][j-1]==' ')
                    {board[i][j-1]='O';return;}
                    
                    else if(i-1>=0 && board[i-1][j]==' ')
                    {board[i-1][j]='O';return;}
                    
                    else if(i+1<3 && j+1<3 && board[i+1][j+1]==' ' )
                    {board[i+1][j+1]='O';return;}
                    
                    else if(i-1>=0 && j-1>=0 && board[i-1][j-1]==' ' )
                    {board[i-1][j-1]='O';return;}
                    
                    else if( i-1>=0 && j+1<3 && board[i-1][j+1]==' ')
                    {board[i-1][j+1]='O';return;}
                    
                    else if(i+1<3 && j-1>=0 && board[i+1][j-1]==' ')
                    {board[i+1][j-1]='O';return;}
                    
                 }
                    
            
             }
                
         
        }
         
         
    }
        
}
