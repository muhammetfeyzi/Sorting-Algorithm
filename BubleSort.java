package SýralamaAlgoritmalari;

import java.util.Random;
// Muhammet Feyzi Saðlam

// our aim is to sort the random numbers with bubble sort
// The logic of the bubble sort is based on the order of the elements from small to small.
public class BubleSort {
	static Random rnd = new Random();
	static int [] sortingArray;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating Array Elements");
		int [] array=null;
		array=diziOlustur();
		System.out.println("Array elements before sorting");
		yazdir(array);
		System.out.println("Array elements after sorting");
		array=sortArray(array);
		yazdir(array);
	}
   static int[] diziOlustur(){
	   sortingArray=new int[8];
	   for(int i=0;i<sortingArray.length;i++)
	   {
		   sortingArray[i]=rnd.nextInt(100);
	   }
	   return sortingArray;
   }
   static void yazdir(int []dizi){
	   for (int i=0;i<dizi.length;i++) {
		System.out.println("array "+i+" . elements :"+dizi[i]);
	}
   }
   static int[] sortArray(int [] dizi){
	  
	   int temp=0;
	   int enKucuk=0;
	   for(int i= 1; i<dizi.length;i++)
	   {
		   for(int j=0;j<dizi.length-1;j++)
		   {
			 
			   if(dizi[j]>dizi[j+1])
			   {
				 	temp=dizi[j+1];
				   	dizi[j+1]=dizi[j];
					dizi[j]=temp;
				  
			   }
			  
		   }
	   }
	   
	   return dizi;
   }

}
