import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame{

    JMenuBar mb;
    JMenu m1 , m2 ;
    JMenuItem i1 , i2 , i3 , i4 ;


    DashBoard(){
        mb = new JMenuBar();
        add(mb);

        m1 = new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.RED);
        mb.add(m1);

        m2 = new JMenu("ADMIN");
        m2.setForeground(Color.BLUE);
        mb.add(m2);

        i1 = new JMenuItem("RECEPTION");
        m1.add(i1);

        i2 = new JMenuItem("ADD EMPLOYEE");
        m2.add(i2);

        i3 = new JMenuItem("ADD ROOM");
        m2.add(i3);

        i4 = new JMenuItem("ADD DRIVERS");
        m2.add(i4);

        mb.setBounds(0,0,1950,30);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image img2 = img1.getImage().getScaledInstance(1270,700,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel l1 = new JLabel(img3);
        l1.setBounds(0,0,1270,700);
        add(l1);

        JLabel l2 = new JLabel("THE TAJ GROUP WELCOMES YOU");
        l2.setBounds(300,50,1000,50);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("TAHOMA",Font.PLAIN,40));
        l1.add(l2);

        setLayout(null);
        setBounds(0,0,1950,1000);
        setVisible(true);


    }
	

	public static void main(String[] args) {
        new DashBoard().setVisible(true);


	}

}
