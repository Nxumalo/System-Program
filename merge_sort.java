import java.lang.Math.*;   
import java.io.*;   
import java.text.*;

class merge_sort{
public static int N = 52*1;
static void mergeSort(int array[], int left, int right){
        int mid = (left+right)/2;
        if(left<right){
                mergeSort(array,left,mid);
                mergeSort(array,mid+1,right);
                merge(array,left,mid,right);}}

public static void merge(int array[], int left, int mid, int right){
        int tempArray[]=new int[right-left+1];
        int pos=0,lpos = left,rpos = mid + 1;
        while(lpos <= mid && rpos <= right){
                if(array[lpos] < array[rpos]){
                      tempArray[pos++] = array[lpos++];}
                else{
                      tempArray[pos++] = array[rpos++];}}
        while(lpos <= mid)  tempArray[pos++] = array[lpos++];
        while(rpos <= right)tempArray[pos++] = array[rpos++];
        int iter;
        for(iter = 0;iter < pos; iter++){
			array[iter+left] = tempArray[iter];}}

public static void median(int[]A){
	int size = A.length;
	System.out.println("Merge median: " + (A[size/2]));}		 

public static void main(String args[]){

	
	DecimalFormat twoD = new DecimalFormat("0.00");
	DecimalFormat fourD = new DecimalFormat("0.0000");
	DecimalFormat fiveD = new DecimalFormat("0.00000");

	long start, finish;
	double runTime = 0, runTime2 = 0, time;
	double totalTime = 0.0;
	int n = N;
	int repetition, repetitions = 1;

	int size = 11;
	int[] first = new int[size];

	for(int i = 0; i < size; i++) first[i] = (int)(Math.random()*size) + 1;
	
	runTime = 0;
	for(repetition = 0; repetition < repetitions; repetition++) {
      	start = System.currentTimeMillis();
		
       	mergeSort(first,0,size-1);
		median(first);
		for(int y = 0; y < size; y++){
				System.out.print(first[y] + " ");
		}
	
      	finish = System.currentTimeMillis();
			
      	time = (double)(finish - start);
      	runTime += time;
      	runTime2 += (time*time);}

   	double aveRuntime = runTime/repetitions;
   	double stdDeviation = Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

   	System.out.printf("\n\n\fStatistics\n");
   	System.out.println("________________________________________________");
   	System.out.println("Total time   =           " + runTime/1000 + "s.");
   	System.out.println("Total time\u00b2  =           " + runTime2);
   	System.out.println("Average time =           " + fiveD.format(aveRuntime/1000)
                     + "s. " + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
   	System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
   	System.out.println("n            =           " + n);
   	System.out.println("Average time / run =     " + fiveD.format(aveRuntime/n*1000) 
                     + '\u00B5' + "s. "); 

   	System.out.println("Repetitions  =             " + repetitions);
   	System.out.println("________________________________________________");
   	System.out.println();
   	System.out.println();}}
