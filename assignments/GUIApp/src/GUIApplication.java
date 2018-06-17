/**
 * name: GUI App
 * created: 06/15/2018
 * author: Kitana Toft
 * desc: Create and display a window for user interaction.
 */

/**
 * One object of this class initiates JFrame and
 * displays it for the user.
 * It also initiates a JTextField, JButton, and a JLabel
 * adding them to JFrame.
 */

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.FlowLayout;
//import java.awt.event.ActionListener;

public class GUIApplication {
    private JFrame myWindow;
    private JTextField userInput;
    private JButton hello;
    private JLabel output;

    /**
     * Constructor sets up the JFrame.
     */
    public GUIApplication() {
        setUpWindow();
        setUpEntry();
        setUpHelloButton();
        setUpOutput();
        myWindow.validate();
    }

    /**
     * Allocates the new JFrame and sets it up to empty.
     */
    public void setUpWindow() {
        myWindow = new JFrame();
        myWindow.setLayout(new FlowLayout());
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(300, 510);
        myWindow.setVisible(true);
    }

    /**
     * Instantiates a new JFrame and sets it up empty.
     */
    public void setUpEntry() {
        userInput = new JTextField("Type your name here: ");
        myWindow.add(userInput);
    }

    /**
     * Instantiates a 'hello' button & adds it to the JFrame.
     */
    public void setUpHelloButton() {
        hello = new JButton("Hi");
        myWindow.add(hello);
//        hello.addActionListener(this);
    }

    /**
     * Instantiates a JTextField for displaying the output, adds it to JFrame
     * but leaves it empty
     */
    public void setUpOutput() {
        output = new JLabel();
        myWindow.add(output);
    }

    /**
     * Java calls this method when user clicks "hello" button.
     * This makes up a message String and puts it into the output TextField.
     */
//    public void actionPerformed(ActionEvent event) {
//        if (event.getActionCommand() == "Hi") {
//            String usersName = userInput.getText(); // getting & setting vs using a scanner
//            output.setText("Well hello here " + usersName + "!");
//        }
//    }
}
