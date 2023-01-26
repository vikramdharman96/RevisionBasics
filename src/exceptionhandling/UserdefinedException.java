	package exceptionhandling;

public class UserdefinedException {
	public static void main(String[] args) throws AgeInvalidException {
		System.out.println("Started");
	
		int i=18;
		if (i==17) {
			System.out.println("Eligible");
			
		} else {
			try {
				throw new AgeInvalidException();
			}
				
//			catch (AgeInvalidException e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
		   finally	{
			   System.out.println("finally");
		
			}

		}
		
		
	}

}
