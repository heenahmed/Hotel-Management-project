import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room extends JFrame implements ActionListener{
    JTable t1;
    JButton b1,b2;

    Room(){
        t1 = new JTable();
        t1.setBounds(0,40,500,400);
        add(t1);

        b1 = new JButton("Load Data");
        b1.addActionListener(this);
        b1.setBounds(100,460,120,30);
        add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setBounds(250,460,120,30);
        add(b2);

        setLayout(null);
        setBounds(450,200,1000,600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){

        }else if (ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args){
        new Room().setVisible(true);
    }
}