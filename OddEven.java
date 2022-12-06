public class OddEven{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		
		System.out.print("Number Is : ");
		System.out.println((num % 2 == 0) ? "Even" : "Odd");
		
	}
}