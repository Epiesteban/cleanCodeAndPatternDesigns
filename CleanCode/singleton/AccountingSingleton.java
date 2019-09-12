package singleton;

public final class AccountingSingleton {
	
	private int nTimes = 0;

	private static final AccountingSingleton INSTANCE = new AccountingSingleton();
	
	private AccountingSingleton() {}
	
	public static AccountingSingleton getInstance() {
		
		return INSTANCE;
		
	}
	
	public int getNTimes() {
		
		return nTimes;
		
	}
	
	public void addNtimes(int nTimes) {
		
		this.nTimes += nTimes;
		
	}
	
}
