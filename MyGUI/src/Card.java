import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
public class Card extends Applet implements ActionListener {
    JPanel pnlControl;
    JPanel pnlCards;
    JLabel lblA;
    JLabel lblB;
    JLabel lblC;
    JLabel lblD;
    JLabel lblE;
    JButton btn1;
    JButton btn5;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    Card card;
    void CardDemo(){
        JFrame frm = new JFrame();
        Container con = frm.getContentPane();
        pnlControl = new JPanel();
        btn1 = new JButton("|«");
        btn2 = new JButton("<==");
        btn3 = new JButton("C");
        btn4 = new JButton("==>");
        btn5 = new JButton(">>|");

        pnlCards = new JPanel();
        card= new Card();
        lblA = new JLabel("A");
        lblB = new JLabel("B");
        lblC = new JLabel("C");
        lblD = new JLabel("D");
        lblE = new JLabel("E");

        frm.setLayout(new BorderLayout());
        con.add(pnlCards,BorderLayout.CENTER);
        con.add(pnlControl,BorderLayout.SOUTH);

        pnlControl.setLayout(new FlowLayout());
        pnlControl.add(btn1);
        pnlControl.add(btn2);
        pnlControl.add(btn3);
        pnlControl.add(btn4);
        pnlControl.add(btn5);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        pnlCards.setLayout(new CardLayout());
        pnlCards.add(lblA,"A");
        pnlCards.add(lblB,"B");
        pnlCards.add(lblC,"C");
        pnlCards.add(lblD,"D");
        pnlCards.add(lblE,"E");
        lblA.setHorizontalAlignment(JLabel.CENTER);
        lblA.setVerticalAlignment(JLabel.CENTER);
        lblB.setHorizontalAlignment(JLabel.CENTER);
        lblB.setVerticalAlignment(JLabel.CENTER);
        lblC.setHorizontalAlignment(JLabel.CENTER);
        lblC.setVerticalAlignment(JLabel.CENTER);
        lblD.setHorizontalAlignment(JLabel.CENTER);
        lblD.setVerticalAlignment(JLabel.CENTER);
        lblE.setHorizontalAlignment(JLabel.CENTER);
        lblE.setVerticalAlignment(JLabel.CENTER);
        frm.setSize(500,500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        Card obj= new Card();
        obj.CardDemo();
    }
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if(command.equals("|«"));
        {

        }


    }



}
