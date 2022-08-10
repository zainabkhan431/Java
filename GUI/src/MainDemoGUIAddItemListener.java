import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainDemoGUIItemListenerAddItem implements ItemListener, ActionListener
{
    JLabel lbl;
    List lst;
    TextField txt;
    JButton btn;

    void myGUI(){
        JFrame  frm = new JFrame ();
        Container con=frm.getContentPane();
        con.setLayout(new GridLayout(3,1,0,10));
        txt= new TextField();
        btn = new JButton("Add Item");
        lst= new List(3,false);
        btn.addActionListener(this);
        con.add(txt);
        con.add(btn);
        con.add(lst);
        frm.setSize(300,400);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE);

    }
    public static void main(String[] arg)
    {
        MainDemoGUIItemListenerAddItem o= new MainDemoGUIItemListenerAddItem();
        o.myGUI();
    }
    public void actionPerformed(ActionEvent e)
    {
        lst.add(txt.getText());

    }
    public void itemStateChanged(ItemEvent e)
    {

    }
}

