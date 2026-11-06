package game;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void startGameRound() {
        // create board
        // startGameLoop()
    }

    public static void startGameLoop() {
        // while (gameNotOver)
        //   playerTurn
        //   botTurn
        //   checkGameState (X_WON, 0_WON, DRAW, GAME_NOT_OVER)

    }

    public static void makePlayerTurn() {
        // get input
        // validate input
        // place X on board
    }

    public static void makeBotTurn() {
        // get random empty cell
        // place 0 on board
    }

    public static void checkGameState() {
        // X = 1, 0 = -1, empty = 0
        // count sums for rows, columns, diagonals

        // if sum.contains(3) -> X_WON
        // if sum.contains(-3) -> 0_WON
        // if allCellsTaken() -> DRAW
        // else -> GAME_NOT_OVER


    }
}
