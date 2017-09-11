
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
            collectBepperSteeple();
        }
    }
    public void collectBeeperSteeple() {
        while (
    }
    public void 
    public void findBeepers() {
    faceEast();
    while (!nextToABeeper()) {
        move();
    }
}
   public void faceEast() {
    while (!facingEast()) {
        turnLeft();
    }
}
}



