import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JButton button1 = new JButton("North");
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("East");
        JButton button4 = new JButton("West");
        JButton button5 = new JButton("Center");

        // Add components to container
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(button1, BorderLayout.NORTH);
        contentPane.add(button2, BorderLayout.SOUTH);
        contentPane.add(button3, BorderLayout.EAST);
        contentPane.add(button4, BorderLayout.WEST);
        contentPane.add(button5, BorderLayout.CENTER);

        // Set window size and show
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
