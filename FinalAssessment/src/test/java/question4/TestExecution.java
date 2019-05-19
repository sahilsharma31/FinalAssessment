package question4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestExecution {

	public static void main(String[] args) {
		
		methodclass m1 = new methodclass();
		List<String> ar1=new ArrayList<String>();
		Set<Object> s1=new HashSet<Object>();
		ar1=m1.ListMethod();
		s1=m1.SetMethod();
		
		for(String a:ar1){
			System.out.println("List elements:" + ar1);
			
		}
		
		for(Object x:s1){
			System.out.println("Set elements:" + x);
		}

	}

}
