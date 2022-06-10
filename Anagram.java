import java.util.*;
public class Anagram 
{
	
		public static void main(String[] args)
		{
			String s = "quescol";
			String s1= "colsque";
			int count=0;
			boolean bool = false;
			for(int i=0;i<s.length();i++)
			{	bool=false;
				char a = s.charAt(i);
				
				for(int j=0;j<s1.length();j++)
				{
					
					char b =s1.charAt(j);
					if(a==b)
					{
						count++;
						bool=true;
						break;
					}
					
					
				}
				if (!bool)
					break;
			}
			System.out.print(count+"....");
			if (bool==false)
			{
				System.out.print("Not anagram");
			} else if(count==s.length())
			{
				System.out.print("anagram");
			}
			else{
				System.out.print("Not anagram");
			    }
		}
	}

