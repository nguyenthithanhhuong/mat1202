package lab05.ex1p7;

public class Player {
    private int number;
    private float x, y, z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public void move(float xDiff, float yDiff) {
        x += xDiff;
        y += yDiff;
    }

    public void jump(float zDiff) {
        z += zDiff;
    }

    public boolean near(Ball ball) {
        double xDiff = ball.getX() - x;
        double yDiff = ball.getY() - y;
        double zDiff = ball.getZ() - z;

        double distance = Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);

        if (distance < 0) return true;
        return false;
    }

    public void kick(Ball ball) {
        int speed = 10;
        int direction = 45;
        float xDelta = (float) (speed*Math.cos(direction));
        float yDelta = (float) (speed*Math.sin(direction));
        this.move(xDelta, yDelta);
        ball.setXYZ(x, y, z);
    }
}
