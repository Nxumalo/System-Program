import java.io.*;
import java.util.*;

public class BinSearch{

	int[] arr;

	public BinSearch(int[] a){
		arr=a;
	
		
	}
	
	public int find(int target){
		try{
			System.out.println("Number exist");
			return search(target,0,arr.length-1);
			
		}catch(NumberNotFoundException e){
			System.out.println("Jokes..\nNumber is not in the list:::>>>>>");
			return -1;
			//System.exit(0);
		}
		
	
	}
	
	public int search(int target,int first,int last)throws NumberNotFoundException{
		int result=0;
		if(first>last){
			throw new NumberNotFoundException();	
		}
		else{
			int mid=(first+last)/2;
			if(target==arr[mid]){
				result=mid;
	
			}
			else if(target<arr[mid]){
				result=search(target,first,mid-1);
	
			}
			else if(target>arr[mid]){
				result=search(target,mid+1,last);
	
			}
			else{
				throw new NumberNotFoundException();	
			}
		}
		return result;
	}
	
	public static void main(String[] args){
	
		int[] y={2,4,6,8,10};
		BinSearch z=new BinSearch(y);
		z.find(3); 

	}


}


