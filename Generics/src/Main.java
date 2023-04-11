
import java.io.File;
import java.util.Arrays;

public class Main {

	public static void main(String[] args){
		
		Lista l = new Lista();
		
		try {
			for(int i =0; i<3; i++)
			  {
				  Lista l = new Lista();
				  l.add(i);
			  }
			l.add(6.5);
			System.out.println();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(l);
		
	  
	  


	}

}
