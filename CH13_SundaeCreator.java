import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CH15_SundaeCreator extends JFrame implements ActionListener{
	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;
	public static final int LINES = 10;
	public static final int CHAR_PER_LINE = 40;
	private JLabel theText;
	private JLabel fv;
	private JLabel tp;
	private JLabel sp;
	private JLabel fv1;
	private JLabel tp2;
	private JLabel sp3;
	private String memo1 = "No Memo 1.";
	private String memo2 = "No Memo 2.";

public CH15_SundaeCreator( ){
	setSize(WIDTH, HEIGHT);
	addWindowListener(new WindowDestroyer( ));// THe Class WindowDestroyer is defined and discussed in Chapter 12
	setTitle("Memo Saver");
	Container contentPane = getContentPane( );
	contentPane.setLayout(new BorderLayout( ));
	JMenu memoMenu = new JMenu("Choices");
	JMenuItem f;
	JMenu Fl = new JMenu("Flavor");
	f = new JMenuItem("Chocolate");
	f.addActionListener(this);
	Fl.add(f);
	f = new JMenuItem("Strawberry");
	f.addActionListener(this);
	Fl.add(f);
	f = new JMenuItem("Vanilla");
	f.addActionListener(this);
	Fl.add(f);
	memoMenu.add(Fl);
	JMenuItem t;
	JMenu To = new JMenu("Toppings");
	t = new JMenuItem("Chocolate chip");
	t.addActionListener(this);
	To.add(t);
	t = new JMenuItem("Sprinkle");
	t.addActionListener(this);
	To.add(t);
	t = new JMenuItem("Nuts");
	t.addActionListener(this);
	To.add(t);
	t = new JMenuItem("Peppermint");
	t.addActionListener(this);
	To.add(t);
	memoMenu.add(To);
	JMenuItem s;
	JMenu Sy = new JMenu("Syrup");
	s = new JMenuItem("Chocolate Syrup");
	s.addActionListener(this);
	Sy.add(s);
	s = new JMenuItem("Butterscotch");
	s.addActionListener(this);
	Sy.add(s);
	s = new JMenuItem("Berry");
	s.addActionListener(this);
	Sy.add(s);
	memoMenu.add(Sy);
	
	JMenu Ac = new JMenu("Actions");
	JMenuItem c;
	c = new JMenuItem("Clear");
	c.addActionListener(this);
	Ac.add(c);
	JMenuItem q;
	q = new JMenuItem("Quit");
	q.addActionListener(this);
	Ac.add(q);	
			JMenuBar mBar = new JMenuBar( );
			mBar.add(memoMenu);
			mBar.add(Ac);
			setJMenuBar(mBar);
			JPanel textPanel = new JPanel( );
			JPanel textPane2 = new JPanel( );	
			theText = new JLabel("Your Sundae");
			theText.setBackground(Color.WHITE);
			textPanel.add(theText);
			contentPane.add(textPanel, BorderLayout.NORTH);
			fv = new JLabel("Flavor:");
			fv1 = new JLabel("none");
			fv.setBackground(Color.WHITE);
			textPane2.add(fv);
			textPane2.add(fv1);
			tp = new JLabel("Topping:");
			tp2 = new JLabel("none");
			tp.setBackground(Color.WHITE);
			textPane2.add(tp);
			textPane2.add(tp2);
			sp = new JLabel("Syrup:");
			sp3 = new JLabel("none");
			sp.setBackground(Color.WHITE);
			textPane2.add(sp);
			textPane2.add(sp3);
			contentPane.add(textPane2, BorderLayout.CENTER);
			}
	
public void actionPerformed(ActionEvent e){
	String actionCommand = e.getActionCommand( );
	if (actionCommand.equals("Chocolate"))
		fv1.setText("Chocolate");
	else if (actionCommand.equals("Strawberry"))
		fv1.setText("Strawberry");
	else if (actionCommand.equals("Vanilla"))
		fv1.setText("Vanilla");
	else if (actionCommand.equals("Chocolate chip"))
		tp2.setText("Chocolate chip");
	else if (actionCommand.equals("Sprinkle"))
		tp2.setText("Sprinkle");
	else if (actionCommand.equals("Nuts"))
		tp2.setText("Nuts");
	else if (actionCommand.equals("Peppermint"))
		tp2.setText("Peppermint");
	else if (actionCommand.equals("Chocolate Syrup"))
		sp3.setText("Chocolate Syrup");
	else if (actionCommand.equals("Butterscotch"))
		sp3.setText("Butterscotch");
	else if (actionCommand.equals("Berry"))
		sp3.setText("Berry");
	else if (actionCommand.equals("Clear"))
		{sp3.setText("none");
	fv1.setText("none");
	tp2.setText("none");}
	else if (actionCommand.equals("Quit"))
		System.exit(0);
	else theText.setText("Error in memo interface");}
}
