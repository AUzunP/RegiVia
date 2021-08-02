package Frames;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CourseSelectionFrame extends JFrame {

	public CourseSelectionFrame() {
		
		super("Choose Courses");
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		Dimension d = new Dimension(300, 500);
		setPreferredSize(d);
		setLayout(new GridBagLayout());
		pack();
		
		GridBagConstraints c = new GridBagConstraints();
		
		layoutComponents(c);
		
	}
	
	private JComboBox courseList;
	private JComboBox colorsList;
	
	private JTextField courseName;
	private JTextField courseCode;
	private JTextField startTime;
	private JTextField endTime;
	
	private JLabel startLabel;
	private JLabel endLabel;
	
	private ColorRGB colorRGB;
	
	private void layoutComponents(GridBagConstraints c) {
		
		// Course Info
		
		JTextField courseName = new JTextField("Course Name");
		JTextField courseCode = new JTextField("Course Code");
		JTextField startTime = new JTextField("Start Time");
		JTextField endTime = new JTextField("End Time");
		
		JLabel startLabel = new JLabel("Start Time");
		JLabel endLabel = new JLabel("End Time");
		
		courseName.setEditable(false);
		courseCode.setEditable(false);
		startTime.setEditable(false);
		endTime.setEditable(false);
		
		// Course Selection
		
		JComboBox courseList = new JComboBox();
		JComboBox colorsList = new JComboBox();
		
		// Color Selection
		
		ColorRGB colorRGB = new ColorRGB();
		
		// Layout Components
		
		
	}
	
}
