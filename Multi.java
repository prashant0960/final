
public class Multi {
	
	int getMulti(int x,int y)
	{
		int z=x*y;
		return z;
	}
	
	public static void main(String[] args)
	{
		Multi multi=new Multi();
	    int mult=multi.getMulti(10,2);
	    System.out.println(mult);
	}

}
