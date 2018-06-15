/**
 * name: GUI App
 * created: 06/15/2018
 * author: Kitana Toft
 * desc: Create and display a window for user interaction.
 */

/**
 * one object of this class initiates JFrame and
 * displays it for the user
 */

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class GUIApp {
    private JFrame myWindow;

    /**
     * constructor sets up the JFrame
     */
    public GUIApp() {
        setUpWindow();
    }

    /**
     * allocates the new JFrame and sets it up to empty
     */
    public void setUpWindow() {
        myWindow = new JFrame();
        myWindow.setLayout(new FlowLayout());
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(300, 510);
        myWindow.setVisible(true);
    }
}
