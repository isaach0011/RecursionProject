package counting.controller;

import javax.swing.JOptionPane;

import counting.model.*;
import counting.view.*;

public class CountingController
{
	private CountingFrame baseFrame;
	private RecursionTool mathTool;
	
	public CountingController()
	{
		this.baseFrame = new CountingFrame(this);
		this.mathTool = new RecursionTool();
	}
	
	public void start()
	{
		
	}
	
	public CountingFrame getBaseFrame()
	{
		return baseFrame;
	}
	
}
