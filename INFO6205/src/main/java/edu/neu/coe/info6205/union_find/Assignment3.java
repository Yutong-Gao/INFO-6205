package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class Assignment3 {
	
	public int count(int n) {
		UF_HWQUPC uf = new UF_HWQUPC(n);
		
		int m = 0;
		
		Random random = new Random();
		
		while(uf.components()>1) {
			int p = random.nextInt(n);
			int q = random.nextInt(n);
			
			uf.connect(p, q);
			
			m += 1;
		}
		
		System.out.println(n+" sites need to generated "+m+" pairs of nums.");
		return n-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n = 100;n<=36000;n=n+100) {
			new Assignment3().count(n);
		}
	}

}
