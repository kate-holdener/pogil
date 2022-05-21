import java.util.Scanner;

public class TicTacToe
{
   public static void main(String []args)
   {
      Scanner scanner = new Scanner(System.in);
      TicTacToeBoard board = new TicTacToeBoard();
      TicTacToePiece []playerTicTacToePieces = {TicTacToePiece.X,TicTacToePiece.O};
      int nextPlayer = 0;
      TicTacToePiece winner = null;

      while(!board.isFull())
      {
         board.autoPlace(playerTicTacToePieces[0]);
         board.showTicTacToePieces();

         winner = board.getWinner();   
         if (board.isFull() || winner != null)
         {
            break;
         }
         System.out.println("Next Player");
         board.manualMove(scanner, playerTicTacToePieces[1]);
         board.showTicTacToePieces();

         winner = board.getWinner();   
         if (board.isFull() || winner != null)
         {
            break;
         }
         System.out.println("Next Player");
      }

      if (winner != null)
      {
         System.out.println("Winner is " + winner);
      }
   }
}
