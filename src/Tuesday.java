import javax.swing.JFrame;

public class Tuesday extends JFrame {
	
	public Tuesday(String title) {
		super(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tuesday tuesday = new Tuesday("Tuesday");
        tuesday.setSize(200,200);
        tuesday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tuesday.setVisible(true);
	}

}
