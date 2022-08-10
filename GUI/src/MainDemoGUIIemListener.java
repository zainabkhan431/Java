import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainDemoGUIItemListener implements ItemListener{
    JLabel lbl;
    List lst;

    void myGUI() {
        JFrame  frm = new JFrame ();
        Container con = frm.getContentPane();
        con.setLayout(new FlowLayout(5));
        lbl = new JLabel();
        lst = new List(3, false);
        lst.add("Zainab");
        lst.add("Alisha");
        lst.add("Khadijah");
        lst.add("Azka");
        lst.add("Tehreem");
        lst.addItemListener(this);
        con.add(lbl);
        con.add(lst);
        frm.setSize(500, 500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("notepad-icon-7.png");
        frm.setIconImage(image.getImage());
    }
    public static void main (String arg[]) {
        MainDemoGUIItemListener o = new MainDemoGUIItemListener();
        o.myGUI();
    }
    public void itemStateChanged(ItemEvent e){
        String itemText = lst.getSelectedItem();
        int i = lst.getSelectedIndex();
        lbl.setText("index:" + i + " "+ itemText);
    }
}


