import java.util.Scanner;
public class MagicSquare
{
	private int [][] square;
	private int k;
	private int rowIndicator;
	private int colIndicator;

	public void createAMagicSquare(int n)
	{
		k = 1;
		square = new int [n][n];
		createArrayOfZeros(n);
		colIndicator = n/2;
		rowIndicator = 0;
		square[rowIndicator][colIndicator] =k;
		while (k < n*n)
		{	
			
			if(k%n == 0)
			{	
				rowIndicator++;
			}
			else
			{		
					
					
					rowIndicator--;
					colIndicator--;
					
					if(rowIndicator < 0)
					{
						rowIndicator = ((rowIndicator % n) + n) % n;    // <-- like that
						
						
					}
					else if(rowIndicator >= n)
					{
							rowIndicator--;
							
							
							
					}
					else
					{
						rowIndicator= rowIndicator;
							
					}
				

					if(colIndicator < 0)
					{
						colIndicator = ((colIndicator % n) + n) % n; 
					}  // <-- like that
					else if(colIndicator >= n)
					{
							colIndicator--;
												}
					else
					{
						colIndicator= colIndicator;
						
					}
					
					
					
				
				
			}
			
			k++;
			square[rowIndicator][colIndicator] =k;
			
					
		}
			
			
				
		
	}

	public void displayArray()
	{
		for(int i = 0; i< square[0].length; i++)
		{
			for(int j = 0; j<square[0].length; j++)
			{
				System.out.print(square[i][j]+"\t");
			}
			System.out.println();
			
		}	
		
		System.out.println("\n\nRow 6:");
		for(int i = 0; i< square[0].length; i++)
		{
			System.out.print(square[6][i] +", ");
			
			
		}
		System.out.println("\n\nRow 0:");
		for(int i = 0; i< square[0].length; i++)
		{
			System.out.print(+square[0][i] +", ");
			
			
		}
	}
	
	public void createArrayOfZeros(int n)
	{
		for(int i = 0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				square[i][j] = 0;
			}
			
			System.out.println();
			
		}
		System.out.println();
		
	}

	public static void main(String[] args)
	{
		MagicSquare ms = new MagicSquare();
		Scanner read = new Scanner(System.in);
		//try
		//{
			System.out.println("Please enter dimension of the magic square: ");
			int size = read.nextInt();
			//if(size<1)
			//{
				//throw new NonNegativeException();
			//}
			ms.createAMagicSquare(size);
			ms.displayArray();
		//}
		//catch(NonNegativeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
