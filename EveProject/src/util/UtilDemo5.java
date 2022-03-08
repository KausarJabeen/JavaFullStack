package util;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Date 26 OCT 2021 TUESDAY
 * Collection called Properties
 * */

public class UtilDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties(); 
		//its a legacy collection/ old collection. this collection has put and get method.

		
			prop.put("s1", "aaaaa");
			prop.put("s2", "bbbbb");
			
			//prop.load(new FileInputStream("config.properties"));
			
			System.out.println(prop.get("s1"));
			
			Enumeration e= prop.elements();
			
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			
			Set set=prop.entrySet();
			prop.put("s3", "cccccc");
			Iterator iter=set.iterator();
			
			while(iter.hasNext()) {
				//System.out.println(iter.next());
				Map.Entry me=(Map.Entry)iter.next();
				System.out.println(me.getKey());
				System.out.println(me.getValue());
			}
	}

}
