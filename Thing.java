import java.util.Random;

abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab;
    protected boolean isTypeB;
    
    protected Random rand = new Random(System.currentTimeMillis());
    
    public abstract void maybeTurn(Random rand); 

    public Thing (int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        //this.dir = 0;
    }
      
      public void rightTurn() {
        dir = (dir + 1) % 4;
      }
    
      public void leftTurn() {
        dir = (dir + 3) % 4;
      }
    
      public void step() {
        final int[] dc = {
          0, 1, 0, -1
        }, dr = {
          1, 0, -1, 0
        };
        row += dr[dir];
        col += dc[dir];
      }
      // this method cannot be defined here and must be implemented in the subclass
  // abstract class

      public String toString () {
        return row + " " + col + " " + lab;
      }
}
