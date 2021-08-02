import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public MainFrame() {
		
		super("Registration Viability");
		
		setLayout(new BorderLayout());
		
		setMinimumSize(new Dimension(1000, 1000));
		setPreferredSize(new Dimension(1000, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.revalidate();
		this.pack();
		this.repaint();
		this.setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
}
