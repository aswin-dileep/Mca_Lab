//Write a java program using awt to create a calcultor
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
    Calculator(){
        Frame f = new Frame();
        Label l1 = new Label("Enter number");
        Label l2 = new Label("Enter number");
        Label l3 = new Label("result");

        TextField t1 = new TextField(20);
        TextField t2 = new TextField(20);
        TextField t3 = new TextField(20);

        Button b1 = new Button("+");
        Button b2 = new Button("-");
        Button b3 = new Button("*");
        Button b4 = new Button("/");
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
    
        f.add(l1);
        f.add(l2);
        f.add(l3);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());

        if(e.getSource()==b1){
            t3.setText(String.valueOf(i+j));
        }
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
    }
}