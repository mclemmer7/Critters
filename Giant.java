/** This is a Critter class for a Giant. It moves the giant, returns its color, and returns what string is displayed.
 *
 * @author Mark Clemmer
 * @version October 1, 2020
 */

import java.awt.*;

public class Giant extends Critter {
   private int moves;
   
   /** Default constructor for Giant */
   public Giant() {
   
   }
   
   /** This method contains actions that the Giant can do. It can infect other critters, hop, or turn right.
    *
    * @param info Provides information about the current status of the giant and the critters around it.
    * @return An action from the Action class.
    */
   public Action getMove(CritterInfo info) {
      moves++;
      
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.RIGHT;
      }
   }
   
   /** This method returns the color of the giant.
    *
    * @return Color of giant.
    */
   public Color getColor() {
      return Color.GRAY;
   }
   
   @Override
   public String toString() {
      if (moves <= 6) {
         return "fee";
      } else if (moves <= 12) {
         return "fie";
      } else if (moves <= 18) {
         return "foe";
      } else if (moves <= 24) {
         return "fum";
      } else {
         moves = 1;
         return "fee";
      }
      
   }
}