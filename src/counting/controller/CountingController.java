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
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial of " + input + " is ";
	
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Integer.parseInt(input));
		}
		
		return factorialInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			double test = Double.parseDouble(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
			return false;
		}
	}
	public CountingFrame getBaseFrame()
	{
		return baseFrame;
	}
	
}
