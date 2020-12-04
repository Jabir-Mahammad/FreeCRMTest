package exception;

public class ThrowDemo {
	public static void main(String[] args) {
		eligibleForVoting1(11);
	}
	
	public static void eligibleForVoting1(int age)
	{
		if((age>=21) && (age<=100))
		{
			System.out.println("Eligible for voting");
		}else {
			//System.out.println("Not Eligible for Voting");
			throw new IllegalArgumentException("Not Eligible for Voting");
		}
	}
	
	
	public static void eligibleForVoting2(int age) throws Exception
	{
		if((age>=21) && (age<=100))
		{
			System.out.println("Eligible for voting");
		}else {
			//System.out.println("Not Eligible for Voting");
			throw new Exception("Not Eligible for Voting");
		}
	}
}
