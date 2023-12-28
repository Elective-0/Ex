import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();
  JTextField txf1 = new JTextField("12");
  JTextField txf2 = new JTextField("3");
  JLabel lblop = new JLabel();
  JLabel lblout = new JLabel();  
  JLabel lblequ = new JLabel("=");
  JButton butadd = new JButton("+");
  JButton butsub = new JButton("-");
  JButton butmul = new JButton("*");
  JButton butdiv = new JButton("/");
  JButton butExit = new JButton("Exit");

  public Calculator() {
    super("Calculator");

    this.setSize(400, 300);

    GridLayout lay1 = new GridLayout(3,1,5,5);
    this.setLayout(lay1);
    this.add(p1);
    this.add(p2);
    this.add(p3);

    GridLayout lay2 = new GridLayout(1,5,5,5);
    p1.setLayout(lay2);
    p1.add(txf1);
    p1.add(lblop);
    p1.add(txf2);
    p1.add(lblequ);
    p1.add(lblout);

    GridLayout lay3 = new GridLayout(1,4,5,5);
    p2.setLayout(lay3);
    p2.add(butadd);
    p2.add(butsub);
    p2.add(butmul);
    p2.add(butdiv);

    GridLayout lay4 = new GridLayout(1,1,5,5);
    p3.setLayout(lay4);
    p3.add(butExit);

    butadd.addActionListener(this);
    butsub.addActionListener(this);
    butmul.addActionListener(this);
    butdiv.addActionListener(this);
    butExit.addActionListener(this);
  }

  public static void main(String args[]) {
    Calculator frm = new Calculator();
    frm.setDefaultCloseOperation(3);
    frm.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String s1 = txf1.getText();
    String s2 = txf2.getText();

    int t1 = Integer.parseInt(s1);
    int t2 = Integer.parseInt(s2);
    int t = 0;

    if (e.getSource() == butExit) {
      System.exit(0);
    }

    if (e.getSource() == butadd) {
      t = t1 + t2;
      lblop.setText("+");
    }

    if (e.getSource() == butsub) {
      t = t1 - t2;
      lblop.setText("-");
    }

    if (e.getSource() == butmul) {
      t = t1 * t2;
      lblop.setText("*");
    }

    if (e.getSource() == butdiv) {
      t = t1 / t2;
      lblop.setText("/");
    }

    lblout.setText(Integer.toString(t));
  }
}
