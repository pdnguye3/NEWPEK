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
    if(move!=0 && x >= 0 && x < 3 && y >= 0 && y < 3 && board[y][x]==0){
      return(true);
    }
    return(false);
 
  }

  public void updateBoard(int move, int x, int y) {
  
    board[y][x] = move;
  
  }

  public boolean checkWin() {
  
  
  
  }

}
