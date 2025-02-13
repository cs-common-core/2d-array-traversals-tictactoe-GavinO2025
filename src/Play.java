import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("Enter the row and column to play");
        TicTacToe game = new TicTacToe();
        while(!game.isGameOver()) {
            game.printBoard();
            // your code here
            System.out.println("What Row are you playing in");
            int row = scanner.nextInt();
            System.out.println("What Collum are you playing in");
            int col = scanner.nextInt();
            game.play(row -1, col -1);
            if(game.isGameOver()){
                if (game.getWinner() >0){
                    System.out.println("Player " + game.getWinner()+" Wins!" );
                }else{
                    System.out.println("Board is Full, Game Over");
                }
            }
            System.out.println();
        }
        game.printBoard();
        scanner.close();
    }
}