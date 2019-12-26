
import java.lang.*;
import java.util.*;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i;
		StringBuilder str = new StringBuilder("TNT");
		int size = str.length();
		char ch[] = new char[size];
		for (i = 0; i < size; i++)
		{
			ch[i] = str.charAt(i);
			if(ch[i] == 'A' || ch[i] == 'a' || ch[i] == 'E' || ch[i] == 'e' || ch[i] == 'I' || ch[i] == 'i' || ch[i] == 'O' || ch[i] == 'o' || ch[i] == 'U' || ch[i] == 'u' )
			{
				count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println("No vowels present");
			System.out.print("The string in reverse is: " );
			StringBuilder str1 = str.reverse();
			System.out.print(str1);
		}
		else
		{
			System.out.println("No. of vowels present are: " +count);
			System.out.print("The string in reverse is: " );
			StringBuilder str1 = str.reverse();
			System.out.print(str1);
		}
	}

}
