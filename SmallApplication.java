/*
  *******  Welcome to Abhishek Java Application *************
					 boolean run=true;
					 while(run)
					 {
						  
					 Please select any option from the below list:- 
					 
					 1. Check Even Odd
					 2. Check Prime
					 3. Print the Factorial
					 4. Print the Table
					 5. Get quote on based of Weekday
					 6. Exit
					 	 
					 Enter your option:- 
					 int x= nextInt();
									 
					 if(x==6)
					 {
						//break;
						run=false;
					 }
					 
					 swit(x)
					 
					 def()
					 
					 }
					 
					 */
import java.util.Scanner;
public class SmallApplication
{
public static void main(String[] anjani)
{
	System.out.println(" *******  Welcome to Anjani's Java SmallApplication ************* ");
	Scanner sc = new Scanner(System.in);
	boolean excuete= true;
	while(excuete)
	{
		
		System.out.println("Please select any option from the below list:- ");					 
		System.out.println("1. Check Even Odd");
		System.out.println("2. Check Prime");			 
		System.out.println("3. Print the Factorial");			 
		System.out.println("4. Print the Table");			 
		System.out.println("5. Get quote on based of Weekday");			 
		System.out.println("6. Exit");	
			
			System.out.println("Please Enter your option :- ");
			int option = sc.nextInt();
			 if(option<1 || option>6)
			 {
				 System.out.println("Please enter a valid input");
				 excuete=false;
			 }
			 if (option ==6)
			 {
				 System.out.print("Thanks for using my Small Application, hope you Enjoyed!!");
				 excuete = false;
				 break;
			 }
			 
			
			int number = 0;
			if(option>=1 && option<=4)
			{
				System.out.println("you have choosen option "+option+" .Please Enter your number to play the game with the result :- ");
				number = sc.nextInt();
				sc.nextLine();
			}
				if(option==1)
				{
					checkEvenOdd(number);
				}
				else if (option==2)
				{
					checkPrime(number);
				}
				else if(option==3)
				{
					factorial(number);
				}
				else if(option==4)
				{
					printTable(number);
				}
				else
				{	System.out.println("you have choosen option "+option+" .Please Enter a Weekday to play the game with the result :- ");								
					weekDay();
				}
	 System.out.println("Do you want to continue the game if yes enter y/Y else n/N : ");
	 char intrested = sc.next().charAt(0);
		if (intrested == 'N' || intrested == 'n')
			{
				excuete = false;
			}
				
	}
	 
}
	static void checkEvenOdd(int number)
	{   
		if(number%2==0) //used to check remainder =0 when divided by 2 which leads to even
		{
			System.out.println("Entered Number "+number+" is Even");			
		}
		else
		{
		    System.out.println("Entered Number "+number+" is Odd");
		}
		
	}
	
	static void checkPrime(int number)
	{
		int count=0;
		
		for (int i=1;i<=number;i++)                      
		{
			if( number%i==0)
			{
				count++;				
				
			}
			
		}	
			if(count==2) //used here coz prime number can only have 2 factors
			{
				System.out.println("Entered Number "+number+" is Prime");
			}
			else
			{
				System.out.println("Entered Number "+number+" is not Prime");
			}
	}
	static void factorial(int number)
	{
		double fact = 1;
		for(int i =1;i<=number;i++)
		{
			// using to print factorial * i which is 1*2*3*...number
			fact = fact*i;
			
		}
		System.out.println("Factorial of the number "+number+" is "+fact);
	}
	static void printTable(int number)
	{
		for(int j=1;j<=10;j++)
		{
				System.out.print(number+" X "+j+" = "+(number*j)+"\n");
		}
	}
	static void weekDay()
	{
		Scanner sc = new Scanner(System.in);
		String week = sc.nextLine();
		switch(week)
		{
			case "Monday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("This is your Monday morning reminder that you can handle whatever this week throws at you. ");
				break;
			case "Tuesday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("Monday always passes and there will always be a Tuesday with a beautiful blue sky with few clouds. ");
				break;
			case "Wednesday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("Happy Wednesday!! Love all, trust a few, do wrong to none.");
				break;
			case "Thursday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("Today you are you, that is truer than true. There is no one alive who is yourer than you. ");
				break;
			case "Friday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("If my boss knew how unproductive I am on Fridays, he wouldn't want me here either. ");
				break;
			case "Saturday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("Loving ourselves allows us to show up in the world so we can love others, uplift others, and make the world a more loving place. ");
				break;
			case "Sunday":
				System.out.println("******** Welcome to the quote world for ******** "+week+"\n");
				System.out.println("Sunday clears away the rust of the whole week.Do not let Sunday be taken from you. If your soul has no Sunday, it becomes an orphan. ");
				break;
			default :
				System.out.println("Please enter a weekday with Camel Case and try again. ");
			
		}
		
	}
	
	
		
	
	}


