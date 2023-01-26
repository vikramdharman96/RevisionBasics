package exceptionhandling;

public class HandleCheckedException {
	public static void main(String[] args) throws InterruptedException {
			System.out.println("Started");
			System.out.println("Inprogress");
			
//			try {
//				Thread.sleep(4000);    //Checked Exception
//			} catch (InterruptedException e) {
//				
//				e.getMessage();
//			}
//
		
			Thread.sleep(4000);       //throws keyword only for checked Exception
			
			System.out.println("Completed");
			System.out.println("Exited");
	}

}
