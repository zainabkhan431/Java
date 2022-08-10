import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String Arg[])
    {
       // ImageIcon image = new ImageIcon("(logo.jpg)");
        JFrame frm = new JFrame("JLabel");
        Border border = BorderFactory.createLineBorder(Color.BLUE,3);
        JLabel lbl = new JLabel();

        lbl.setIcon(new ImageIcon("C:\\Users\\Khizar\\Desktop\\notepad.png"));
        lbl.setText("Bro,Do you Even Code?");
        lbl.setVerticalTextPosition(JLabel.TOP);
        lbl.setHorizontalTextPosition(JLabel.CENTER);
        lbl.setIconTextGap(50);
        lbl.setForeground(Color.RED);
        lbl.setFont(new Font("MV BOLi", Font.ITALIC,20));
        lbl.setBorder(border);
        lbl.setBackground(Color.GRAY);
        lbl.setOpaque(true);
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setHorizontalAlignment(JLabel.CENTER);


      //  frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(lbl);
        frm.pack();
    }
}
