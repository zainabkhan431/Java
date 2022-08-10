import java.awt.*;
import javax.swing.*;
import java.awt.Label;
import java.awt.event.*;
public class MyCalculator implements ActionListener {
    JLabel lblplus;
    JLabel lblminus;
    JLabel lblmult;
    JLabel lbldiv;
    JTextField txt1;
    JTextField txt2;
    void GUI(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
         txt1 = new JTextField();
         txt2 = new JTextField();
         lblplus= new JLabel();
         lblminus= new JLabel();
         lblmult= new JLabel();
         lbldiv = new JLabel();


        JButton btn = new JButton("Calculate");
        JPanel pnl = new JPanel(new GridLayout(4,4));
        pnl.add(new JLabel("X"));
        pnl.add(txt1);
        pnl.add(new JLabel("Y"));
        pnl.add(txt2);
        pnl.add(new JLabel("X+Y:"));
        pnl.add(lblplus);
        pnl.add(new JLabel("X-Y:"));
        pnl.add(lblminus);
        pnl.add(new JLabel("X*Y:"));
        pnl.add(lblmult);
        pnl.add(new JLabel("X/Y:"));
        pnl.add(lbldiv);
        pnl.add(btn,BorderLayout.SOUTH);
        con.add(pnl);

        btn.addActionListener(this);
        frm.setSize(600,600);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        MyCalculator calc = new MyCalculator();
        
        calc.GUI();
    }
    public void actionPerformed(ActionEvent e){
        double x = Double.parseDouble(txt1.getText());
        double y = Double.parseDouble(txt2.getText());
        String result="";
        result = String.valueOf(x+y);
        lblplus.setText(result);

        result= String.valueOf(x-y);
        lblminus.setText(result);

        result= String.valueOf(x*y);
        lblmult.setText(result);

        result= String.valueOf(x/y);
        lbldiv.setText(result);




    }

}
