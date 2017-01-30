import javax.swing.*;
import javax.awt.*;
import java.awt.event.*;

public class blackWhiteStart {
    JFrame _blackWhiteFrame = new JFrame("Pick a color to start the attack"); // creates frame/window
    JPanel _blackWhitePanel = new JPanel(); // one single flow panel
    JButton _blackButton = new JButton("Black");
    JButton _whiteButton = new JButton("White");

    public enum Color {
        BLACK, WHITE
    }

    Color startColor;

    public blackWhiteStart() {
        _blackWhiteFrame.setSize(400, 400); // width, height
        _blackWhiteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // what happens when the user closes the window
        // see Window Constants in https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html for more options

        _blackWhitePanel.setLayout(new FlowLayout());  // this only needs one button, so layout doesn't matter
        // The FlowLayout will just position the elements one after another, like letters in a line of text.

        // May not be necessary
        // _blackWhiteframe.add(_blackWhitePanel, BorderLayout.NORTH);

        // adding the black button
        ActionListener blackListener = new BlackListener();
        _blackButton.addActionListener(blackListener);
        _blackButton.setFont(new Font("Courier", Font.PLAIN, 48));
        _blackWhitePanel.add(_blackButton);
        // adding the white button
        ActionListener whiteListener = new WhiteListener();
        _whiteButton.addActionListener(whiteListener;
        _whiteButton.setFont(new Font("Courier", Font.PLAIN, 48));
        _blackWhitePanel.add(_whiteButton);

        // Refresh window - otherwise we will not be able to see it
        // This should be the last line of the constructor
        _blackWhiteFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new blackWhiteStart();
    }

    // This listener will be called when the black button is clicked
    class BlackListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            startColor = BLACK;
            // TODO: Add code to start game
        }
    }

    // This listener will be called when the white button is clicked
    class WhiteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            startColor = WHITE;
            // TODO: Add code to start game
        }

    }
}
