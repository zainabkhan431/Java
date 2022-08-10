import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class NullLayout implements ActionListener {
    JLabel lbl;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    void Null() {
        JFrame frm = new JFrame();
        frm.setLayout(null);
        Container con = frm.getContentPane();
        lbl = new JLabel("Null Counter");
        lbl.setFont(new Font("Arial",Font.BOLD,30));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setForeground(Color.ORANGE);
        lbl.setFont(new Font("Arial",Font.PLAIN,20));
        lbl.setBackground(Color.GRAY);
        lbl.setOpaque(true);

        btn1 = new JButton("One");
        btn1.setLocation(50, 50);
        btn1.setSize(70, 70);

        btn2 = new JButton("Two");
        btn2.setLocation(100, 100);
        btn2.setSize(70, 70);

        btn3 = new JButton("Three");
        btn3.setLocation(150, 150);
        btn3.setSize(70, 70);

        btn4 = new JButton("Four");
        btn4.setLocation(200, 200);
        btn4.setSize(70, 70);

        lbl.setLocation(300, 0);
        lbl.setSize(150, 150);
        //con.add(lbl);
        con.add(lbl);
        con.add(btn1);
        con.add(btn2);
        con.add(btn3);
        con.add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        frm.setSize(500, 500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        NullLayout obj = new NullLayout();
        obj.Null();
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("One")) {
            lbl.setText("Ichi");
        } else if (command.equals("Two")) {
            lbl.setText("Nii");
        } else if (command.equals("Three")) {
            lbl.setText("San");
        } else if (command.equals("Four")) {
            lbl.setText("Shi");
        } else {
            lbl.setText("Some error Occured");
        }
    }
}
