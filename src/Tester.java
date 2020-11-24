
public class Tester {

	public static void main(String[] args) {
		
		
		int i=123;
		
		String str="";
		
		while (i>0)
		{
			int m=i%10;
			 str +=m+"";
			i=i/10;
		}
		
		int rev=Integer.parseInt(str);
		
		System.out.println("res="+str);
		System.out.println("reversed no="+rev);
		    

		    //String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
		 
		   
		    
		// TODO Auto-generated method stub

	}

}
