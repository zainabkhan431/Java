import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Panel implements ActionListener {
    JLabel lbl;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JPanel pnl;
    void GUI(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        frm.setLayout(new BorderLayout());
        btn1 = new JButton("One");
        btn2 = new JButton("Two");
        btn3 = new JButton("Three");
        btn4 = new JButton("Four");
        pnl = new JPanel();
        lbl = new JLabel();

        lbl.setFont(new Font("Arial",Font.BOLD,30));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setForeground(Color.ORANGE);
        lbl.setFont(new Font("Arial",Font.PLAIN,20));
        lbl.setBackground(Color.GRAY);
        lbl.setOpaque(true);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        pnl.add(btn4);
        frm.add(lbl);
        frm.add(pnl,BorderLayout.SOUTH);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        Panel obj = new Panel();
        obj.GUI();
    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("One")){
            lbl.setText("Ichi");
        } else if (command.equals("Two")) {
            lbl.setText("Nii");
        } else if (command.equals("Three")) {
            lbl.setText("San");
        } else if (command.equals("Four")) {
            lbl.setText("Shi");
        }else{
            lbl.setText("Some error Occured");
        }

    }
}
