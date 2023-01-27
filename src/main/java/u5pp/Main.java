package u5pp;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ChessPiece[][] board = new ChessPiece[8][8];
        board[0][0] = new ChessPiece(board, 0, 0, true);
        board[7][0] = new ChessPiece(board, 7, 0, false);
        
    }
}