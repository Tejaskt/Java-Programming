import java.util.Scanner;

class Switch{
	
	private static Scanner sc;
	public static void main(String[] args)
	{
			sc = new Scanner(System.in);
			System.out.println("Welcome to calculater :");
			System.out.println("Enter Two Values :");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("A = " + a + "\nB = " + b);
			System.out.println("\n...Enter Your Choice... \n (+,-,*,/): ");
			
			String ch = sc.next();
			
			System.out.println("Result = ");
			
			switch(ch)
			{
				case "+":
					System.out.println(a+b);
					break;
				case "-":
					System.out.println(a-b);
					break;
				case "*":
					System.out.println(a*b);
					break;
				case "/":
					System.out.println(a/b);
					break;
				default :
					System.out.println("There are some error..! Please Try Again Later...");
					break;
			}
	}
	
	
}


