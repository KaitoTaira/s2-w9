// See Instructions:
// http://apcsa-book.ausdk12.org/apcsa/r/cur/c4/L23_2D_arrays/exercises0.html?topic=c4%2FL23_2D_arrays.topic
public class GameBoard {
    private String[][] board;
    public GameBoard(int rows, int cols){
        board = new String[rows][cols];
        for(int r = 0; r < board.length; r++){
                for(int c = 0; c < board[0].length; c++){
                    board[r][c] = ("e");
                }
            }
    }

    public void setCell(int player, int row, int col, String c){
        if(player == 0){
            board[row][col] = c;
        }
        else if (player == 1){
            board[board.length-row-1][board[0].length-col-1] = c;
        }
    }

    public void print(int player){
        if(player == 0){
            for(int r = 0; r < board.length; r++){
                for(int c = 0; c < board[0].length; c++){
                System.out.print(board[r][c]);
            }
             System.out.println("");
        }
        }
        else if(player == 1){
            for(int r = board.length-1; r >= 0; r--){
                for(int c = board[0].length-1; c >= 0; c--){
                    System.out.print(board[r][c]);
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        GameBoard g = new GameBoard(3, 5);
        g.setCell(0, 1, 1, "a");
        g.print(1);
    }
}