import java.util.*;
import java.io.*;

public class Merge{

	//int[] a;
	
	public void Sort(int[] array){
		if(array.length>=2){
			int half=array.length/2;
			int[] first=new int[half];
			int[] last=new int[array.length-half];
		
			divide(array,first,last);
			Sort(first);
			Sort(last);
			merge(array,first,last);
		}
		
	
	
	}

	public void divide(int[] array,int[] first,int[] last){
	
		int i;
		for(i=0;i<first.length;i++){
			first[i]=array[i];
	
		}
		for(i=0;i<last.length;i++){
			last[i]=array[first.length+i];
		}

	}

	public void merge(int[] array,int[] first,int[] last){
		int arrayInt=0,fInt=0,lInt=0;
		
		while(fInt<first.length && lInt<last.length){
			//System.out.println(last[lInt]);
			if(first[fInt]<last[lInt]){
				
				array[arrayInt]=first[fInt];
				arrayInt++;
				fInt++;
			}
			if(first[fInt]>last[lInt]){
				
				array[arrayInt]=last[lInt];
				arrayInt++;
				lInt++;
	
			}
	
		}
		while(fInt<first.length){
			array[arrayInt]=first[fInt];
			arrayInt++;
			fInt++;
		}
		while(lInt<last.length){
			array[arrayInt]=last[lInt];
			arrayInt++;
			lInt++;
		}
		
	}

	
	public static void main(String[] args){
		Merge a=new Merge();
		int[] z={9,8,7,6,5,4,3,2,1};
		a.Sort(z);
	
	}


















}
