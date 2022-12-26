package com.git;

import java.util.HashMap;
import java.util.Map;

public class OcuurenceOfWordsinString {
	
	public static void main(String[] args) {
		
		String s="Hello kalyani wani wani";
		
		String[] words=s.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<words.length;i++) {
			
			if(map.containsKey(words[i])) {
			map.put(words[i], map.get(words[i]) + 1);
			}
			else {
				map.put(words[i], 1);
			}
		}
		
		System.out.println(map);
		
	}

}
