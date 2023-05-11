import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sumCalculator extends JFrame implements ActionListener {
    private JLabel num1Label, num2Label, sumLabel;
    private JTextField num1Field, num2Field, sumField;
    private JButton calculateButton;
    
    public sumCalculator() {
        super("Sum Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create labels for input fields
        num1Label = new JLabel("Number 1:");
        num2Label = new JLabel("Number 2:");
        
        // Create text fields for input and output
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        sumField = new JTextField(10);
        sumField.setEditable(false); // make output field read-only
        
        // Create calculate button
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this); // add listener to button
        
        // Create panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(num1Label);
        inputPanel.add(num1Field);
        inputPanel.add(num2Label);
        inputPanel.add(num2Field);
        
        // Create panel for output field and button
        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(sumField);
        outputPanel.add(calculateButton);
        
        // Add input and output panels to main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(outputPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        add(mainPanel);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Calculate sum of two numbers when button is clicked
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double sum = num1 + num2;
        sumField.setText(String.format("%.2f", sum));
    }
    
    public static void main(String[] args) {
        sumCalculator calculator = new sumCalculator();
        calculator.setVisible(true);
    }
}

// Design a gui form using swing with a text field , a text label for displaying the input message "Input any String", and three buttons with a caption checkPalindrome, Reverse, Findvowels . Write a complete program for above scenario and for checking palindrome in first button , reverse it after clicking second button and extract the vowels from it after clicking third