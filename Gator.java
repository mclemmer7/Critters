/** This is a Critter class for a Gator. It moves the gator, returns its color, and returns what string is displayed.
 *
 * @author Mark Clemmer
 * @version October 1, 2020
 */

import java.awt.*;
import java.util.*;

public class Gator extends Critter {
   
   /** Default constructor for Gator */
   public Gator() {
   
   }
   
   
   // First, I tried to check all around the gator to see if it would infect anything around it. And I also wanted to see if a gator could hop over
   // another gator if they got in the way of each other. Neither of these worked, so that gave me a new idea to turn the gator in the direction of
   // another species to infect them. I programmed it so that if it has another gator in front of it, it will randomly choose to turn right or turn 
   // left depending on the value of randMove.
   
   /** This method contains actions that the Gator can do. It can infect other critters, turn left or right, or hop.
    *
    * @param info Provides information about the current status of the critter and the critters around it.
    * @return An action from the Action class.
    */
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getLeft() == Neighbor.OTHER) {
         return Action.LEFT;
      } else if (info.getRight() == Neighbor.OTHER) {
         return Action.RIGHT;
      } else if (info.getFront() == Neighbor.SAME) {
         Random rand = new Random();
         int randMove = rand.nextInt(2);
         if (randMove == 0) {
            return Action.RIGHT;
         } else {
            return Action.LEFT;
         }
         
      } else if (info.getFront() == Neighbor.WALL) {
         return Action.RIGHT;
      } else {
         return Action.HOP;
      }
   }
   
   /** This method returns the color of the gator.
    *
    * @return Color of gator.
    */
   public Color getColor() {
      return Color.ORANGE;
   }
   
   @Override
   public String toString() {
      return "G";
   }
}