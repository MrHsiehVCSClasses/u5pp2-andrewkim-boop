package u5pp;
import java.util.Scanner;

public class ChessPiece {
    ChessPiece[][] chessBoard = new ChessPiece[8][8];
    int chessRow = 0;
    int chessCol = 0;
    boolean white = false;
    public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
        chessBoard = board;
        chessRow = row;
        chessCol = col;
        white = isWhite;
    }
    //------------------------------------------------------------------------------
    public ChessPiece[][] getBoard(){
        return chessBoard;
    }
    //------------------------------------------------------------------------------
    public int getRow(){
        return chessRow;
    }
    //------------------------------------------------------------------------------
    public int getCol(){
        return chessCol;
    }
    //------------------------------------------------------------------------------
    public boolean getIsWhite(){
        return white;
    }
    //------------------------------------------------------------------------------
    public boolean canMoveTo(int row, int col){
        return true;
    }
    //------------------------------------------------------------------------------
    public void moveTo(int row, int col){
        if(this.canMoveTo(row,col)){
            chessBoard[row][col] = this;
            chessBoard[chessRow][chessCol] = null;
        }
    }
    //------------------------------------------------------------------------------
    public String toString(){
        return("balls");
    }
    public static int getIntegerInput(String prompt, int min, int max){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(prompt);
        String hold = myScanner.nextLine();
        int i = min - 1;
        while(i < min || i > max){
            System.out.println(prompt);
            System.out.println("Your input is - " + hold);
            hold = myScanner.nextLine();
            i = Integer.parseInt(hold);
        }
        myScanner.close();
        return i;
    }
}
