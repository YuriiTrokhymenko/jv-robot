package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        // direction of movement along X
        Direction actualDirection = setDirectionX(robot, toX);
        while (robot.getDirection() == actualDirection) {
            robot.turnLeft();
        }
        System.out.println(robot);
    }

    // determine the direction of movement X
    public Direction setDirectionX(Robot robot, int toX) {
        int actualX = robot.getX();
        Direction actDirection = robot.getDirection();
        Direction toDirection = actDirection;
       if (toX < actualX) {
            toDirection = Direction.LEFT;
        } else if (toX > actualX) {
            toDirection = Direction.RIGHT;
        }
        return toDirection;
    }

    // determine the direction of movement Y
    public Direction setDirectionY(Robot robot, int toY) {
        int actualY = robot.getY();
        Direction actDirection = robot.getDirection();
        Direction toDirection = actDirection;
        if (toY < actualY) {
            toDirection = Direction.DOWN;
        } else if (toY > actualY) {
            toDirection = Direction.UP;
        }
        return toDirection;
    }


}
