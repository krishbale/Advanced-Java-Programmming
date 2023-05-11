import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterestCalculator extends JFrame implements ActionListener {
    private JLabel principalLabel, rateLabel, timeLabel, interestLabel;
    private JTextField principalField, rateField, timeField, interestField;
    private JButton calculateButton;
    
    public SimpleInterestCalculator() {
        super("Simple Interest Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create labels for input fields
        principalLabel = new JLabel("Principal:");
        rateLabel = new JLabel("Rate (%):");
        timeLabel = new JLabel("Time (years):");
        
        // Create text fields for input and output
        principalField = new JTextField(10);
        rateField = new JTextField(10);
        timeField = new JTextField(10);
        interestField = new JTextField(10);
        interestField.setEditable(false); // make output field read-only
        
        // Create calculate button
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this); // add listener to button
        
        // Create panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(principalLabel);
        inputPanel.add(principalField);
        inputPanel.add(rateLabel);
        inputPanel.add(rateField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        
        // Create panel for output field and button
        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(interestField);
        outputPanel.add(calculateButton);
        
        // Add input and output panels to main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(outputPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        add(mainPanel);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Calculate simple interest when button is clicked
        double principal = Double.parseDouble(principalField.getText());
        double rate = Double.parseDouble(rateField.getText());
        double time = Double.parseDouble(timeField.getText());
        double interest = (principal * rate * time) / 100;
        interestField.setText(String.format("%.2f", interest));
    }
    
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        calculator.setVisible(true);
    }
}
