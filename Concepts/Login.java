import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Desktop;
import java.net.URL;


public class Login extends JFrame implements ActionListener{
   JPanel panel;
   JLabel user, password, message;
   JTextField userNameText;
   JPasswordField passwordText;
   JButton buttonlogin, reset, googleButton, youTubeButton;
   public void login(){
   
      user = new JLabel();
      user.setText("Username :");
      userNameText = new JTextField();
   
      password = new JLabel();
      password.setText("Password :");
      passwordText = new JPasswordField();
   
      buttonlogin = new JButton("Login");
      panel = new JPanel(new GridLayout(10,1));
      panel.add(user);
      panel.add(userNameText);
      panel.add(password);
      panel.add(passwordText);
      message = new JLabel(); 
      panel.add(message);
      panel.add(buttonlogin);
   
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonlogin.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Sign In: ");
      setSize(500, 500);
      setVisible(true);
   }
   
   public static void main(String[] args) {
      Login mylogin = new Login();
      mylogin.login();
   } 
   
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userNameText.getText();
      String pass = passwordText.getText();
   
      
      if (userName.trim().equals("Anirudh") && pass.trim().equals("java")){
         message.setText("Welcome " + userName + " ");
         
         try {
        Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
    } catch (Exception e) {
        e.printStackTrace();
    }
    
      } else {
         message.setText("Username or Password is entered incorrecly");
       } 
    }
}
