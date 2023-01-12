package object_class;

public class hashcode {
	public int hashCode()
	{
		return 22;
		
	}
	public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	public static void main(String[] args) {
		hashcode d1 = new hashcode();
		System.out.println(d1);
	}

	}

