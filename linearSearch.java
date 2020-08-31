import java.util.*;
public class linearSearch {
	public int find(int[] data, int key) {
		for (int i=0; i<data.length; i++) {
			if (data[i] > key){
				return -1; }
			else if (data[i] == key){
				return i; }}
		return -1; }
	
	public static void main(String[] args) {
		int[] arr = {5,3,8,4,6,2};
		Scanner input = new Scanner(System.in);
		linearSearch search = new linearSearch();
		System.out.println("Enter the number you want to search : ");
		int num = input.nextInt();
		int n = search.find(arr, num);
		if ((n >= 0) && (n<arr.length)) {
			System.out.println("Found at index : " + n); }
		else {
			System.out.println("Not found!!!"); }}}
