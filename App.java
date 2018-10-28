import javax.swing.JFrame;
import java.awt.BorderLayout;

public class App{

	public static void main(String[] args){
		
		JFrame frame = new JFrame("Chest Anatomy Solution");
		frame.setSize(500,400);
		frame.setResizable(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		frame.setVisible(true);
	}

}