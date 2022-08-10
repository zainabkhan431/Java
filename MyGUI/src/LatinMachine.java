import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class LatinMachine implements ActionListener{
    JLabel lbl1;
    JTextField txt;
    JButton btn;
    JLabel lbl2;
    void GUI(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        lbl1= new JLabel("Enter the phrase and press the Button");
        txt= new JTextField();
        btn= new JButton("OK");
        lbl2=new JLabel();
        con.setLayout(new GridLayout(0,1));
        JPanel pnl = new JPanel(new FlowLayout());
        pnl.add(btn);
        con.add(lbl1);
        con.add(txt);
        con.add(pnl);
        con.add(lbl2);
        btn.addActionListener(this);
        frm.setSize(300,300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        LatinMachine ltn = new LatinMachine();
        ltn.GUI();
    }
    public void actionPerformed(ActionEvent e){
        String original = lbl2.getText();
        String word = "";
        String firstChar="";
        String restofword="";
        String latinword="";
        String Vowels="AEIOUaeiou";

        StringTokenizer reader = new StringTokenizer(original);
        while(reader.hasMoreTokens()){
            word= reader.nextToken();
            firstChar=word.substring(0,1);
            restofword=word.substring(1);
            if(Vowels.indexOf(firstChar)==-1){
                latinword+= restofword + firstChar +"ay";

            }else
            {
                latinword+=word+"way";

            }
            //lbl2.setText(latinword);
        }
        lbl2.setText(latinword);
    }

}
