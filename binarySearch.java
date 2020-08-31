import java.util.Scanner;
import static java.lang.System.out;
public class binarySearch {
		public static void main(String[] args){

			//int[] intArray = {1,2,3,4,5,6,7,8,9,10};
			int[] intArray = new int[10];
			int searchV=0, index;
			Scanner input = new Scanner(System.in);
			out.print("Enter 10 numbers\n");
			for (int i=0; i<intArray.length; i++){
				intArray[i] = input.nextInt(); }
			
			out.println("Enter a number to search for");
			searchV = input.nextInt();
			index = binarySearch(intArray, searchV);
			
			if(index != -1){
				out.println("found at index " + index); }
			else{
				out.println("Index not found"); }}

		public static int binarySearch(int[] search, int item) {
			int left, right;
			left=0; right=search.length-1;
			while (left <= right){
				int middle = (left + right)/2;
				if (search[middle] == item){
					return middle; }
				else if (search[middle] < item){
					left = middle + 1; }
				else{
					right = middle - 1; }}
			return -1; }}











