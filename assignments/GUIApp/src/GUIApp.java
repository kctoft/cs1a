/**
 * name: GUI App
 * created: 06/17/2018
 * author: Kitana Toft
 * desc: GUI application to interact with user; asks for name and program executes 'hello' or 'goodbye'.
 */

/**
 * One object of this class instantiates a JFrame, and a place for the user to
 * type her name, and a button. If the user types her name and clicks the "Hi"
 * button, a personalized greeting will appear on the JFrame.
 */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIApp implements ActionListener {
    private JFrame myWindow;
    private JTextField userInput;
    private JButton hello;
    private JButton bye;
    private JLabel output;

    /**
     *  constructor sets up the JFrame and put all the components on it.
     */
    public GUIApp() {
        setUpWindow();
        setUpEntry();
        setUpHelloButton();
        setUpByeButton();
        setUpOutput();
        myWindow.validate();
    }

    /**
     *  Instantiates the new JFrame and sets it up empty.
     */
    public void setUpWindow() {
        myWindow = new JFrame();
        myWindow.setLayout(new FlowLayout());
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(300, 150);
        myWindow.setVisible(true);
    }

    /**
     *  Instantiates a text entry box for user input and adds it to the JFrame.
     */
    public void setUpEntry() {
        userInput = new JTextField("Type your name here");
        myWindow.add(userInput);
    }

    /**
     *  Instantiates the hello button, adds it to the JFrame,
     *  and makes this class listen and react to a user event on that button.
     */
    public void setUpHelloButton() {
        hello = new JButton("Hi");
        myWindow.add(hello);
        hello.addActionListener(this);
    }

    /**
     * Instantiates the bye button, adds it to to the JFrame,
     * and makes this class listen and react to a user event on that button.
     */
    public void setUpByeButton() {
        bye = new JButton("Bye");
        myWindow.add(bye);
        bye.addActionListener(this);
    }

    /**
     *  Instantiates a JLabel for displaying the output, adds it to the JFrame,
     *  but leaves the JLabel empty for now.
     */
    public void setUpOutput() {
        output = new JLabel("                               ");
        myWindow.add(output);
    }

    /**
     *  Java calls this method when the user clicks a button that has this class
     *  as its ActionListener. This method then puts a string message onto the
     *  JLabel output.
     */
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand() == "Hi") {
            String usersName = userInput.getText();
            output.setText("Well hello there " + usersName + "!");
        } if (event.getActionCommand() == "Goodbye") {
            String usersName = userInput.getText();
            output.setText("Goodbye " + usersName + "!");
        }
    }
}

