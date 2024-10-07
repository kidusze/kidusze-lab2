import java.util.Random;

public class TypeB  extends Thing {
   private int timeSinceLast = 0;
   protected Random rand = new Random(System.currentTimeMillis());


   public TypeB(int row, int col) {
       super(row, col, 'b');
   }
  
   public void maybeTurn(Random rand) {
       timeSinceLast++;
       if (timeSinceLast == 10) {
           timeSinceLast = 0;
           int i = rand.nextInt(3);
           if (i == 1) {
               rightTurn();
           }
           else if (i == 2) {
               leftTurn();
           }
       }
   }
  
}



