package learnInterface;

public class ChessGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move piece up");

    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void right() {
        System.out.println("move piece left");

    }

    @Override
    public void left() {

    }
}
