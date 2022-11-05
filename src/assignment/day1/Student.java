package assignment.day1;

public class Student {
	int rollnumber;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.display1();
		s.display2();
		s.age = 22;
		s.rollnumber =2;
		System.out.println("Age is :" +s.age);
		System.out.println("Roll number is :" +s.rollnumber);
	}

}
