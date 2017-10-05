/**
 * Lucy Matulis
 * October 5th, 2017
 * This program creates shapes that are random sizes and random colours.
 */


package randomshapestest;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;
/**
 *
 * @author lumat8093
 */

    public class RandomShape extends JPanel {
    private static final SecureRandom rn = new SecureRandom();
        
        int size = rn.nextInt(200);
   
    /**
     * This method draws the shapes and fills them with random colours.
     */
    public void paintComponent (Graphics g){
        super.paintComponent(g);
              
        Color white = new Color (255, 255, 255);
        g.setColor(white);
        g.fillRect(0, 0, 500, 500);
       
        
        int placement = rn.nextInt(400);
        
        
        Color color1 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color1);//largest circle
        g.fillOval(rn.nextInt(300),rn.nextInt(300), rn.nextInt(200), rn.nextInt(200));
        
        Color color2 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color2);
        g.fillOval(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200));
        
        Color color3 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color3);
        g.fillRect(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200));
        
        Color color4 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color4);
        g.fillRoundRect(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200), rn.nextInt(360), rn.nextInt(200));
       
        Color color5 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color5);
        g.fillRoundRect(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200), rn.nextInt(360), rn.nextInt(200));
    
        Color color6 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color6);
        g.fillRoundRect(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200), rn.nextInt(360), rn.nextInt(200));
   
        Color color7 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color7);
        g.fillRoundRect(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200), rn.nextInt(360), rn.nextInt(200));
    
        Color color8 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        g.setColor(color8);
        g.fillRoundRect(rn.nextInt(300), rn.nextInt(300), rn.nextInt(200), rn.nextInt(200), rn.nextInt(360), rn.nextInt(200));
    }
}

