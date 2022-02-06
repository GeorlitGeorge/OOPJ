import java.awt.*;
import java.awt.event.*;


public class SignInPage extends Frame implements ActionListener{
    TextField textField1;
    TextField textField2;

    
    SignInPage(){
        //Frame Settings
        setTitle("SignIn Page");
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        
        //Label Settings
        Label label1 = new Label();
        label1.setBounds(100, 100, 50, 50);
        label1.setSize(400,100);
        label1.setText("Email ID : ");
        
        
        
        TextField textField1 = new TextField(20);
        textField1.setBounds(200, 100, 200, 50);
        

        Label label2 = new Label();
        label2.setBounds(100, 200, 200, 50);
        label2.setSize(400,100);
        label2.setText("Password : ");
        
        
        TextField textField2 = new TextField(20);
        textField2.setBounds(200, 200, 50, 50);
        
        
        
        Button button = new Button("SignIn");
        button.setBounds(300, 300, 90, 25);
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(button);
        button.addActionListener(this);
        

         
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("E-mail  : " +textField1.getText());
        System.out.println("Password  : " +textField2.getText());
        
    }

    public static void main(String[] args) {
        new SignInPage();
        
        
    }

}
