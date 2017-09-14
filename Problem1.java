    
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
            findSouthWestCorner();
            faceNorth();
            checkWall();
            faceEast();
            checkWall();
            faceSouth();
            checkWall();
            faceWest();
            checkWall();
    }
    public void findSouthWestCorner() {
           faceSouth();
           while (frontIsClear()) {
                move();
           }
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
           turnRight();
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
    public void checkWall() {
           while (frontIsClear()) {
                move();
                checkLeft();
           }
    }
}
    
    
