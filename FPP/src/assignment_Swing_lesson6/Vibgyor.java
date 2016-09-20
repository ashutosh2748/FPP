package assignment_Swing_lesson6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Dimension;

public class Vibgyor extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	//JPanel f1=new JPanel();
	JButton[] j={new JButton(),new JButton(),new JButton(),new JButton(),new JButton(),new JButton(),new JButton()};
	
	Vibgyor()
	{
		
	//a=new JFrame();
		//a.add(f1);
	FlowLayout t=new FlowLayout();
	setLayout(t);
	
	//setLayout(null);
		
		setBounds(200,400,600,400);
		
			for(int i=0;i<j.length;i++)
		{
				
				j[i].setPreferredSize(new Dimension(80,100));
				add(j[i]);
					
		}
		j[0].setBackground(Color.red);
		j[1].setBackground(Color.orange);
		j[2].setBackground(Color.yellow);
		j[3].setBackground(Color.green);
		j[4].setBackground(Color.blue);
		j[5].setBackground(Color.CYAN);
		j[6].setBackground(Color.magenta);
		
	//	add(f1);
		String [] test= {"Red signifies passion, vitality, enthusiasm and security. It is the light with the longest wavelength.",
				"It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control",
				"It represents clarity of thought, wisdom, orderliness and energy.",
				"This is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth.",
				"The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.",
				"It is believed that where Blue is calming, Indigo is sedating. Indigo is mystical as it bridges the Gap between Finite and Infinite.",
				" It is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists"};
		
		
		j[0].addActionListener(
				
				evt -> {
				JOptionPane.showMessageDialog(getContentPane(), test[0], "Information",1);
					}
				               );
j[1].addActionListener(
				
				evt -> {
				JOptionPane.showMessageDialog(getContentPane(), test[1], "Information",1);
					}
				               );
j[2].addActionListener(
		
		evt -> {
		JOptionPane.showMessageDialog(getContentPane(), test[2], "Information",1);
			}
		               );
j[3].addActionListener(
		
		evt -> {
		JOptionPane.showMessageDialog(getContentPane(), test[3], "Information",1);
			}
		               );
j[4].addActionListener(
		
		evt -> {
		JOptionPane.showMessageDialog(getContentPane(), test[4], "Information",1);
			}
		               );
j[5].addActionListener(
		
		evt -> {
		JOptionPane.showMessageDialog(getContentPane(), test[5], "Information",1);
			}
		               );
j[6].addActionListener(
		
		evt -> {
		JOptionPane.showMessageDialog(getContentPane(), test[6], "Information",1);
			}
		               );

}
		

		
	
	public static void main(String [] args)
	
	{
		JFrame obj=new Vibgyor();
		obj.setVisible(true);
		
	}
	
	
}
