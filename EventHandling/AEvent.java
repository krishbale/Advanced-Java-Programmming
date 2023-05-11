

import java.awt.*;
import java.awt.event.*;
 class AEvent extends Frame implements ActionListener{
    TextField  tf;
    AEvent(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");

        b.setBounds(100,120,80,30);
        //regiseter listener
        b.addActionListener(this);//passing currrent instance
        //add components & setSize layout and visibility
        add(tf); add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
 
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String args[]){
        new AEvent();
    }
}