/**
*  TicTacToe. A playable text version of TicTacToe made as a test
*  for collaboration in GitHub.
*
* @author Nguyen P, Egnew E, Wood K.
* @version 20.October.2018
*/

public class TicTacToe {

  int[][] board = new int[3][3];

  /**
  * main. entry point for text TicTacToe
  * @param args
  */
  public void main(String[] args) {
 
    
  
  }
  
  public boolean checkMove(int move, int x, int y) {
  
    if(move!=0 && x >= 0 && x < 3 && y >= 0 && y < 3 && board[y][x]==0) {
      
      return true;
    
    }
    
    return false;
  
  }

  public void updateBoard(int move, int x, int y) {
  
    board[y][x] = move;
  
  }

  public boolean checkWin() {
    boolean win = false;
          for(int row = 0; row < 3; row++)
          {
              if(board[row][0] == board[row][1] && board[row][1] == board[row][2])
              {
                  if(board[row][0] != 0)
                  {
                      win = true;
                  }
              }
          }
          for(int col = 0; col < 3; col++)
          {
              if(board[0][col] == board[1][col] && board[1][col] == board[2][col])
              {
                  if(board[0][col] != 0)
                  {
                      win = true;
                  }
              }
          }
          if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
          {
              if(board[0][0] != 0)
              {
                  win = true;
              }
          }
          if(board[0][2] == board[1][1] && board[1][1] == board[2][0])
          {
              if(board[0][2] != 0)
              {
                  win = true;
              }
          }
          return win;
  
  }

}
