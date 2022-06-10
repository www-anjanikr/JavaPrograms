import java.util.Scanner;
class Factorial

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double fact = 1;
		for(int i =1;i<=number;i++)
		{
			// using to print factorial * i which is 1*2*3*...number
			fact = fact*i;
			
		}
		System.out.println("Factorial of the number "+number+" is "+fact);
	}
}
