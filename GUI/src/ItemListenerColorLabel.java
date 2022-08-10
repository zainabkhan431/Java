import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ItemListenerColorLabel implements ItemListener{
    JLabel lbl;
    List lst;

    void MyGUI() {
        JFrame frm = new JFrame ();
        Container con = frm.getContentPane();
        con.setLayout(new FlowLayout());
        lst = new List(3,false);
        lbl = new JLabel("NFC IET MULTAN");
        Font fnt = new Font("Times New Roman", Font.BOLD, 15);
        lst.add("RED");
        lst.add("YELLOW");
        lst.add("BLUE");
        lst.add("PURPLE");
        lst.addItemListener(this);
        con.add(lbl);
        con.add(lst);
        frm.setSize(500, 500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE);
    }
    public static void main(String arg[]) {
        ItemListenerColorLabel o = new ItemListenerColorLabel();
        o.MyGUI();
    }
    public void itemStateChanged(ItemEvent e){
        String TextField = lst.getSelectedItem();
        if(TextField=="RED")
        {
            lbl.setForeground(Color.RED);
        } else if (TextField=="YELLOW") {
           lbl.setForeground(Color.YELLOW);
       } else if (TextField=="BLUE"){
          lbl.setForeground(Color.BLUE);
        }else if(TextField=="PURPLE"){
          lbl.setForeground(Color.PINK);
        }
        int i=lst.getSelectedIndex();

        lbl.setText("index:" + i + " "+ TextField);
    }
}