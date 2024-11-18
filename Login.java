package hospital.managaement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    //ALWAYS DECLARE THE TEXT-FIELD GLOBALLY !
    JTextField textField; //the area where text will be entered
    JPasswordField jPasswordField;
    JButton b1, b2;

    Login(){
        //label to show desired text inside the frame:
        JLabel nameLabel = new JLabel("Username");
        //at which pos the label should be displayed :
        nameLabel.setBounds(40, 20, 100, 30);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        nameLabel.setForeground(Color.black);
        add(nameLabel); //add it to the frame
        getContentPane().setBackground(new Color(109, 164, 170));


        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 30);
        password.setFont(new Font("Tahoma", Font.BOLD, 16));
        password.setForeground(Color.black);
        add(password);


        textField = new JTextField();
        textField.setBounds(150, 20, 150, 30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(new Color(255, 179, 0));
        add(textField);


        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 70, 150, 30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(255, 179, 0));
        add(jPasswordField);


        //we get our icon from the "icon" folder which is in the same destination of our "src" folder. && simultaneously our "login.png" img gets saved into the "imageIcon"
        // ENSURE TO ENTER THE NAMES CORRECTLY !!!!
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        //we need to scale our icon a/c to our frame size
        Image i1 = imageIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1); //placement of the scaled icon
        JLabel label = new JLabel(imageIcon1); //placement of the above icon on the jFrame
        label.setBounds(320, -90, 400, 500);//customize the labels
        add(label);


        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);


        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);


        //ensure all the below elements should remain at the bottom
        setSize(750, 300);
        setLocation(400,270); // to set the proper location of our frame
        setLayout(null); //since the default layout of JFrame is border-layout
        setVisible(true); //by default the visibility is hidden

    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            try{
                Conn c = new Conn();
                String user = textField.getText();
                String pass = jPasswordField.getText();

                String q = "select * from login where ID = '"+user+"' and PW = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if(resultSet.next()){
                   new Reception();
                   setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }catch (Exception E){
                E.printStackTrace();
            }
        }
        else{
            System.exit(10);
        }
    }
}
