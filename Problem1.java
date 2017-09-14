    
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
            while (frontIsClear()) {
                move();
                checkLeft();
                faceNorth();
            }
            faceEast();
            while (frontIsClear()) {
                move();
                checkLeft();
                faceEast();
            }
            faceSouth();
            while (frontIsClear()) {
                move();
                checkLeft();
                faceSouth();
            }
            faceWest();
            while (frontIsClear()) {
                move();
                checkLeft();
                faceWest();
            }
            faceNorth();
            while (frontIsClear()) {
                move();
                checkLeft();
                faceNorth();
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
    public void checkLeft() {
           turnLeft();
           if (frontIsClear()) {
                leaveRoom();
            }
        }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void leaveRoom() {
        move();
        turnOff();
    }
    }
    
    
