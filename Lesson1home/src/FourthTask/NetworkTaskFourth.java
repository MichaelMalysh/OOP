package FourthTask;


public class NetworkTaskFourth {
	static int n = 100;
	public static int[] numberArray = new int[n];
	PhoneTaskFourth ph = new PhoneTaskFourth();


	public NetworkTaskFourth(int[] numberArray) {
		super();
		NetworkTaskFourth.numberArray = numberArray;
	}

	public NetworkTaskFourth() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void network() {
		ph.setNumber(1111111);

		for (int i = 0; i < numberArray.length; i++) {
			for (int j = 0; j < numberArray.length; j++) {
				numberArray[j] = 1000000 + ((int) (Math.random() * 899900));
			}
		}
		numberArray[0] = ph.registration();

		for (int i : numberArray) {
			System.out.println("+38095" + i);
		}

	}

	public static void searchNumber(int number) {
		boolean check = false;
		for (int i = 0; i < numberArray.length; i++) {
			if (number == numberArray[i]) {
				check = true;
			} 			
		}
		if(check == true){
			System.out.println("Calling");
		}else{
			System.out.println("Input ERROR");
		}
	}
	
	

}
