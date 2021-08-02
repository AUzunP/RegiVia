package Main;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Frames.CourseCreationFrame;
import Frames.CourseSelectionFrame;
import customComponents.CustomButton;

public class MainFrame extends JFrame{

	private CourseCreationFrame courseCreatorFrame;
	private CourseSelectionFrame courseSelectionFrame;
	
	private CustomButton courseCreationButton;
	private CustomButton courseSelectionButton;
	
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
		
		CourseCreationFrame courseCreatorFrame = new CourseCreationFrame();
		CourseSelectionFrame courseSelectionFrame = new CourseSelectionFrame();
		
		CustomButton courseCreationButton = new CustomButton("pog");
		CustomButton courseSelectionButton = new CustomButton("poggers");
		
		add(courseCreationButton, BorderLayout.NORTH);
		add(courseSelectionButton, BorderLayout.CENTER);
	
		courseCreationButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				courseCreatorFrame.setVisible(true);				
			}
			
		});
		
		courseSelectionButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				courseSelectionFrame.setVisible(true);
			}
			
		});
		
	}
	
}
