import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CH13_Calculator extends JFrame implements ActionListener{
	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;
	private JTextField inputOutputField;
	private double sum = 0;
	public static void main(String[] args){
		CH13_Calculator guiAdder = new CH13_Calculator( );
		guiAdder.setVisible(true);}
	public CH13_Calculator( ){
		setTitle("Adding Machine");
		addWindowListener(new WindowDestroyer( ));
		setSize(WIDTH, HEIGHT);
		Container contentPane = getContentPane( );
		contentPane.setLayout(new BorderLayout( ));
		JPanel buttonPanel = new JPanel( );
		buttonPanel.setBackground(Color.GRAY);
		buttonPanel.setLayout(new FlowLayout( ));
		JButton addButton = new JButton("Add");
		addButton.addActionListener(this);
		buttonPanel.add(addButton);
		JButton sub = new JButton("Substract");
		sub.addActionListener(this);
		buttonPanel.add(sub);
		JButton mul = new JButton("Multiply");
		mul.addActionListener(this);
		buttonPanel.add(mul);
		JButton di = new JButton("Divide");
		di.addActionListener(this);
		buttonPanel.add(di);
		JButton re = new JButton("Reset");
		re.addActionListener(this);
		buttonPanel.add(re);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		JPanel textPanel = new JPanel( );
		textPanel.setBackground(Color.blue);
		textPanel.setLayout(new FlowLayout( ));
		inputOutputField = new JTextField("Numbers go here.", 30);
		inputOutputField.setBackground(Color.WHITE);
		textPanel.add(inputOutputField);
		contentPane.add(textPanel, BorderLayout.CENTER);}
	// this class is identical to the class Adder in display 12.21, except that//    the name of the class is changed and the method actionPerformed is changed.
	public void actionPerformed(ActionEvent e){
		try{tryingCorrectNumberFormats(e);}
		catch (NumberFormatException e2){
			inputOutputField.setText("Error: Reenter Number.");}}//This method can throw NumberFormatExceptions.//  NumberFormatExceptions do not need to be delcared in a throws clause,//    but they can be caught like other exceptions
	public void tryingCorrectNumberFormats(ActionEvent e){
		if (e.getActionCommand( ).equals("Add")){
			sum = sum +stringToDouble(inputOutputField.getText( ));
			inputOutputField.setText(Double.toString(sum));}
		else if (e.getActionCommand( ).equals("Reset"))
		{sum = 0;inputOutputField.setText("0.0");}
		else if (e.getActionCommand( ).equals("Substract")) {
			sum = sum -stringToDouble(inputOutputField.getText( ));
			inputOutputField.setText(Double.toString(sum));
		}
		else if (e.getActionCommand( ).equals("Multiply")) {
			sum = sum *stringToDouble(inputOutputField.getText( ));
			inputOutputField.setText(Double.toString(sum));
		}
		else if (e.getActionCommand( ).equals("Divide")) {
			sum = sum /stringToDouble(inputOutputField.getText( ));
			inputOutputField.setText(Double.toString(sum));
		}
		else inputOutputField.setText("Error in adder code.");}//This method can throw NumberFormatExceptions.
	private static double stringToDouble(String stringObject){
		return Double.parseDouble(stringObject.trim( ));}}
