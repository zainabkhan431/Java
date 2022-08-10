import java.awt.*;
import javax.swing.*;
class MyFrame{
public static void main(String arg[])
{
  JFrame frm = new JFrame();
  frm.setSize(300,300);
frm.setVisible(true);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.getContentPane().setBackground(Color.BLUE);
ImageIcon image = new ImageIcon("‪logo.jpg");
frm.setIconImage(image.getImage());
 }
}