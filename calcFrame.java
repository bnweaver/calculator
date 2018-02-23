package Calculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Calculator.basic;

public class calcFrame extends JFrame implements ActionListener {
	
	static JFrame calculator;
	static boolean dec = false;

	JPanel calc = new JPanel();
	JPanel functions = new JPanel(new GridLayout(5, 4, 2, 2));
	static JLabel screen = new JLabel("", SwingConstants.RIGHT);
	
	JMenuBar bar = new JMenuBar();
	JMenu menu = new JMenu("Calculator Options");
	JMenuItem fourfunction = new JMenuItem("Four-Function Calculator");
	JMenuItem scientific = new JMenuItem("Scientific Calculator");
	
	JButton allclear = new JButton("AC");
	JButton clear = new JButton("C");
	JButton percent = new JButton("%");
	JButton divide = new JButton("÷");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton multiply = new JButton("x");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton subtract = new JButton("-");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton addition = new JButton("+");
	JButton zero = new JButton("0");
	JButton decimal = new JButton(".");
	JButton negative = new JButton("(-)");
	JButton equal = new JButton("=");
	JButton submit = new JButton("Enter");
	
	Font newfont = new Font("Digital-7", Font.BOLD, 16);
	
	public calcFrame () {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		setJMenuBar(bar);
		bar.add(menu);
		menu.add(fourfunction);
		menu.add(scientific);
		
		
		add(calc, BorderLayout.CENTER);
		calc.setLayout(new BoxLayout(calc, BoxLayout.Y_AXIS));
		
		screen.setAlignmentX(Component.RIGHT_ALIGNMENT);
		screen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		screen.setFont(newfont);
		functions.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		calc.add(Box.createRigidArea(new Dimension(0,10)));
		calc.add(screen);
		calc.add(Box.createRigidArea(new Dimension(0, 10)));
		calc.add(functions);
		
		
		functions.add(allclear);
		functions.add(clear);
		functions.add(percent);
		functions.add(divide);
		functions.add(seven);
		functions.add(eight);
		functions.add(nine);
		functions.add(multiply);
		functions.add(four);
		functions.add(five);
		functions.add(six);
		functions.add(subtract);
		functions.add(one);
		functions.add(two);
		functions.add(three);
		functions.add(addition);
		functions.add(zero);
		functions.add(decimal);
		functions.add(negative);
		functions.add(equal);
		
		setSize(300, 300);
		setVisible(true);
		
		fourfunction.addActionListener(this);
		scientific.addActionListener(this);
		allclear.addActionListener(this);
		clear.addActionListener(this);
		percent.addActionListener(this);
		divide.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		multiply.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		subtract.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		addition.addActionListener(this);
		zero.addActionListener(this);
		decimal.addActionListener(this);
		negative.addActionListener(this);
		equal.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a) {
		Object source = a.getSource();
		
		if (source == fourfunction)
			calculator = new calcFrame();
		
		if (source == scientific)
		
		if (source == allclear) {
			screen.setText("");
			basic.function = 0;
		}
		if (source == clear) {
			screen.setText("");
		}		
		if (source == percent) {
			basic.percent();
		}
		
		if (source == divide) {
			basic.divide();
		}
		if (source == multiply) {
			basic.multiply();
		}
		if (source == subtract) {
			basic.subtract();
		}
		if (source == addition) {
			basic.add();
		}
		if (source == equal) {
			basic.equal();
		}
		
		if (source == seven) {
			if (basic.function != 0 && dec == false) 
				screen.setText("7");
			else if (dec == true)
				screen.setText(screen.getText() + "7");
			else
				screen.setText(screen.getText() + "7");
		}
		if (source == eight) {
			if (basic.function != 0 && dec == false)
				screen.setText("8");
			else if (dec == true)
				screen.setText(screen.getText() + "8");
			else 
				screen.setText(screen.getText() + "8");
		}
		if (source == nine) {
			if (basic.function != 0 && dec == false)
				screen.setText("9");
			else if (dec == true)
				screen.setText(screen.getText() + "9");
			else
				screen.setText(screen.getText() + "9");
		}
		if (source == four) {
			if (basic.function != 0 && dec == false)
				screen.setText("4");
			else if (dec == true)
				screen.setText(screen.getText() + "4");
			else
				screen.setText(screen.getText() + "4");
		}
		if (source == five) {
			if (basic.function != 0 && dec == false)
				screen.setText("5");
			else if (dec == true)
				screen.setText(screen.getText() + "5");
			else
				screen.setText(screen.getText() + "5");
		}
		if (source == six) {
			if (basic.function != 0 && dec == false)
				screen.setText("6");
			else if (dec == true)
				screen.setText(screen.getText() + "6");
			else
				screen.setText(screen.getText() + "6");
		}
		if (source == one) {
			if (basic.function != 0 && dec == false)
				screen.setText("1");
			else if (dec == true)
				screen.setText(screen.getText() + "1");
			else
				screen.setText(screen.getText() + "1");
		}
		if (source == two) {
			if (basic.function != 0 && dec == false)
				screen.setText("2");
			else if (dec == true)
				screen.setText(screen.getText() + "2");
			else
				screen.setText(screen.getText() + "2");
		}
		if (source == three) {
			if (basic.function != 0 && dec == false)
				screen.setText("3");
			else if (dec == true)
				screen.setText(screen.getText() + "3");
			else
				screen.setText(screen.getText() + "3");
		}
		if (source == zero) {
			if (basic.function != 0 && dec == false)
				screen.setText("0");
			else if (dec == true)
				screen.setText(screen.getText() + "0");
			else
				screen.setText(screen.getText() + "0");
		}
		if (source == decimal) {
			dec = true;
			screen.setText(screen.getText() + ".");
		}
		if (source == negative) {
			screen.setText("-" + screen.getText());
		}
	}
}
