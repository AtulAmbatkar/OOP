package aa.com.multhithreading;

class AddThread extends Thread {
	
	@Override
	public void run() {
		int x = 1;
		for(int i = 2 ; i <= 3 ; i++) {
			
			x = x + i;
			System.out.println(x);
		}
	}

}
