import java.util.*;
import java.io.*;

public class BinS{

	int [] a;

	public BinS(int[] array){
		a=array;


	}
	
	public int find(int target){
		try{
			System.out.println("Fortunate for you, the number exists on the provided list.");
			return binary(target,0,a.length);
		}catch(NumNotFoundException e){
			System.out.println("Number not on the list.\n    SHAME.");
			return -1;
			
		
		}
	}
	public int binary(int target,int first,int last) throws NumNotFoundException{
	
		int result=0;
	
		if(first>last){
			throw new NumNotFoundException();
			//result=-1;
		}
		else{
			int mid=(first+last)/2;
			if(target==a[mid]){
				result=mid;
			}
			else if(target<a[mid]){
				result=binary(target,first,mid-1);

			}
			else if(target>a[mid]){
				result=binary(target,mid+1,last);


			}
		
		}
		//System.out.println(result);
		return result;
	}

	public static void main(String[] args){
		int[] d={2,4,6,8,10,12,14,16};
		BinS b = new BinS(d);
		b.find(16);
		

	}




















}
