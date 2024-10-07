//import java.util.*;
import java.util.Random;


public class ThingList {
   private Node head;
  
   protected Random rand = new Random(System.currentTimeMillis());


   private class Node {
       Thing data;
       Node  next;
   }
  
   public void addThing (Thing data) {
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = head;
       head = newNode;
   }
   public void printAll() {
       // Node it = head;
       for( Node it = head; it != null; it = it.next )
           System.out.println(it.data);
      
       System.out.println("done");
       System.out.flush();
   }
   public void moveAll(Random rand) {
       for( Node T = head; T != null; T = T.next ) {
           T.data.maybeTurn(rand);
           T.data.step();
       }
   }
}

