import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class DuplicateWordFinder {

	
	 String str="big black bug bit a big black dog on his big black nose";
		String strarray[]= str.split(" ");
	 HashMap<String, Integer> hm= new HashMap<String, Integer>();
		
	 
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hm == null) ? 0 : hm.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DuplicateWordFinder other = (DuplicateWordFinder) obj;
		if (hm == null) {
			if (other.hm != null)
				return false;
		} else if (!hm.equals(other.hm))
			return false;
		return true;
	}

	
	public void findDuplicates()
	{
		 for(String s:strarray)
		 {
			 if(!hm.containsKey(s))
			 {
				 hm.put(s, 1);
			 }
			 else
			 {
				 int c=hm.get(s);
				 c=c+1;
				hm.put(s,c);
			 }
				 
		 }
		 
		  Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();
		  
		  StringBuilder strwithoutduplicates=new StringBuilder();
		  
		  while(itr.hasNext()) 
	      { 
	           Map.Entry<String, Integer> entry = itr.next(); 
	           System.out.println("Key = " + entry.getKey() +  
	                               ", Value = " + entry.getValue()); 
	           strwithoutduplicates=strwithoutduplicates.append(entry.getKey());
	           strwithoutduplicates=strwithoutduplicates.append(" ");
	      }
		  System.out.println("String wihtout duplictaes....");
		  System.out.println(strwithoutduplicates);
	}

	
	public void removeDuplicate()
	{
		
		LinkedHashSet<String> hst=new LinkedHashSet<String>();
		//LinkedHashSet<String> hst=new LinkedHashSet<String>();
		String strarray[]= str.split(" ");
		for(String s:strarray)
		{
			hst.add(s);
		}
		
		StringBuilder strwithoutDuplicates=new StringBuilder();
		
	    Iterator<String> it=hst.iterator();
	    while(it.hasNext())
	    {
	    	strwithoutDuplicates.append(it.next());
	    	strwithoutDuplicates.append(" ");
	    }
	    System.out.println("order maintained string is :-");
	    System.out.println(strwithoutDuplicates);
	}

	public static void main(String args[])
	{
	
		DuplicateWordFinder ob=new DuplicateWordFinder();
		ob.findDuplicates();
		ob.removeDuplicate();
	
	
	
	}
	
	
}
