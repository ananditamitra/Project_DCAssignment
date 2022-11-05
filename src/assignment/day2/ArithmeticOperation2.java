package assignment.day2;

public class ArithmeticOperation2 
{

	public int multiply(int a, int b)
	{
		int c = a*b;
		return c;
	}
	public int sum(int x, int y)
	{
		int z = x + y;
		return z;
	}
	public int sub1(int p,int q)
	{
		int r = p-q;
		return r;
	}
	public int division(int x1, int x2)
	{
		int x3= x1/x2;
		return x3;
	}
	public static void main (String args[]) {
		ArithmeticOperation2 assign2 = new ArithmeticOperation2();
		int multiply = assign2.multiply(10, 2);
		System.out.println("multiplication result is:" +multiply);
		int sum1 = assign2.sum(multiply,2);
		System.out.println("sum is:" +sum1);
		int sub1 = assign2.sub1(sum1, 2);
		System.out.println("Subtraction1  is:" +sub1);
		int sub2 = assign2.sub1(sub1, 2);
		System.out.println("Subtraction2  is:" +sub2);
		int divide = assign2.division(sub2, 2);
		System.out.println("Final result is:" +divide);	
		
	}
}
