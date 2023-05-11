import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDifferenceCalculator extends JFrame implements MouseListener {
    private JLabel outputLabel;
    private JTextField inputField1, inputField2;
    private int sum, difference;

    public SumDifferenceCalculator() {
        // Set up the JFrame
        setTitle("Sum/Difference Calculator");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text fields
        inputField1 = new JTextField(5);
        inputField2 = new JTextField(5);

        // Create the output label
        outputLabel = new JLabel("Click to calculate sum or difference");

        // Add the components to the JFrame
        setLayout(new FlowLayout());
        add(new JLabel("Input 1:"));
        add(inputField1);
        add(new JLabel("Input 2:"));
        add(inputField2);
        add(outputLabel);

        // Add the mouse listener
        addMouseListener(this);
    }

    // Calculate the sum and difference when the mouse is clicked or released
    public void mouseClicked(MouseEvent e) {
       
    }

    public void mouseReleased(MouseEvent e) {
        difference = Integer.parseInt(inputField1.getText()) - Integer.parseInt(inputField2.getText());
        outputLabel.setText("Difference: " + difference);
    }

    // Unused methods from the MouseListener interface
    public void mouseEntered(MouseEvent e) {
       
    }
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        sum = Integer.parseInt(inputField1.getText()) + Integer.parseInt(inputField2.getText());
        outputLabel.setText("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Create and show the JFrame
        SumDifferenceCalculator calculator = new SumDifferenceCalculator();
        calculator.setVisible(true);
    }
}
