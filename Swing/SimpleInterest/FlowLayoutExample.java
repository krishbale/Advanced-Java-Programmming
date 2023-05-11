import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Add components to container
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);

        // Set window size and show
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
