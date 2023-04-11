
public class Lista {
	
	private Object[] valores;
	private int quantidade;
	
	public Lista()
	{
		
	}


	public void add(Object valor)
	 {
	  valores[quantidade++] = valor;
	 }
	 
	 public Object get()
	 {
		 return valores[valores.length-1];
	 }
	
	

}
