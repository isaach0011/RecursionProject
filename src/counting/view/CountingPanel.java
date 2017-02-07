package counting.view;

import javax.swing.*;
import counting.controller.CountingController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class CountingPanel extends JPanel
{
	private CountingController baseController;
	private CountingFrame baseFrame;
	private SpringLayout baseLayout;
	private JTextArea display;
	private JTextField inputField;
	private JButton factButton;
	private JButton fibButton;
	
	public CountingPanel(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.display = new JTextArea(20, 40);
		this.inputField = new JTextField(35);
		this.factButton = new JButton("Fact");
		this.fibButton = new JButton("Fib");
		
		setupTextArea();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupTextArea()
	{
		display.setEditable(false);
		display.setEnabled(false);
		display.setLineWrap(true);
		display.setWrapStyleWord(true);
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500,500));
		this.setBackground(Color.gray);
		
		this.add(display);
		this.add(inputField);
		this.add(factButton);
		this.add(fibButton);
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, display, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, display, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 28, SpringLayout.SOUTH, display);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 31, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 21, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -74, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 61, SpringLayout.WEST, this);
	}
	
	public void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
	}
}
