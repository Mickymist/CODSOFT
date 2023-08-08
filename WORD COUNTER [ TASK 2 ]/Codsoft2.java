/*Code by : SHUBHAM SWARNAKAR
 TASK 2 : WORD COUNTER
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;    
public class Codsoft2 {  
public static void main(String[] args) {  
    //background image
    ImageIcon background_image = new ImageIcon("jp.jpg");
    Image img = background_image.getImage();
    Image temp_img = img.getScaledInstance(900, 600,Image.SCALE_SMOOTH);
    background_image = new ImageIcon(temp_img, null);
    JLabel background = new JLabel("", background_image, JLabel.CENTER);
    background.setBounds(0, 0, 900, 600);

    //frame
    JFrame f=new JFrame("Button Example");  
    //textarea
    JTextArea tf=new JTextArea("ENTER TEXT HERE:-");  
    //lable
    JLabel l1 = new JLabel(null, null, 0);
    l1.setBounds(150,75,100,30);  
    tf.setBounds(120,100, 600,300);  
    //button
    JButton b=new JButton("Click me");  
    b.setBounds(380,400,95,50);
    tf.setFont(new Font("arial",Font.BOLD,15));  
    b.addActionListener(new ActionListener(){  

        //action performed
public void actionPerformed(ActionEvent e){  
            b.setBackground(Color.GREEN);
            
    String x = tf.getText();
    char y;
    char z;
    int n =1;
    boolean t = true;
    boolean f = false;
    boolean o = false;
    for (int i = 0; i<x.length();i++){
    y = x.charAt(i);
    if(t){
    if(' ' == y){n--;}
    else if(y != ' '){ t=false; f = true;}
    }
    if(' ' == y){n++;}
    if(o){
        z = x.charAt(i-1);
    if(' ' == y && ' '== z){n--;}
    }
    if (o){
    if(' ' == y && i == x.length()-1){n--;}
    }
    if(f){o = true;}

    }
    tf.setText("total number words ="+n);
    l1.setText("Words: "+n);  


        }  
    });  
    f.add(b);f.add(tf); f.add(l1); 
    f.setSize(900,600);  
    f.setLayout(null);  
    f.setBackground(Color.BLACK);
    f.setVisible(true);   
    f.add(background);

}  
}  