import java.util.Scanner;

class Java1DArray 
{

    public static void main(String[] args) 
	{
	   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++)
        {
			a[i]=sc.nextInt();
            System.out.println("Value for the index "+i+" is "+a[i]);
        }
		
    }
}