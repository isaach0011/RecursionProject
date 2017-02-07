package counting.controller;

import javax.swing.JOptionPane;
import counting.model.*;
import counting.view.*;

public class CountingController
{
	private CountingFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public CountingController()
	{
		this.baseFrame = new CountingFrame(this);
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
	}
	
	public void start()
	{
		
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial of " + input + " is ";
	
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateIterativeFac(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		factorialInfo += "\n" + mathTimer.toString();
		
		return factorialInfo;
	}
	
	public String transferFibonacci(String input)
	{
		String fibonacciInfo = "The fibonacci of " + input + " is ";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibonacciInfo += mathTool.calculateIterativeFib(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		fibonacciInfo += "\n" + mathTimer;
		
		return fibonacciInfo;
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
