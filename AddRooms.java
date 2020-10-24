import javax.swing.*;
import java.awt.*;

public class AddRooms extends JFrame{

    JTextField t1 , t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;

    AddRooms(){
        JLabel l1 = new JLabel("Add Rooms");
        l1.setFont(new Font("Tahoma" , Font.BOLD ,18));
        l1.setBounds(150,20,200,30);
        add(l1);

        JLabel room = new JLabel("Room Number");
        room.setFont(new Font("Tahoma" , Font.PLAIN ,16));
        room.setBounds(60,80,120,30);
        add(room);

        JTextField t1 = new JTextField();
        t1.setBounds(200,80,150,30);
        add(t1);

        JLabel Available = new JLabel("Available");
        Available.setFont(new Font("Tahoma" , Font.PLAIN ,16));
        Available.setBounds(60,130,120,30);
        add(Available);

        c1 = new JComboBox(new String[] {"Available" , "occupied"});
        c1.setBounds(200,130,150,30);
        add(c1);

        JLabel status = new JLabel("Cleaning Status");
        status.setFont(new Font("Tahoma" , Font.PLAIN ,16));
        status.setBounds(60,180,120,30);
        add(status);

        c2 = new JComboBox(new String[] {"Clean" , "Dirty"});
        c2.setBounds(200,180,150,30);
        add(c2);

        JLabel price = new JLabel("Price");
        price.setFont(new Font("Tahoma" , Font.PLAIN ,16));
        price.setBounds(60,230,120,30);
        add(price);

        JTextField t2 = new JTextField();
        t2.setBounds(200,230,150,30);
        add(t2);

        JLabel type = new JLabel("Bed Type");
        type.setFont(new Font("Tahoma" , Font.PLAIN ,16));
        type.setBounds(60,280,120,30);
        add(type);

        c3 = new JComboBox(new String[] {"Single Bed" , "Double Bed"});
        c3.setBounds(200,280,150,30);
        add(c3);

        b1 = new JButton("Add Room");
        b1.setBounds(60,350,130,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(220,350,130,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));//need to add image
        Image img2 = img1.getImage().getScaledInstance(500,350,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel l2 = new JLabel(img3);
        l2.setBounds(400,30,500,350);
        add(l2);

        getContentPane().setBackground(Color.WHITE);

        setBounds(500,200,950,470);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddRooms().setVisible(true);
    }
}