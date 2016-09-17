package com.codewar;

/**
 * 
 * digital_root(493193)
 *  => 4 + 9 + 3 + 1 + 9 + 3
 *  => 29 ... 
 *  => 2 + 9 => 11 ... 
 *  =>1 + 1 => 2
 *
 * @author RajS
 *
 */
public class Program1 {
	private static int digital_root(int arg) {
		int sum = 0;
		int a[] = new int[6];
		for (int i = 0; i < a.length; i++) {
			a[i] = arg % 10;
			System.out.println("new entries="+a[i]);
			arg = arg / 10;
			System.out.println("remaining arg="+arg);
			sum =sum+a[i];
			System.out.println("sum="+sum);
		}
		
		if (arg==0) {
			if(sum/10==0){
				return sum;
			}
			return digital_root(sum);
			}
		
		return digital_root(arg);

	}

	public static void main(String[] args) {
		int j = digital_root(4931);
		System.out.println("res" + j);
	}

}
