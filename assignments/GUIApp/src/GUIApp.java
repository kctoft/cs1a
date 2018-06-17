/**
 * name: GUI App
 * created: 06/15/2018
 * author: Kitana Toft
 * desc: Create and display a window for user interaction.
 */

/**
 * one object of this class initiates JFrame and
 * displays it for the user.
 * It also initiates a JTextField, JButton, and a JLabel
 * adding them to JFrame
 */

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class GUIApp {
    private JFrame myWindow;
    private JTextField userInput;
    private JButton hello;
    private JLabel output;

    /**
     * constructor sets up the JFrame
     */
    public GUIApp() {
        setUpWindow();
        setUpEntry();
        setUpHelloButton();
        setUpOutput();
        myWindow.validate();
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

    /**
     * instantiates a new JFrame and sets it up empty
     */
    public void setUpEntry() {
        userInput = new JTextField("Type your name here: ");
        myWindow.add(userInput);
    }

    /**
     * instantiates a 'hello' button & adds it to the JFrame
     */
    public void setUpHelloButton() {
        hello = new JButton("Hi");
        myWindow.add(hello);
    }

    /**
     * instantiates a JTextField for displaying the output, adds it to JFrame
     * but leaves it empty
     */
    public void setUpOutput() {
        output = new JLabel();
        myWindow.add(output);
    }
}
