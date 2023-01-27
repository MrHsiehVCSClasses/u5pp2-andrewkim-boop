package u5pp;

public class Knight extends ChessPiece{
    public Knight(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean knightMove(int row, int col){
        if(row == getRow() + 2){
            if(col == getCol() + 1){
                return true;
            }
            if(col == getCol() - 1){
                return true;
            }
        }
        if(row == getRow() - 2){
            if(col == getCol() + 1){
                return true;
            }
            if(col == getCol() - 1){
                return true;
            }
        }
        if(row == getRow() + 1){
            if(col == getCol() + 2){
                return true;
            }
            if(col == getCol() - 2){
                return true;
            }
        }
        if(row == getRow() + 1){
            if(col == getCol() + 2){
                return true;
            }
            if(col == getCol() - 2){
                return false;
            }
        }
        return false;
    }
    public boolean canMoveTo(int row, int col){
        ChessPiece[][] board = this.getBoard();
        if(row > 7 || col > 7 || row < 0 || col < 0){
            return false;
        }
        if(this.getRow() == row && this.getCol() == col){
            return false;
        }
        if(this.knightMove(row, col)){
            if(board[row][col] != null){
                if(this.getIsWhite() == board[row][col].getIsWhite()){
                    return false;
                }
                if(!this.getIsWhite() == !board[row][col].getIsWhite()){
                    return false;
                }
            }
            else{
                return true;
            }
        }
        return false;
    }
    public void moveTo(int row, int col){
        if(this.canMoveTo(row,col)){
            chessBoard[row][col] = this;
            chessBoard[chessRow][chessCol] = null;
        }
    }
    public String toString(){
        if(this.getIsWhite()){
            return("N");
        }
        else{
            return("n");
        }
    }
}
