
import kareltherobot.*; 


/**
 * @author :  A. Starr
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
        public void plantBeepers() {
       plantAroundWall();
       turnRight();
       plantAroundWall();
       putBeeper();
       goAroundEastEdge();
       plantAroundWall();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void goAroundEdge() {
        move();
        turnLeft();
        move();
    }
    public void plantBeeper() {
        if (!nextToABeeper()) {
            turnLeft();
            if (!frontIsClear()) {
                putBeeper();
                turnRight();
                move();
            }
            else {
                goAroundEdge();
            }
        }
    }
    public void goAroundEastEdge() {
       turnRight();
       goAroundEdge();
       turnLeft();
       move();
       turnRight();
    }
    public void plantAroundWall() {
        while (frontIsClear()) {
           plantBeeper();
        }
    }
    }
    


