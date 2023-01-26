package exceptionhandling;

public class AgeInvalidException extends	Exception {
	
	@Override
	public String getMessage() {
		String reason =" Age is not Suitable";
		return reason;
	}
	
		
		
	}


