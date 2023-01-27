package u5pp;

public class Pawn extends ChessPiece{
    boolean hasMoved;
    public Pawn(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
        this.hasMoved = false;
    }
    public boolean canMoveTo(int row, int col){
        ChessPiece[][] board = this.getBoard();
        if(row > 7 || col > 7 || row < 0 || col < 0){
            return false;
        }
        if(this.getRow() == row && this.getCol() == col){
            return false;
        }
        if(!this.getIsWhite()){
            if(board[row][col] != null){
                if(board[row][col].getIsWhite()){
                    if(this.getRow() - 1 == row && this.getCol() - 1 == col){
                        return true;
                    }
                    if(this.getRow() - 1 == row && this.getCol() + 1 == col){
                        return true;
                    }
                }
            }
            if(board[row][col] == null){
                if(this.getRow() - 1 == row && this.getCol() == col){
                    return true;  
                }
                if(!hasMoved){
                    if(this.getRow() - 2 == row && this.getCol() == col && board[row][col] == null && board[row - 1][col] == null){
                        hasMoved = true;
                        return true;
                    }
                }
            }
        }
        else{
            if(board[row][col] != null){
                if(!board[row][col].getIsWhite()){
                    if(this.getRow() + 1 == row && this.getCol() - 1 == col){
                        return true;
                    }
                    if(this.getRow() + 1 == row && this.getCol() + 1 == col){
                        return true;
                    }
                }
            }
            if(board[row][col] == null){
                if(this.getRow() + 1 == row && this.getCol() == col){
                    return true;  
                }
                if(!hasMoved){
                    if(this.getRow() + 2 == row && this.getCol() == col && board[row][col] == null && board[row + 1][col] == null){
                        hasMoved = true;
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    //--------------------------------------------------------------------
    public String toString(){
        if(getIsWhite()){
            return("P");
        }
        else{
            return("p");
        }
    }
}
