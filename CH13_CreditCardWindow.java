import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CH13_CreditCardWindow extends JFrame implements ActionListener{
	public static final int WIDTH = 250;
	public static final int HEIGHT = 100;
	private JTextField inputOutputField;
	private JLabel outputField;
	public CH13_CreditCardWindow() {
		setTitle("Enter a Credit Card number");
		addWindowListener(new WindowDestroyer( ));
		setSize(WIDTH, HEIGHT);
		Container contentPane = getContentPane( );
		contentPane.setLayout(new BorderLayout( ));
		JPanel buttonPanel = new JPanel( );
			buttonPanel.setLayout(new FlowLayout());
		JButton acButton = new JButton("Accept");
		acButton.addActionListener(this);
		JPanel buttonPane2 = new JPanel( );
		outputField = new JLabel("");
		outputField.setBackground(Color.WHITE);
		buttonPane2.add(outputField);
		contentPane.add(buttonPane2, BorderLayout.CENTER);
		inputOutputField = new JTextField("", 16);
		inputOutputField.setBackground(Color.WHITE);
		buttonPanel.add(inputOutputField);
		buttonPanel.add(acButton);
		contentPane.add(buttonPanel, BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e){
		try{tryingCorrectNumberFormats(e);}
		catch (NumberFormatException e2){
			outputField.setText("Error: Reenter Number.");}}
	public void tryingCorrectNumberFormats(ActionEvent e){
		double a;
		if (e.getActionCommand( ).equals("Accept")){
			a=Double.parseDouble(inputOutputField.getText( ));
			if(inputOutputField.getText( ).length()!=16) {
				outputField.setText("Number rejected "+inputOutputField.getText( ));
			}
			else {
				outputField.setText("Number accepted "+inputOutputField.getText( ));
			}
		}
	}
	
}
