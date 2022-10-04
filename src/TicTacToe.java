public class TicTacToe {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        char [] [] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
    }

    public static void printGameBoard(char[] [] gameBoard) {
        for(char [] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}