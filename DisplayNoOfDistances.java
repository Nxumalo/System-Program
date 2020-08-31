/**
 * Display the no of distances to be calculated for n no of nodes
 * 
 */

public class DisplayNoOfDistances
{
	public static void main(String[] args)
	{
		int n = 5;
		int noOfDistances = 0;
		for (int i=0; i<n; i++)
		{	for (int j=i+1; j<n; j++)
			{	noOfDistances++;
				System.out.println("From coordinate number "+i+" to coordinate number "+j);
			}
		}			
		System.out.println("Total number of distances : "+noOfDistances);
	}
}