import java.util.Random;

public class TypeB  extends Thing {
    
    //private static Random rand = new Random();
    private int timeSinceLast = 0;

    public TypeB(int row, int col) {
        super(row, col, 'b');
    }
    
    public void maybeTurn() {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = DotChaser.rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            }
            else if (i == 2) {
                leftTurn();
            }
        }
    }
    
}