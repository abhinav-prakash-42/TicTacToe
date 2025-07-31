import java.util.Scanner;

class TicTacToe{
    public static int count;
    static char[][] board;
    public TicTacToe(){
        board = new char[3][3];
        initBoard();
    }
    void initBoard(){
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                board[i][j]=' ';
            }
        }
    }
    static void dispBoard(){
        System.out.println("-------------");
        for (char[] chars : board) {
            System.out.print("| ");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(chars[j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void placeMark(int row, int col, char mark){
        if(row>=0 && row <=2 && col >= 0 && col <= 2){
            board[row][col] = mark;
        }
        else
            System.out.println("Invalid Position");

    }

    static boolean checkColWin(){
        for (int j= 0;j < 3;j++){
            if(board[0][j] !=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]){
                return true;
            }
        }
        return false;
    }

    static boolean checkRowWin(){
        for (int i= 0;i < 3;i++){
            if(board[i][0] != ' '&& board[i][0]==board[i][1] && board[i][1]==board[i][2]){
                return true;
            }
        }
        return false;
    }



    static boolean diagWin() {
        // Main diagonal check
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        // Anti-diagonal check
        return board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0];
    }

    static boolean draw(){
        return TicTacToe.count == 9;
    }
}

class HumanPlayer{
    String name;
    char mark;

    HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }
    void makeMove(){
        Scanner sc = new Scanner(System.in);
        int row,col;
        do {
            System.out.println("enter the row and col");

             row = sc.nextInt();
             col = sc.nextInt();
        }
        while(!isValidMove(row,col));
        TicTacToe.count++;
        TicTacToe.placeMark(row, col, mark);

    }
    boolean isValidMove(int row, int col){
        if(row>=0 && row<=2 && col >= 0 && col<=2){
            return (TicTacToe.board[row][col] == ' ');
        }
        return false;
    }
}


public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.dispBoard();
        HumanPlayer p1 =new HumanPlayer("Bob",'X');
        HumanPlayer p2 = new HumanPlayer("me",'O');
        HumanPlayer cp;
        cp = p1;
        while (true){
            System.out.println(cp.name + " turn");
            cp.makeMove();
            TicTacToe.dispBoard();
            if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.diagWin()){
                System.out.println(cp.name + " has won");
                return;
            }
            else{
                if(cp == p1) cp = p2;
                else cp = p1;
            }
            if(TicTacToe.draw()){
                System.out.println("Game draw");
                return;
            }
        }
    }
}
