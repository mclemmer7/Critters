/** This is a Giant class for a Titan. It moves the titan, returns its color, and returns what string is displayed.
 *
 * @author Mark Clemmer
 * @version October 1, 2020
 */


import java.awt.*;

public class Titan extends Giant {
   
   @Override
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.WALL) {
         return Action.LEFT;
      } else {
         return super.getMove(info);
      }
   }
   
   @Override
   public Color getColor() {
      if (toString().equals("fee") || toString().equals("foe")) {
         return Color.BLACK;
      } else {
         return Color.WHITE;
      }
   }
}