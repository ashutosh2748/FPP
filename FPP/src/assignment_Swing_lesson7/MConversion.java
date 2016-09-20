package assignment_Swing_lesson7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MConversion extends JFrame {
	public static void main(String[] args) {
		MConversion con= new MConversion();
		con.setVisible(true);
		
		
	}
	 
	public MConversion(){
		setTitle("Metric Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150,150,450,450);
	
		JPanel contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(30, 30, 10, 10));
		
		contentPane.setLayout(null);
		contentPane.setBounds(30,30,400,400);
		add(contentPane);
		//setContentPane(contentPane);
		
		JLabel mile= new JLabel("Mile:");
		contentPane.add(mile);
		mile.setBounds(0, 0, 100, 20);
		
		JTextField fieldmile= new JTextField(20);
		contentPane.add(fieldmile);
		fieldmile.setBounds(100, 0, 75,25);
		
		JLabel Kilometre= new JLabel("Kilometre:");
		contentPane.add(Kilometre);
		Kilometre.setBounds(200, 0, 100, 20);
		
		JTextField fieldkilo= new JTextField(20);
		contentPane.add(fieldkilo);
		fieldkilo.setBounds(300, 0, 75,25);
		
		JLabel pound= new JLabel("Pound:");
		contentPane.add(pound);
		pound.setBounds(0, 30, 100, 20);
		
		JTextField fieldpound= new JTextField(20);
		contentPane.add(fieldpound);
		fieldpound.setBounds(100, 30, 75,25);
		
		JLabel kg= new JLabel("Kilogram:");
		contentPane.add(kg);
		kg.setBounds(200, 30, 100, 20);
		
		JTextField fieldkg= new JTextField(20);
		contentPane.add(fieldkg);
		fieldkg.setBounds(300, 30, 75,25);
		
		
		
		JLabel gallon= new JLabel("Gallon:");
		contentPane.add(gallon);
		gallon.setBounds(0, 60, 100, 20);
		
		JTextField fieldgallon= new JTextField(20);
		contentPane.add(fieldgallon);
		fieldgallon.setBounds(100, 60, 75,25);
		
		JLabel liter= new JLabel("Liter:");
		contentPane.add(liter);
		liter.setBounds(200, 60, 100, 20);
		
		JTextField fieldliter= new JTextField(20);
		contentPane.add(fieldliter);
		fieldliter.setBounds(300, 60, 75,25);
		
		JLabel fahrenheit= new JLabel("Fahrenheit:");
		contentPane.add(fahrenheit);
		fahrenheit.setBounds(0, 90, 100, 20);
		
		JTextField fieldfah= new JTextField(20);
		contentPane.add(fieldfah);
		fieldfah.setBounds(100, 90, 75,25);
		
		JLabel centigrade= new JLabel("Centigrade:");
		contentPane.add(centigrade);
		centigrade.setBounds(200, 90, 100, 20);
		
		JTextField fieldcenti= new JTextField(20);
		contentPane.add(fieldcenti);
		fieldcenti.setBounds(300, 90, 75,25);
		
		//button
		
		JButton jb= new JButton("Convert");
		contentPane.add(jb);
		jb.setBounds(150, 120, 100, 30);
		
		jb.addActionListener(
				evt -> {
			double miles = Double.parseDouble(fieldmile.getText());
			double kilos;
			kilos=miles*1.609;
			fieldkilo.setText(Double.toString(kilos));
			
			double pounds=Double.parseDouble(fieldpound.getText());
			double kgg;
			kgg=pounds/2.20462;
			fieldkg.setText(Double.toString(kgg));
			
			double gallons=Double.parseDouble(fieldgallon.getText());
			double liters;
			liters=gallons*(3.78541);
			fieldliter.setText(Double.toString(liters));
			
			double fahreheit=Double.parseDouble(fieldfah.getText());
			double centiGrades;
			centiGrades=(fahreheit-32)*5/9;
			fieldcenti.setText(Double.toString(centiGrades));
			
		});
		
		
		
	} 
	
	}
