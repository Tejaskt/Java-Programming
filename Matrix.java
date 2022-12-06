public class Matrix{
	
	public static void main(String[] args)
	{
		System.out.println("Two Dimantional String Array");
		
		//Secound String Array
		String[][] arr = new String[2][2];
		
			arr[0][0] = "Tejas ";
			arr[0][1] = "Bhargav ";
			arr[1][1] = "Ravi ";
			arr[1][0] = "Urvish ";
		
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				System.out.println(arr[i][j]);
			}
		}	
		//Secound String Array
		
		String[][] arr2 = new String[2][2];
			
			arr2[0][0] = "Kanzariya";
			arr2[0][1] = "Talpada";
			arr2[1][1] = "Dandaeya";
			arr2[1][0] = "Kaneriya";
	
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				System.out.println(arr2[i][j]);
			}
		}
		
		//3 array to concatinate two strings;
		
		String[][] Total = new String[2][2];
		
		System.out.println("!...Full Name...!");
		System.out.println();
				
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				Total[i][j] = arr[i][j] + arr2[i][j];
				System.out.println(Total[i][j]);
			}
		}
	}	
}