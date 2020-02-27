import java.util.Arrays;



class A implements Comparable
{
	int i;
	A(int i)
	{
		 this.i = i;
	}
	
	@Override
	public String toString()
	{
		return "i=" +i;
	}
	
	public int compareTo(Object o)
	{
		return i - ((A)o).i;
		//return i - ((D)o).i;

		
	}
}
public class N2 
{
	public static void main(String[] args) 
	{
		A[] data = {new A(55),new A(54)};
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

		
	}
}
