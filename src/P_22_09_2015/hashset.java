package P_22_09_2015;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet();
		s.add("Krishna");
		s.add("Selenium");
		s.add("Jmeter");
		s.add("Loadrunner");
		System.out.println(s.size());
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
