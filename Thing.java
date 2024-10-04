public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected char lab;

    public Thing (int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0;
    }
      
      // dir: 0=North, 1=East, 2=South, 3=West.
        // timeSinceLast: this is only important for "TypeB" Things.
        // public int  row, col, dir, timeSinceLast;
        // public char lab = 'r';
        // public boolean isTypeB;
    
      /**
       * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
       * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
       *       WE DON'T HAVE TO USE NODES HERE?
       * This class is for linked lists of Thing's
       */
      //public static class Node {
      //  public Thing data;
     //   public Node  next;
     // }
    
      // EEEEEK! STATIC METHODS!!! PLEASE FIND THEM A BETTER HOME.
      public void rightTurn() {
        this.dir = (this.dir + 1) % 4;
      }
    
      public void leftTurn() {
        this.dir = (this.dir + 3) % 4;
      }
    
      public void step(Thing t) {
        final int[] dc = {
          0, 1, 0, -1
        }, dr = {
          1, 0, -1, 0
        };
        t.row += dr[t.dir];
        t.col += dc[t.dir];
      }
      // this method cannot be defined here and must be implemented in the subclass
      public abstract void maybeTurn(); // abstract class

      public String toString () {
        return row + " " + col + " " + lab;
      }
}
