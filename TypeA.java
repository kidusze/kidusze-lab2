import java.util.Random;

public class TypeA  extends Thing {
    
    //private static Random rand = new Random();
    public TypeA(int row, int col) {
        super(row,col, 'r');
    }
    
    public void maybeTurn() {
        int i = DotChaser.rand.nextInt(3);
    
        if (i == 1) {
            rightTurn();
        }
        else if (i == 2) {
            leftTurn();
        }
    }
    
}
