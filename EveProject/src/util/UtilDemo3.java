package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UtilDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		
		list.add("aaaaaa");
		list.add("bbbbb");
		//list.add(new Suitcase(12,"aa"));
		
				
		 //List Iterator Foward
		Iterator<String> iter=list.iterator();  
		while(iter.hasNext()) {
			String s=(String)iter.next();
			System.out.println(s);
		}
	}

}
