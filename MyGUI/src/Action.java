import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Action implements ActionListener {
    JLabel lbl;
    JButton btn;
    JLabel lbl1;
    public void GUI(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        con.setLayout(new GridLayout(0,1));
        con.setFont(new Font("SansSerif",Font.PLAIN,20));
        con.setBackground(Color.YELLOW);
        lbl1 = new JLabel("CLICK");
        lbl = new JLabel("Don't CLick The Button");
        lbl.setForeground(Color.BLUE);
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        btn = new JButton("Don't Click me");
        con.add(lbl1);
        con.add(lbl);
        con.add(btn);
        btn.addActionListener(this);
        frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        Action obj = new Action();
        obj.GUI();
    }
    public void actionPerformed(ActionEvent e){
        lbl.setText("OUCH!!");
    }
}


