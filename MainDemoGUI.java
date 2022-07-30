import java.util.*;
class MainDemoGUI{
 public static void main(String arg[])
  {
    JFrame frm = new JFrame();
   Container con = frm.getContentPane();
   FlowLayout fly = new FlowLayout();
   con.setLayout(fly);
   JButton btn = new JButton("Click Me");
   con.add(btn);
   frm.setSize(300,400);
   frm.setVisible(true);
   frm.aetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
