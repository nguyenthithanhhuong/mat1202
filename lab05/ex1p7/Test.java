package lab05.ex1p7;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball(18, 12, 0);
        Player player = new Player(18, 12,0 );
        System.out.println("Ball before kick(): " + ball.toString());
        player.kick(ball);
        System.out.println("Ball after kick(): " + ball.toString());
    }
}
