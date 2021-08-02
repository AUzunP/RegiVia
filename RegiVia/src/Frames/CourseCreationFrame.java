package Frames;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import customComponents.CustomButton;

public class CourseCreationFrame extends JFrame { 

	public CourseCreationFrame() {
		
		super ("Add Potential Courses");
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		Dimension d = new Dimension(300, 300);
		setPreferredSize(d);
		setLayout(new GridBagLayout());
		pack();
		
		GridBagConstraints c = new GridBagConstraints();
		
		layoutComponents(c);
		
	}
	
	private CustomButton addCourseButton;
	
	private JTextField courseName;
	private JTextField courseCode;
	private JTextField startTime;
	private JTextField endTime;
	private JTextField colorPreview;
	
	private JLabel startTimeLabel;
	private JLabel endTimeLabel;
	private JLabel colorsListLabel;
	
	private JComboBox colorsList;
	
	private JCheckBox mondayCheck;
	private JCheckBox tuesdayCheck;
	private JCheckBox wednesdayCheck;
	private JCheckBox thursdayCheck;
	private JCheckBox fridayCheck;
	
	private ColorRGB colorRGB;
	
	private CustomButton submitButton;
	
	private void layoutComponents(GridBagConstraints c) {
		
		// course Info
		JTextField courseName = new JTextField("Course Name");
		JTextField courseCode = new JTextField("Course Code");
		JTextField startTime = new JTextField("00:00 Format");
		JTextField endTime = new JTextField("00:00 Format");
		
		JLabel startTimeLabel = new JLabel("Start Time");
		JLabel endTimeLabel = new JLabel("End Time");

		c.insets = new Insets(5, 5, 5, 5);
		
		c.gridx = 0;
		c.gridy = 0;
		add(courseCode, c);
		
		c.gridx = 1;
		c.gridy = 0;
		add(courseName, c);
		
		c.gridx = 0;
		c.gridy = 1;
		add(startTimeLabel, c);
		
		c.gridx = 1;
		c.gridy = 1;
		add(startTime, c);
		
		c.gridx = 0;
		c.gridy = 2;
		add(endTimeLabel, c);
		
		c.gridx = 1;
		c.gridy = 2;
		add(endTime, c);

		// Color Selection
		JLabel colorsListLabel = new JLabel("Course Color");		
		JTextField colorPreview = new JTextField();
		colorPreview.setEditable(false);
		colorPreview.setBackground(Color.BLUE);
		
		JComboBox<String> colorsList = new JComboBox<String>();

		colorsList.addItem("Blue");
		colorsList.addItem("Green");
		colorsList.addItem("Orange");
		colorsList.addItem("Purple");
		colorsList.addItem("Yellow");
		colorsList.addItem("Pink");
		colorsList.addItem("Cyan");
		colorsList.addItem("Custom");
		
		colorPreview.setPreferredSize(new Dimension(25, 25));
		
		c.gridx = 0;
		c.gridy = 3;
		add(colorsListLabel, c);
		
		c.gridx = 1;
		c.gridy = 3;
		add(colorsList, c);
		
		c.gridx = 2;
		c.gridy = 3;
		add(colorPreview, c);
		
		// Days Selection
		JCheckBox mondayCheck = new JCheckBox("Monday");
		JCheckBox tuesdayCheck = new JCheckBox("Tuesday");
		JCheckBox wednesdayCheck = new JCheckBox("Wednesday");
		JCheckBox thursdayCheck = new JCheckBox("Thursday");
		JCheckBox fridayCheck = new JCheckBox("Friday");
		
		c.gridx = 0;
		c.gridy = 4;
		add(mondayCheck, c);
		
		c.gridx = 1;
		c.gridy = 4;
		add(tuesdayCheck, c);
		
		c.gridx = 2;
		c.gridy = 4;
		add(wednesdayCheck, c);
		
		c.gridx = 0;
		c.gridy = 5;
		add(thursdayCheck, c);
		
		c.gridx = 1;
		c.gridy = 5;
		add(fridayCheck, c);
		
		CustomButton submitButton = new CustomButton("Submit");
		
		c.gridx = 0;
		c.gridy = 6;
		add(submitButton, c);
		
		// Action Listeners
		
		ColorRGB colorRGB = new ColorRGB();
		
		colorsList.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (colorsList.getSelectedItem().equals("Blue")) {
					colorPreview.setBackground(Color.BLUE);
				}
				if (colorsList.getSelectedItem().equals("Green")) {
					colorPreview.setBackground(Color.GREEN);
				}
				if (colorsList.getSelectedItem().equals("Orange")) {
					colorPreview.setBackground(Color.ORANGE);
				}
				if (colorsList.getSelectedItem().equals("Purple")) {
					colorPreview.setBackground(Color.MAGENTA);
				}
				if (colorsList.getSelectedItem().equals("Yellow")) {
					colorPreview.setBackground(Color.YELLOW);
				}
				if (colorsList.getSelectedItem().equals("Pink")) {
					colorPreview.setBackground(Color.PINK);
				}
				if (colorsList.getSelectedItem().equals("Cyan")) {
					colorPreview.setBackground(Color.CYAN);
				}
				
				if (colorsList.getSelectedItem().equals("Custom")) {
					colorRGB.setVisible(true);
					
					colorRGB.setColorListener(new ColorListener() {

						public void colorEventOccurred(ColorEvent ev) {
							int redVal = ev.getRedVal();
							int greenVal = ev.getGreenVal();
							int blueVal = ev.getBlueVal();
							
							colorPreview.setBackground(new Color(redVal, greenVal, blueVal));
						}
						
					});
					
				}
				
			}
			
		});
		
		// Focus Listeners
		
		courseName.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (courseName.getText().equals("Course Name")) {
					courseName.setText("");					
				}
			}	
			public void focusLost(FocusEvent e) {
				if (courseName.getText().equals("")) {
					courseName.setText("Course Name");
				}
			}
		});
		
		courseCode.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (courseCode.getText().equals("Course Code")) {
					courseCode.setText("");					
				}
			}	
			public void focusLost(FocusEvent e) {
				if (courseCode.getText().equals("")) {
					courseCode.setText("Course Code");
				}
			}
		});
		
		startTime.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (startTime.getText().equals("00:00 Format")) {
					startTime.setText("");					
				}
			}	
			public void focusLost(FocusEvent e) {
				if (startTime.getText().equals("")) {
					startTime.setText("00:00 Format");
				}
			}
		});
		
		endTime.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (endTime.getText().equals("00:00 Format")) {
					endTime.setText("");					
				}
			}	
			public void focusLost(FocusEvent e) {
				if (endTime.getText().equals("")) {
					endTime.setText("00:00 Format");
				}
			}
		});
		
	}
	
}
