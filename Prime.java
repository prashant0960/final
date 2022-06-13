
public class Prime {
	
	public static void main(String[] args) {
		//ToDo auto-generated method stub
		int no=5;
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
			
		}if (temp>0)
		{
			System.out.println("no prime");
		}
		else
		{
      System.out.println("prime");
		}
	}
}

