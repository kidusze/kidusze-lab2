import java.util.Random;


public class TypeC extends Thing{
   private int count = 0;;
   protected Random rand = new Random(System.currentTimeMillis());




   public TypeC(int row, int col) {
       super(row,col,'y');
   }
   public void maybeTurn(Random rand) {
       
       count++;
       // Turn every 5 rounds
       if (count == 5) {
           count = 0;
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

