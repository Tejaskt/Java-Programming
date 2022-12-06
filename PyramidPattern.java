public class PyramidPattern  {    
	
	public static void main(String args[])   
	{    
 
		int i, j, row = 4 , a = 1;      

		for (i=0; i<row; i++)   
			{        
				for (j=row-i; j>1; j--)   
					{  
						System.out.print(" ");   
					}   

				for (j=0; j<=i; j++ )   
					{   
						
						System.out.print(a + " "); 
							a = a*2;
					}   
					
					
				System.out.println();   
			}   
	}   
}  