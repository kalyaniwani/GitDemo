package com.git;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		Set<Integer> k1=map.keySet();
		Iterator itr=k1.iterator();
		for(Integer i:k1) {
			int key=(int) itr.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	
		map.forEach((k,v)->System.out.println(k+" occures "+v+" times"));
		
		
	}

}
