package com.gmail.mmalyshmmm;



public class MyException extends ArrayIndexOutOfBoundsException {
	private String message;
	
	public MyException(String message) {
		super();
		this.message = message;
	}
	
	 public MyException() {
		super();
	}
	
	 public MyException(int index){
		 super(index);
	 }
	 
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyException [message=" + message + "]";
	}


	
	

}
