import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Border implements ActionListener {
    JLabel lbl;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    void GUI(){
        JFrame frm= new JFrame();
        frm.setLayout(new BorderLayout());
        btn1 = new JButton("North");
        btn2 = new JButton("South");
        btn3 = new JButton("East");
        btn4 = new JButton("West");
        lbl = new JLabel();

        frm.add(btn1,BorderLayout.NORTH);
        frm.add(btn2,BorderLayout.SOUTH);
        frm.add(btn3,BorderLayout.EAST);
        frm.add(btn4,BorderLayout.WEST);
        frm.add(lbl,BorderLayout.CENTER);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setForeground(Color.BLUE);
        lbl.setFont(new Font("Arial",Font.BOLD,20));

        frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        Border bor = new Border();
        bor.GUI();
    }
    public void actionPerformed(ActionEvent e){
        String result = "You Clicked on the  ";
        result+= e.getActionCommand();
        result+= " Button";
        lbl.setText(result);
    }

}
