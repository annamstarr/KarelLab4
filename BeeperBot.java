
import kareltherobot.*; 


/**
 * @author :  A. Starr
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void runRace() {
        while (frontIsClear()) {
            collectBeeperSteeple();
        }
    }
    public void collectBeeperSteeple() {
        findBeepers();
        }
        public void findBeepers() {
        faceEast();
        while (!nextToABeeper() && (frontIsClear())) {
            move();
        }
        collectColumn();
        resetPosition();
        faceEast();
    }
    public void collectColumn() {
        faceNorth();
        while (nextToABeeper()) {
            pickBeeper();
            move();
            }
    }
    public void faceNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()) {
               turnLeft();
            }
        }
        public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
    public void resetPosition() {
        faceSouth();
        while (frontIsClear()) {
            move();
        }
    }
}
    
    
    
