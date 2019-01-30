import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		str=sc.next();
		char [] str1=str.toCharArray();
		int i=0;
		while(str1[i+1]>str1[i])
			{
				i=i+1;
				if(i==str1.length-1)
					break;
			}
		if(i==str1.length-1)
			System.out.println("Positive");
		else
			System.out.println("-ve");
		}
		
	}
