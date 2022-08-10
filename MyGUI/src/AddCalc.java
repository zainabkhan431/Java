import java.awt.*;
import javax.swing.*;
import java.awt.Label;
import java.awt.event.*;
public class AddCalc implements ActionListener {
    JTextField txt1;
    JTextField txt2;
    JLabel lbl;
    JButton btn;
    void GUI(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        txt1= new JTextField();
        txt2 = new JTextField();
        btn = new JButton("Add them up");
        lbl = new JLabel();
        JPanel pnl = new JPanel(new GridLayout(4,2));
        pnl.add(new Label("X:"));
        pnl.add(txt1);
        pnl.add(new Label("Y:"));
        pnl.add(txt2);
        pnl.add(new Label("X+Y:"));
        pnl.add(lbl);
        pnl.add(btn);

        con.add(pnl);

        frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
    }
    public static void main(String arg[]){
        AddCalc obj = new AddCalc();
        obj.GUI();
    }
    public void actionPerformed(ActionEvent e){
     String x =txt1.getText();
     String y=txt2.getText();
     int z= Integer.parseInt(x);
     int w= Integer.parseInt(y);
     int result = z+w;
        String Result = String.valueOf(result);
        lbl.setText(Result);
    }

}
