import java.util.Scanner;

public class JobSeeker {
	static Scanner sc= new Scanner(System.in);
	static String username;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,gender;
		int age;
		System.out.println("Enter he name: ");
		name=sc.next();
		System.out.println("Enter the gender: ");
		gender=sc.next();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Enter username: ");
		username=sc.next();
		System.out.println(validateUsername(username));
		
		}

	private static String validateUsername(String next) {
		// TODO Auto-generated method stub
		char [] str=username.toCharArray();
		if(str.length-4!='_' || str.length-3!='b' || str.length-2!='o' || str.length-1!='j' || str.length<12)
			return "false";
		else
			return "True";
	}
	}
