package edu.neu.coe.info6205.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import edu.neu.coe.info6205.sort.elementary.InsertionSort;

public class Assignment2 {	
	
	public void orderedsort(int n) {
		List<Integer> orderedlist = new ArrayList<>();
		for(int i =1;i<=n;i++) {
			orderedlist.add(i);
		}
		Integer[] orderArray =orderedlist.toArray(new Integer[0]);
		Timer timer = new Timer();
		double orderedmean = timer.repeat(10,
                () -> orderArray, // supplier
                t -> { // function
            t=orderArray;
            new InsertionSort().sort(t);
            return null;
        }, null, null);
		
		System.out.println("Ordered array--"+orderedmean+"--milesecs");		
	}
	
	public void revorderedsort(int n) {
		List<Integer> revorderedlist = new ArrayList<>();
		for(int i=n;i>=1;i--) {
			revorderedlist.add(i);
		}
		Integer[] revorderArray =revorderedlist.toArray(new Integer[0]);
		Timer timer = new Timer();
		double revorderedmean = timer.repeat(10,
                () -> revorderArray, // supplier
                t -> { // function
            t=revorderArray;
            new InsertionSort().sort(t);
            return null;
        }, null, null);
		
		System.out.println("Reverse-ordered array--"+revorderedmean+"--milesecs");		
	}
	
	public void randomsort(int n) {
		List<Integer> orderedlist = new ArrayList<>();
		for(int i =1;i<=n;i++) {
			orderedlist.add(i);
		}
		Integer[] orderArray =orderedlist.toArray(new Integer[0]);
		Timer timer = new Timer();
		Random random = new Random();
		
		for(int i=n-1;i>0;i--) {
			int ran = random.nextInt(i);
			int temp=0;
			temp = orderArray[ran];
			orderArray[ran]=orderArray[i-1];
			orderArray[i-1]=orderArray[ran];
		}
		
		double randommean = timer.repeat(10,
                () -> orderArray, // supplier
                t -> { // function
            t=orderArray;
            new InsertionSort().sort(t);
            return null;
        }, null, null);
		
		System.out.println("Random array--"+randommean+"--milesecs");		
	}
	
	public void partorderedsort(int n) {
		List<Integer> orderedlist = new ArrayList<>();
		for(int i =1;i<=n;i++) {
			orderedlist.add(i);
		}
		Integer[] orderArray =orderedlist.toArray(new Integer[0]);
		Timer timer = new Timer();
		Random random = new Random();
		
		for(int i=n/2;i>0;i--) {
			int ran = random.nextInt(i);
			int temp=0;
			temp = orderArray[ran];
			orderArray[ran]=orderArray[i-1];
			orderArray[i-1]=orderArray[ran];
		}
		
		double part_orderedmean = timer.repeat(10,
                () -> orderArray, // supplier
                t -> { // function
            t=orderArray;
            new InsertionSort().sort(t);
            return null;
        }, null, null);
		System.out.println("Partially array--"+part_orderedmean+"--milesecs");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arraysize:5000");
		new Assignment2().orderedsort(5000);
		new Assignment2().revorderedsort(5000);
		new Assignment2().randomsort(5000);
		new Assignment2().partorderedsort(5000);
		System.out.println("\n\n\nArraysize:10000");
		new Assignment2().orderedsort(10000);
		new Assignment2().revorderedsort(10000);
		new Assignment2().randomsort(10000);
		new Assignment2().partorderedsort(10000);
		System.out.println("\n\n\nArraysize:20000");
		new Assignment2().orderedsort(20000);
		new Assignment2().revorderedsort(20000);
		new Assignment2().randomsort(20000);
		new Assignment2().partorderedsort(20000);
		System.out.println("\n\n\nArraysize:40000");
		new Assignment2().orderedsort(40000);
		new Assignment2().revorderedsort(40000);
		new Assignment2().randomsort(40000);
		new Assignment2().partorderedsort(40000);
		System.out.println("\n\n\nArraysize:80000");
		new Assignment2().orderedsort(80000);
		new Assignment2().revorderedsort(80000);
		new Assignment2().randomsort(80000);
		new Assignment2().partorderedsort(80000);

	}

}
