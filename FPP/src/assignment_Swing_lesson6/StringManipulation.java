package assignment_Swing_lesson6;

//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class StringManipulation extends JFrame implements ActionListener{
	
	JPanel jpt=new JPanel();
	JLabel jc=new JLabel("Input");
	String str="missisipi";
	JTextField testString=new JTextField(str);
	JLabel jp=new JLabel("Output");
	JTextField outputString=new JTextField();
	JButton count = new JButton("Count Letters");
	JButton reverse = new JButton("Reverse Letters");
	JButton duplicate=new JButton("Remove Duplicates");
	static String removeDuplicates(String s) {
	    StringBuilder noDupes = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        String si = s.substring(i, i + 1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
	    return noDupes.toString();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int lengthl=testString.getText().length();
		if(e.getSource()==count)
		{
			
			//String input=str.toString();
			
			outputString.setText(String.valueOf(lengthl));
		}
		else if(e.getSource()==reverse){
			String strrev=new StringBuilder(testString.getText()).reverse().toString();
			
			outputString.setText(strrev);
		}
		else if(e.getSource()==duplicate)
		{
			outputString.setText(removeDuplicates(testString.getText()));
		}
	}
	
	public StringManipulation()
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
	outputString.setBounds(100,70, 100, 20);
	count.setBounds(20,100,150,20);
	reverse.setBounds(20,200,150,20);
	duplicate.setBounds(20,300,150,20);
	add(jp);
	add(jpt);
	add(jc);
	add(testString);
	add(count);
	add(reverse);
	add(duplicate);
	add(outputString);
	count.addActionListener(this);
	reverse.addActionListener(this);
	duplicate.addActionListener(this);
	
	
	}
	
	public static void main(String [] args)
	{
	//JFrame frame=new JFrame();
	JFrame obj=new StringManipulation();
	obj.setVisible(true);
	
	
	}

}
