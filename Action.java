import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Action implements ActionListener {
    JLabel lbl;
    JButton btn;
    public void GUI(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        lbl = new JLabel("Don't CLick The Button");
        btn = new JButton();
        con.add(lbl);
        con.add(btn);
        btn.addActionListener(this);
    }
    public static void main(String arg[]){
        Action obj = new Action();
        obj.GUI();
    }
    public void actionPerformed(ActionEvent e){
        lbl.setText("OUCH!!");
    }
}