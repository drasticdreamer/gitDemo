
public class User1LocalUser {

	public static void main(String[] args) {
		
		int x = 11;
		int y = 0;
		User1LocalUser u  = new User1LocalUser();
        System.out.println("Sum " + u.printSumOfFirstTenNumbers(x));
	}
	
	public int printSumOfFirstTenNumbers(int n)
	{
		int sum = 0;
		for (int i=0; i<n; i++)
		{
		   sum = sum + i;
		}
		return sum;
	}

}
