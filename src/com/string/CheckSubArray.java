package com.string;

public class CheckSubArray {

	public static boolean check(int[] a,int[] b,int m,int n) {
		
		for(int i=0;i<n;i++) {//2nd array
			for(int j=0;j<m;j++) {//1st array
				
				if(a[j]==b[i]) {
					break;
				}
				
				if(j==n) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7};
		int[] b= {2,3,8};
		int m=a.length;
		int n=b.length;
		if(check(a,b,m,n)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		

	}

}
