/** This is a Critter class for a Bear. It moves the bear, returns its color, and returns what string is displayed.
 *
 * @author Mark Clemmer
 * @version October 1, 2020
 */

import java.awt.*;

public class Bear extends Critter {
   private boolean polar;
   private int moves;
   
   /** This constructs a Bear that is a polar bear if polar is true, and a normal bear if polar is false.
    *
    * @param polar True or false for if the bear is a polar bear or not.
    */
   public Bear(boolean polar) {
      this.polar = polar;
   }
   
   /** This method contains actions that the Bear can do. It can infect other critters, hop, or turn left.
    *
    * @param info Provides information about the current status of the critter and the critters around it.
    * @return An action from the Action class.
    */
   public Action getMove(CritterInfo info) {
      
      moves++;
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() != Neighbor.OTHER) {
         return Action.HOP;
      } else {
         return Action.LEFT;
      }
   }

   /** This method returns the color of the bear.
    *
    * @return Color of bear.
    */
   public Color getColor() {
      if (polar == true) {
         return Color.WHITE;
      } else {
         return Color.BLACK;
      }
   }
   
   @Override
   public String toString() {
      if (moves % 2 == 0) {
         return "/";
      } else {
         return "\\";
      }
   }
   
}