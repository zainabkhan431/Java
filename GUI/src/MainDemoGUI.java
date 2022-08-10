import java.awt.*;
import javax.swing.*;
class MainDemoGUI{
    public static void main(String arg[])
    {
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        BorderLayout bly = new BorderLayout();
        con.setLayout(bly);
        Panel pnl = new Panel();
        con.setLayout(new GridLayout(5,4));
        TextField txt = new TextField();
        JButton[] btn = new JButton[5];
        for(int i = 0 ;i<btn.length ;i++) {
            btn[i] = new JButton((i+1) + "");
            //con.add(btn[i]);
            //pnl.add(btn[i]);
        }
        con.add(txt,BorderLayout.NORTH);
      //  con.add(pnl,BorderLayout.CENTER);
        frm.setSize(300,400);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
