/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   package coustomerinfogui; 

    import java.awt.Container;
    import java.awt.GridBagConstraints;
    import java.awt.GridBagLayout;
    import java.awt.Insets;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.SwingConstants;


    public class CoustomerinfoGUI {

   
    public static void main(String[] args) {
    JLabel l;
    JTextField t;
    JButton b;
    
    JFrame f = new JFrame("");
    Container cp = f.getContentPane();
    cp.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    c.gridx = 0;
    c.insets = new Insets(2, 2, 2, 2);
    c.anchor = GridBagConstraints.EAST;

    cp.add(l = new JLabel("Customer_id:", SwingConstants.RIGHT), c);
    cp.add(l = new JLabel("FirstName:", SwingConstants.RIGHT), c);
    cp.add(l = new JLabel("LastName:", SwingConstants.RIGHT), c);
    cp.add(l = new JLabel("Address:", SwingConstants.RIGHT), c);
    cp.add(l = new JLabel("phone_no:", SwingConstants.RIGHT), c);
    cp.add(l = new JLabel("Type:", SwingConstants.RIGHT), c); 
    cp.add(b = new JButton("Clear"), c);
    
    c.gridx = 1;
    c.gridy = 0;
    c.weightx = 1.0;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.anchor = GridBagConstraints.CENTER;
    c.gridx = 1; 
    c.gridy = GridBagConstraints.RELATIVE;
    
    cp.add( new JTextField(35), c);
    cp.add(new JTextField(35), c);
    cp.add(new JTextField(35), c);
    cp.add( new JTextField(35), c);
    cp.add( new JTextField(35), c);
    cp.add( new JTextField(35), c);
    cp.add(b = new JButton("OK"), c);
    f.pack(); 
    f.setVisible(true);
    }
    
}
