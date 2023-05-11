
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Addition extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    public Addition(){
        l1 = new JLabel("First Number:");
        l1.setBounds(20,10,100,20);
        t1 = new JTextField(10);
        t1.setBounds(120,10,100,20);

          l2 = new JLabel("Second Number:");
        l2.setBounds(20,40,100,20);
        t2 = new JTextField(10);
        t2.setBounds(120,40,100,20);

          l3 = new JLabel("Result:");
        l3.setBounds(20,60,100,20);
        t3 = new JTextField(10);
        t3.setBounds(120,70,100,120);


        add(l1);
        add(t1);
         add(l2);
        add(t2);
         add(l3);
        add(t3);

        b1 = new JButton("SUm");
        b1.setBounds(20,70,80,20);
        add(b1);


        b1.addActionListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }                                                                                                   
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum));

        }
    

    }
        public static void main(String args[]){
            new Addition();
        }
}