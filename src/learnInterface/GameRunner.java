package learnInterface;

public class GameRunner {
    public static void main(String[] args) {
        // 콘솔에 어떤 칩을 꽂냐에 따라서 결과가 달라짐(다형성)
        GamingConsole marioGame = new MarioGame();
        GamingConsole chessGame = new ChessGame();

        // git 연습용 주석
        marioGame.up(); // Jump
        marioGame.down(); // Goes into a hole
        marioGame.right(); // Go Forward
    }

}
