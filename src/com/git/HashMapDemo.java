package com.git;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,10,10,20,40,30};
		int n=a.length;
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
			
		}
		
		//traverse map
		System.out.println(map);
	
		map.forEach((k,v)->System.out.println(k+" occures "+v+" times"));
		
		
	}

}
