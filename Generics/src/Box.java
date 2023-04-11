import java.util.List;

public class Box<T extends Number> {
	private T t;
	
	public void set(T t)
	{
		this.t = t;
	}
	public T get()
	{
		return t;
	}
	
	public static void printLista(List <?> list)
	{
		for(Object elem : list)
		{
			System.out.println(elem+ "");
			System.out.println();
		}
	}

}
