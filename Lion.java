/** This is a Critter class for a Lion. It moves the lion, returns its color, and returns what string is displayed.
 *
 * @author Mark Clemmer
 * @version October 1, 2020
 */

import java.awt.*;
import java.util.*;

public class Lion extends Critter {
   private int moves;
   private Color type;
   
   /** Default constructor for Lion */
   public Lion() {
   
   }
   
   /** This method contains actions that the Lion can do. It can infect other critters, turn left or right, or hop.
    *
    * @param info Provides information about the current status of the critter and the critters around it.
    * @return An action from the Action class.
    */
   public Action getMove(CritterInfo info) {
      // moves tracks the amount of moves that have happened. Each time the lion moves, the moves variable increases by 1.
      moves++;
      
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      } else if (info.getFront() == Neighbor.SAME) {
         return Action.RIGHT;
      } else {
         return Action.HOP;
      }
   }
   
   /** This method returns the color of the lion.
    *
    * @return Color of lion.
    */
   public Color getColor() {
      if (moves % 3 == 0) {              // After every 3 moves, the lion will be able to change its color.
         Random rand = new Random();
         int randColor = rand.nextInt(4);
         if (randColor == 0) {
            type = Color.RED;
            return Color.RED;
         } else if (randColor == 1) {
            type = Color.GREEN;
            return Color.GREEN;
         } else if (randColor == 2) {
            type = Color.YELLOW;
            return Color.YELLOW;
         } else {
            type = Color.BLUE;
            return Color.BLUE;
         }
      } else {
         return type;
      }
   }
   
   @Override
   public String toString() {
      return "L";
   }
}