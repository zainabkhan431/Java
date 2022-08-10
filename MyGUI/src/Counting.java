import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Counting implements ActionListener{
    JLabel lbl;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    void GUI(){
        JFrame frm= new JFrame();
        Container con = frm.getContentPane();
        con.setLayout(new GridLayout(0,1));
        lbl = new JLabel("Learn to Count in japanese");
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setFont(new Font("MV Boli",Font.BOLD,25));
        lbl.setForeground(Color.BLACK);

        btn1= new JButton("One");
        btn2= new JButton("Two");
        btn3= new JButton("Three");
        btn4= new JButton("Four");

        con.add(lbl);
        con.add(btn1);
        con.add(btn2);
        con.add(btn3);
        con.add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        btn1.setBackground(Color.CYAN);
        btn2.setBackground(Color.BLUE);
        btn3.setBackground(Color.ORANGE);
        btn4.setBackground(Color.GRAY);

        frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        Counting obj = new Counting();
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
