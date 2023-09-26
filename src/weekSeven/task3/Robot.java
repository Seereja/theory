package weekSeven.task3;

public class Robot {


    private int x;
    private int y;
    private Direction direction;// 0--up 1--right 2 -- bottom 3--left

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.UP;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        direction = Direction.UP;
    }

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = Direction.UP;
    }

    public void go() {
        switch (direction) {
            case UP -> y++;
            case RIGHT -> x++;
            case BOTTOM -> y--;
            case LEFT -> x--;
        }
        printCoordinates();
    }

    // 0--up 1--right 2 -- bottom 3--left
    public void turnLeft() {
//        this.direction = direction == 0
//                ? direction = 3
//                : direction - 1;
        this.direction = Direction.ofNumber((this.direction.numberOfDirection + 3) % 4);
    }

    public void turnRight() {
        this.direction = Direction.ofNumber((this.direction.numberOfDirection + 1) % 4);

    }

    public void printCoordinates() {
        System.out.println("(x,y) = " + x + "," + y);
    }
}
