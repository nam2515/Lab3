import java.util.Scanner;

public class StringOperation {
	static Scanner sc= new Scanner(System.in);
	static String s=sc.next();
	public static void main(String[] args)
	{
		int choice;
		while(true)
		{
			System.out.println();
			System.out.println("1 Add String to itself");
			System.out.println("2 Replace odd positions with #");
			System.out.println("3 Remove duplicate characters in String");
			System.out.println("4 Change odd characters to upper case ");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println(addString());
					break;
			case 2: System.out.println(replaceOddWith());
					break;
			case 3: System.out.println(removeDuplicate());
					break;
			case 4: System.out.println(oddToUpper());
			}
		}
	}
	private static char[] oddToUpper() {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i%2!=0&&(c[i]>=97&&c[i]<=122))
				c[i]-=32;
		}
		return c ;
	}
	private static char[] removeDuplicate() {
		// complete it..
		return null;
	}
	private static char[] replaceOddWith() {
		// TODO Auto-generated method stub
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i%2!=0)
				c[i]='#';
		}
		return c;
	}
	private static String addString() {
		System.out.println("Enter the string");
		String str=sc.next();
		str+=" "+s;
		return str;
	}

}
