import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringManipulation extends JFrame implements ActionListener {
    private JLabel inputLabel, outputLabel;
    private JTextField inputField, outputField;
    private JButton palindromeButton, reverseButton, vowelsButton;
    
    public StringManipulation() {
        super("String Manipulation");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create input and output labels
        inputLabel = new JLabel("Input any String:");
        outputLabel = new JLabel("Output:");
        
        // Create input and output fields
        inputField = new JTextField(20);
        outputField = new JTextField(20);
        outputField.setEditable(false); // make output field read-only
        
        // Create buttons for string manipulation
        palindromeButton = new JButton("Check Palindrome");
        palindromeButton.addActionListener(this);
        
        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);
        
        vowelsButton = new JButton("Find Vowels");
        vowelsButton.addActionListener(this);
        
        // Create panel for input label and field
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        
        // Create panel for output label and field
        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(outputLabel);
        outputPanel.add(outputField);
        
        // Create panel for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(palindromeButton);
        buttonPanel.add(reverseButton);
        buttonPanel.add(vowelsButton);
        
        // Add input, output, and button panels to main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(outputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        add(mainPanel);
    }
    
    public void actionPerformed(ActionEvent e) {
        String inputString = inputField.getText();
        
        if (e.getSource() == palindromeButton) {
            // Check if input string is a palindrome
            boolean isPalindrome = true;
            int length = inputString.length();
            
            for (int i = 0; i < length/2; i++) {
                if (inputString.charAt(i) != inputString.charAt(length-i-1)) {
                    isPalindrome = false;
                    break;
                }
            }
            
            if (isPalindrome) {
                outputField.setText("The input string is a palindrome.");
            } else {
                outputField.setText("The input string is not a palindrome.");
            }
        }
        
        if (e.getSource() == reverseButton) {
            // Reverse the input string
            String reversedString = "";
            int length = inputString.length();
            
            for (int i = length-1; i >= 0; i--) {
                reversedString += inputString.charAt(i);
            }
            
            outputField.setText(reversedString);
        }
        
        if (e.getSource() == vowelsButton) {
            // Find the vowels in the input string
            String vowelsString = "";
            int length = inputString.length();
            
            for (int i = 0; i < length; i++) {
                char c = inputString.charAt(i);
                
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    
                    
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelsString += c;
                }
            }
            
            if (vowelsString.equals("")) {
                outputField.setText("There are no vowels in the input string.");
            } else {
                outputField.setText(vowelsString);
            }
        }
    }
    
    public static void main(String[] args) {
        StringManipulation frame = new StringManipulation();
        frame.setVisible(true);
    }
}
        

