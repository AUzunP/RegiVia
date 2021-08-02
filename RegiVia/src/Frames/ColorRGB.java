package Frames;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import customComponents.CustomButton;

public class ColorRGB extends JFrame {

	private JTextField red;
	private JTextField green;
	private JTextField blue;

	private int redVal = 0;
	private int greenVal = 0;
	private int blueVal = 0;

	private CustomButton preview;
	private CustomButton apply;

	private JTextField previewColor;
	
	private ColorListener colorListener;

	public ColorRGB() {

		super("RGB Value Custom Color");
		setResizable(false);
		setLocationRelativeTo(null);

		Dimension d = new Dimension(400, 100);
		setPreferredSize(d);
		setLayout(new GridBagLayout());
		pack();

		GridBagConstraints c = new GridBagConstraints();

		JTextField red = new JTextField("Red 0-255");
		JTextField green = new JTextField("Green 0-255");
		JTextField blue = new JTextField("Blue 0-255");

		CustomButton preview = new CustomButton("Preview");
		CustomButton apply = new CustomButton("Apply");

		JTextField previewColor = new JTextField("");
		previewColor.setEditable(false);

		d = new Dimension(100, 20);
		red.setPreferredSize(d);
		green.setPreferredSize(d);
		blue.setPreferredSize(d);
		preview.setPreferredSize(d);
		apply.setPreferredSize(d);
		previewColor.setPreferredSize(d);

		red.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (red.getText().equals("Red 0-255")) {
					red.setText("");
				}
			}

			public void focusLost(FocusEvent e) {
				if (red.getText().equals("")) {
					red.setText("Red 0-255");
				}
			}
		});

		green.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (green.getText().equals("Green 0-255")) {
					green.setText("");
				}
			}

			public void focusLost(FocusEvent e) {
				if (green.getText().equals("")) {
					green.setText("Green 0-255");
				}
			}
		});

		blue.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (blue.getText().equals("Blue 0-255")) {
					blue.setText("");
				}
			}

			public void focusLost(FocusEvent e) {
				if (blue.getText().equals("")) {
					blue.setText("Blue 0-255");
				}
			}
		});

		c.gridx = 0;
		c.gridy = 0;
		add(red, c);

		c.gridx = 1;
		c.gridy = 0;
		add(green, c);

		c.gridx = 2;
		c.gridy = 0;
		add(blue, c);

		c.gridx = 0;
		c.gridy = 1;
		add(preview, c);

		c.gridx = 1;
		c.gridy = 1;
		add(apply, c);

		c.gridx = 2;
		c.gridy = 1;
		add(previewColor, c);

		preview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redVal = Integer.parseInt(red.getText());
				greenVal = Integer.parseInt(green.getText());
				blueVal = Integer.parseInt(blue.getText());

				previewColor.setBackground(new Color(redVal, greenVal, blueVal));
			}
		});

		apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ColorEvent ev = new ColorEvent(this, redVal, greenVal, blueVal);
				
				if (colorListener != null) {
					colorListener.colorEventOccurred(ev);
				}
				
				setVisible(false);
			}
		});
		
	}

	public void setColorListener(ColorListener listener) {
		this.colorListener = listener;
	}
	
}
