import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener{
JFrame frame;
JButton b[];
JTextField tf;
JPanel panel;
double firstNumber;
double secondNumber;
char op;
Calculator(){
  frame = new JFrame("Calculator");
  
  Font f = new Font("Arial",Font.BOLD,30);
  
  tf = new JTextField();
  tf.setFont(f);
  
  panel = new JPanel();
  panel.setLayout(new GridLayout(5,4,20,20));
 
  b = new JButton[20];
  for(int i=0;i<9;i++){
    b[i] = new JButton((i+1)+"");
    }
  b[9] = new JButton("0");
  b[10] = new JButton(".");
  b[11] = new JButton("+");
  b[12] = new JButton("-");
  b[13] = new JButton("*");
  b[14] = new JButton("/");
  b[15] = new JButton("%");
  b[16] = new JButton("1/X");
  b[17] = new JButton("X^2");
  b[18] = new JButton("C");
  b[19] = new JButton("=");
  
  for(int i =0 ; i<20;i++){
    b[i].setFont(f);
    b[i].addActionListener(this);
    panel.add(b[i]);
    }
  frame.add(tf, BorderLayout.NORTH);  
  frame.add(panel, BorderLayout.CENTER);  
  frame.setSize(500, 600);
  frame.setVisible(true);
  }

public static void main(String arv[]){
  new Calculator();
  }
public void actionPerformed(ActionEvent e){
  String s = e.getActionCommand();
  switch(s){
    case "1":
      tf.setText(tf.getText()+1);
      break;
    case "2":
      tf.setText(tf.getText()+2);
      break;
    case "3":
      tf.setText(tf.getText()+3);
      break;
    case "4":
      tf.setText(tf.getText()+4);
      break;
    case "5":
      tf.setText(tf.getText()+5);
      break;
    case "6":
      tf.setText(tf.getText()+6);
      break;
    case "7":
      tf.setText(tf.getText()+7);
      break;
    case "8":
      tf.setText(tf.getText()+8);
      break;
    case "9":
      tf.setText(tf.getText()+9);
      break;
    case "0":
      tf.setText(tf.getText()+0);
      break;
    case ".":
      tf.setText(tf.getText()+".");
      break;
    case "1/X":
      double d = Double.parseDouble(tf.getText());
      tf.setText((1/d)+"");
      break;
    case "X^2":
      tf.setText(Math.pow(Double.parseDouble(tf.getText()),2)+"");
      break;
    case "C":
      tf.setText("");
      break;
    case "+":
        firstNumber = Double.parseDouble(tf.getText());
        tf.setText("");
        op = '+';
        break;
    case "-":
        firstNumber = Double.parseDouble(tf.getText());
        tf.setText("");
        op = '-';
        break;
    case "*":
        firstNumber = Double.parseDouble(tf.getText());
        tf.setText("");
        op = '*';
        break;    
    case "/":
        firstNumber = Double.parseDouble(tf.getText());
        tf.setText("");
        op = '/';
        break;  
    case "%":
        firstNumber = Double.parseDouble(tf.getText());
        tf.setText("");
        op = '%';
        break;  
    case "=":
        secondNumber = Double.parseDouble(tf.getText());
        switch(op){
          case '+':
            tf.setText((firstNumber + secondNumber)+"");
            break;
          case '-':
            tf.setText((firstNumber - secondNumber)+"");
            break;
          case '*':
            tf.setText((firstNumber * secondNumber)+"");
            break;
          case '/':
            tf.setText((firstNumber / secondNumber)+"");
            break;  
          case '%':
            tf.setText((firstNumber % secondNumber)+"");
            break;
          }  
    }
  }
}