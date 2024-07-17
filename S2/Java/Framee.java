import java.awt.*;
import java.awt.event.*;
public class  Framee extends Frame implements ActionListener
{
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4;
	Button b;
	Framee()
	{
		setLayout(new FlowLayout());
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		l1=new Label("number 1");
		l2=new Label("number 2");
		l3=new Label("number 3");
		l4=new Label("Result");
		b=new Button("check");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		add(l4);
		add(t4);
	
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		b.addActionListener(this);
	}	
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c,result;
		
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=Integer.parseInt(t3.getText());
			if(a>b && a>c)
				result=a;
			else if(b>c)
				result=b;
			else
				result=c;
			t4.setText(Integer.toString(result));
		
	}
	public static void main(String arg[])
	{
		Framee ob=new Framee();
		ob.setVisible(true);
		ob.setSize(200,300);
	}
}