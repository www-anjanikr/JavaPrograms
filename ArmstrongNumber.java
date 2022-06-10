import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] anjani)
	{
		//number = number cubes sum eg.. 153= 1^3+5^3+3^3 = 1+125+27=153
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =a;
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			int q = r*r*r;
			sum+=q;
			a=a/10;
		}
		if(sum==b)
		{
			System.out.println(sum);
		}	
	}
}