package lesson6Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NumberToWords extends JFrame implements ActionListener{
	
	JPanel jpt=new JPanel();
	JLabel jc=new JLabel("Input");
	String str="1234";
	JTextField testString=new JTextField(str);
	JLabel jp=new JLabel("Output");
	JTextField outputString=new JTextField();
	JButton convert = new JButton("Convert to Words");
	//JButton reverse = new JButton("Reverse Letters");
	//JButton duplicate=new JButton("Remove Duplicates");
	static String numToWords(String s) {
		StringBuilder test=new StringBuilder();
		//test.append(s);
		int i=0;
		for(;i<s.length();i++)
		{
			switch (s.charAt(i))
			{
			case '1' : {test.append("one ");break;}
			case '2' : {test.append("two ");break;}
			case '3' : {test.append("three ");break;}
			case '4' : {test.append("four ");break;}
			case '5' : {test.append("five ");break;}
			case '6' : {test.append("six ");break;}
			case '7' : {test. append("seven ");break;}
			case '8' : {test.append("Eight ");break;}
			case '9' : {test.append("nine ");break;}
			case '0' : {test.append("zero ");break;}
				
			}
		}
	    return test.toString();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==convert)
		{
			
			//String input=str.toString();
			
			outputString.setText(numToWords(testString.getText()));
		}
		
	}
	
	public NumberToWords()
	{
	//super();
	setTitle("String Manipulation Page");
	setBounds(0,0,800,800);
	setVisible(true);
	
	setLayout(null);
	//jpt.setBounds(20,20,50,50);
	jc.setBounds(20,20,100,20);
	testString.setBounds(100,20,100,20);
	jp.setBounds(20,70,100,20);
	outputString.setBounds(100,70, 300, 20);
	convert.setBounds(20,100,150,20);
	
	add(jp);
	add(jpt);
	add(jc);
	add(testString);
	add(convert);
	
	add(outputString);
	convert.addActionListener(this);
	
	
	
	}
	
	public static void main(String [] args)
	{
	//JFrame frame=new JFrame();
	JFrame obj=new NumberToWords();
	obj.setVisible(true);
	
	
	}

}
