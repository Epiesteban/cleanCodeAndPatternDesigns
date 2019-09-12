package singleton;

public class UseAccountingSingleton {

	public static void main(String[] args) {

		AccountingSingleton accountingSingleton = AccountingSingleton.getInstance();
	
		System.out.println(accountingSingleton.getNTimes());
		
		accountingSingleton.addNtimes(100);
		
		System.out.println(accountingSingleton.getNTimes());
		
		accountingSingleton.addNtimes(1000);

		System.out.println(accountingSingleton.getNTimes());
		
	}

}
