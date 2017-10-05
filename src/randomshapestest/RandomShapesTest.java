/**
 * Lucy Matulis
 * October 5th, 2017
 * This program creates shapes that are random sizes and random colours.
 */

package randomshapestest;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author lumat8093
 */
public class RandomShapesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomShape panel = new RandomShape();      
        JFrame y = new JFrame();
        y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        y.add(panel);
        y.setSize(500, 500);      
        y.setVisible(true);
        y.setResizable(false);
        
    }
    
}
