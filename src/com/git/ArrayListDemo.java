package com.git;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("laptop");
		list.add("mobile");
		list.stream().forEach(e->System.out.println(e));
	}

}
