package sef.module8.sample;
// Needs to be completed
//Extending from Exception class makes CustomException a Checked Exception
public class CustomException extends Exception{
	public String toString(){
		return "This is my custom exception";

		//1 - Override the toString method of Exception.
		//This message gets printed as soon as CustomException is thrown.
	}

	//You can also write more information about this exception in getMessage()
	//2 - Override getMessage()
	@Override
	public String getMessage() {
		//3 - Enter a message in it and return the same
		
			String msg = "juj";
			return msg;
	}
	
	
	
	
	
}
