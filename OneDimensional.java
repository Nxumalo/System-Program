public class OneDimensional{
	public int count = 0,from = 0;
	public void closestPoints(int[]x){
	
		int from = 0,to = x.length;
		int middle = (from + to)/2;
		int leftD = closestpair1D(x,from,to);
		//int rightD = closestpair1D(x,(middle+1),to);
		System.out.println("leftD " + leftD);
	}
	
	public int closestpair1D(int[] x,int from,int to){
		int i = 0;
		int[]distanceRecord = new int[to-1];
		for (int index = from; index < to-1; index ++){
			distanceRecord[i] = Math.abs(x[index] - x[index + 1]);
			i++;
		}
		
		sort(distanceRecord);
		for(int h = 0; h < x.length; h++) System.out.print(distanceRecord[h]);
		return distanceRecord[0];
	}
	
	public int[] sort(int[] unsortedArray){
		if (count == ((unsortedArray.length*unsortedArray.length)-1)) return unsortedArray;
		else{
			count++;
			if (unsortedArray[from] < unsortedArray[from + 1]){
				int temp = unsortedArray[from];
				unsortedArray[from] = unsortedArray[from + 1];
				unsortedArray[from + 1] = temp;	
			}
			from ++;
			if (count == (unsortedArray.length - 1)) from = 0;
			sort(unsortedArray);
		}
		return unsortedArray;
	}
	
	public static void main(String[]args){
		OneDimensional out = new OneDimensional();
		int [] a = {2,6,7,10,19};
		out.closestPoints(a);
	}
}