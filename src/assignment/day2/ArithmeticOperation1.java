package assignment.day2;

public class ArithmeticOperation1 
{
	public int Sum1(int a, int b) 
	{
		int Sumresult1 = a + b;
		return Sumresult1;
	}
	
	public int Subtraction(int c, int d) 
	{
		int SubResult2 = c-d;
		return SubResult2;
	}
	
	public int Multiplication(int x,int y)
	{
		int MultiplicationResult = x*y;
		return MultiplicationResult;
	}
	
	public int Division(int e,int f)
	{
		int DivisionResult = e/f;
		return DivisionResult;
	}
	
	public static void main(String args[]) 
	{
		ArithmeticOperation1 assign1 = new ArithmeticOperation1();
		System.out.println("Result of first sum is :" +assign1.Sum1(10, 2));
		int sum2 = assign1.Sum1(10, 2) + 2;
		System.out.println("Result of second sum is :" +sum2);
		int subresult = assign1.Subtraction(sum2, 2);
		System.out.println("result of subtraction is:" +subresult);
		int multiply = assign1.Multiplication(subresult, 2);
		System.out.println("result of multiplication is :" +multiply);
		int divide = assign1.Division(multiply, 2);
		System.out.println("Final result is :" +divide);
		
				
	}
}
