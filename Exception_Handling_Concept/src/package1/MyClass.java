package package1;

public class MyClass {
	
	/*
	 * Exception
	 * An exception is a problem that occurs during program execution.
	 * Exceptions cause abnormal termination of the program.
	 */
	
	/*
	 * Exception Handling
	 * Exception handling is a powerful mechanism that handles runtime error to maintain normal application flow.
	 * A well written program should handle all possible exceptions.
	 * Exceptions can be caught using a combination of the try and catch keywords.
	 * A try/catch block is placed around the code that might generate an exception.
	 */
	
	/*
	 * A catch statement involves declaring the type of exception you are trying to catch.
	 * If an exception occurs in the try block, the catch block that follows the try is checked.
	 * If the type of exception that occurred is listed in the catch block, the exception is passed to the catch block much as an argument is passed into a method parameter.
	 * The Exception type can be used to catch all possible exceptions.
	 */
	
	/*
	 * A single try block can contain multiple catch blocks that handle different exceptions separately.
	 * All catch blocks should be ordered from most specific to most general.
	 * Following the specific exceptions, you can use the Exception type to handle all other exceptions as the last catch.
	 */

	
	public static void div(int a, int b){
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e1){
			System.out.println("Arithmetic Exception occurred");
		}
		catch(Exception e){ //(Exception e) statement is used to catch all possible exceptions. Generic catcher.
			System.out.println("Try Catch Block: An exception occurred.");
		}
	}
	
	/*
	 * throw keyword
	 * The throw keyword allows you to manually generate exceptions from your methods.
	 * Some of the numerous available exception types include:
	 * IndexOutOfBoundException
	 * IllegalArgumentException
	 * ArithmeticException
	 * and so on
	 * 
	 */
	public static void div1(int a, int b) throws ArithmeticException{
		if(b==0){
			throw new ArithmeticException("Throws Block: Arithmetic Exception occurred."); //exception would be thrown with this custom message.
		}
		else{
			System.out.println(a/b);
		}
		
	}
	
	/*
	 * Types of exceptions:
	 * There are two types of exceptions - Checked and Unchecked exceptions
	 * Unchecked exceptions are also called Runtime Exceptions.
	 * Checked Exceptions are checked when program is compiled
	 * Unchecked Exceptions are checked at runtime.
	 */
	
	/*
	 * Thread.sleep() throws an InterruptedException. This is an example of checked exception.
	 * Code will not compile until you have handled the checked exceptions.
	 */
	
	/*
	 * When trying to divide by zero throws an ArithmeticException. This is an example of Unchecked exception.
	 * Code will compile successfully even if somehow these exceptions are present.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		div(1, 0);
		div1(1, 0);
	}
	


}
