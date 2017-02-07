package counting.model;

public class RecursionTool
{
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public double calculateFibonacci(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public int calculateIterativeFib(int currentNumber)
	{
		int a = 0; 
		int fib = 1;
		for(int i=0; i<currentNumber; i++) 
		{
		    fib = fib + a;
		    a = fib;
		}
		return fib; 
	}
	
	public int calculateIterativeFac(int currentNumber)
	{
		int product = 1;
		for ( int j=1; j<=currentNumber; j++ )
		{
		    product *= j;
		}
		return product;
	}
}
