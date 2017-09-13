    
    import kareltherobot.*; 
    
    
/**
     * @author :  A. Starr
     */
    public class Problem1 extends Robot
    {
    public Problem1(int st, int av, Direction dir, int numBeepers) {
            super(st, av, dir, numBeepers);
        }
    public void escapeRoom() {
            findWall();
            faceNorth();
            if (checkLeft()) {
                exit();
            }
            faceEast();
            if (checkLeft()) {
                exit();
            }
            faceSouth();
            if (checkLeft()) {
                exit();
            }
            faceWest();
            if (checkLeft()) {
                exit();
            }
        }
    public void findWall() {
           faceWest();
           while (frontIsClear()) {
                move();
            }
        }
    public void faceSouth() {
            while (!facingSouth()) {
                turnLeft();
            }
        }
    public void faceWest() {
           while (!facingWest()) {
                turnLeft();
            }
        }
    public void faceNorth() {
           while (!facingNorth()) {
                turnLeft();
            }
        }
    public void faceEast() {
           while (!facingEast()) {
                turnLeft();
            }
        }
    public boolean checkLeft() {
           turnLeft();
           if (frontIsClear()) {
                return true;
            }
            else {
                return false;
            }
        }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void exit() {
        turnLeft();
        move();
        turnOff();
    }
    }
    
    
