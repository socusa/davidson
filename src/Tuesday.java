import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tuesday extends JFrame implements ActionListener {
    private JTextField number;
    private JTextField root;
    private JButton findRoot;
    private JTextArea rootOutput;
    private JTextField angle;
    private JTextField[] trigFunctions;
    private JButton findTrigFunctions;
	
	public Tuesday(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		JLabel numberLabel = new JLabel("Number");
		JLabel rootLabel = new JLabel("Root");
		
		JPanel panel1 = new JPanel();
		
		panel1.add(numberLabel);
		panel1.add(number = new JTextField());
		panel1.add(rootLabel);
		panel1.add(root = new JTextField());
		panel1.add(findRoot = new JButton("Find Root"));
		
		Font font = new Font("Comic Sans MS",Font.BOLD,20);
		
		numberLabel.setFont(font);
		number.setPreferredSize(new Dimension(100,50));
		number.setFont(font);
		rootLabel.setFont(font);
		root.setPreferredSize(new Dimension(100,50));
		root.setFont(font);
		findRoot.setFont(font);
		
		number.setText("0.0");
		root.setText("1.0");
		
		JScrollPane pane = new JScrollPane(rootOutput = new JTextArea());
		
		rootOutput.setFont(font);
		
		pane.setPreferredSize(new Dimension(400,100));
		
		panel1.add(pane);
		
		findRoot.addActionListener(this);
		
		panel1.setPreferredSize(new Dimension(600,200));
		
		add(panel1);
		
		JPanel panel2 = new JPanel();
		
		JLabel angleLabel = new JLabel("Angle");
		
		panel2.add(angleLabel);
		panel2.add(angle = new JTextField());
		panel2.add(findTrigFunctions = new JButton("Find Trig Functions"));
		
		angle.setText("0.0");
		
		angleLabel.setFont(font);
		angle.setPreferredSize(new Dimension(100,50));
		angle.setFont(font);
        findTrigFunctions.setFont(font);
        
        findTrigFunctions.addActionListener(this);

        JPanel panel3 = new JPanel();
        
        panel3.setLayout(new GridLayout(6,2));
        
        JLabel[] labels = {new JLabel("Sine"),new JLabel("Cosine"),new JLabel("Tangent"),new JLabel("Cotangent"),new JLabel("Secant"),new JLabel("Cosecant")};
        
        trigFunctions = new JTextField[6];
        
        for (int counter=0;counter<trigFunctions.length;counter++)
        	trigFunctions[counter] = new JTextField();
        
        for (int counter=0;counter<labels.length;counter++) {   
        	labels[counter].setFont(font);
        	trigFunctions[counter].setFont(font);
        
        	panel3.add(labels[counter]);
        	panel3.add(trigFunctions[counter]);
        }
        
        panel2.add(panel3);
        
		add(panel2);
	}

	public double findRoot(double number,double root) {
		return(0.0);
	}
	
	public double findSine(double angle) {
		return(0.0);
	}
	
	public double findCosine(double angle) {
		return(0.0);
	}
	
	public double findTangent(double angle) {
		return(0.0);
	}
	
	public double findCotangent(double angle) {
		return(0.0);
	}
	
	public double findSecant(double angle) {
		return(0.0);
	}
	
	public double findCosecant(double angle) {
		return(0.0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.getSource() == findRoot) {
			if (number.getText().trim().equals(""))
				number.setText("0.0");
			
			if (root.getText().trim().equals(""))
				root.setText("1.0");
			
			rootOutput.setText(String.valueOf(findRoot(Double.parseDouble(number.getText()),Double.parseDouble(root.getText()))));
		} else if (arg0.getSource() == findTrigFunctions) {
			if (angle.getText().trim().equals(""))
				angle.setText("0.0");
			
			trigFunctions[0].setText(String.valueOf(findSine(Double.parseDouble(angle.getText()))));
			trigFunctions[1].setText(String.valueOf(findCosine(Double.parseDouble(angle.getText()))));
			trigFunctions[2].setText(String.valueOf(findTangent(Double.parseDouble(angle.getText()))));
			trigFunctions[3].setText(String.valueOf(findCotangent(Double.parseDouble(angle.getText()))));
			trigFunctions[4].setText(String.valueOf(findSecant(Double.parseDouble(angle.getText()))));
			trigFunctions[5].setText(String.valueOf(findCosecant(Double.parseDouble(angle.getText()))));			
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tuesday tuesday = new Tuesday("Tuesday");
        tuesday.setSize(700,500);
        tuesday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tuesday.setVisible(true);
	}
	
}
