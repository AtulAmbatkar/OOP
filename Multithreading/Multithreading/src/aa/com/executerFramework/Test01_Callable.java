package aa.com.executerFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() +" Runnable implementation task");
	}
}

class MyCallable implements Callable<Integer> {
	
	public Integer call() throws Exception {
		
		System.out.println(Thread.currentThread().getName()+"Callable implementation task");
		return 5;
	}
}

public class Test01_Callable {
	
	public static void main(String[] args) {
		
//		Thread th = new Thread(new MyRunnable());
//		th.start();
//		th.start();        we can not again execution then it's not reused
//		                   here onle created and terminated . not reused
		
//		ExecutorService service = Executors.newSingleThreadExecutor();  // here created & started 
//		ExecutorService service = Executors.newFixedThreadPool(5);
		ExecutorService service = Executors.newCachedThreadPool();
		
//	    service.submit(new MyRunnable());    // here reused again again
//	    service.submit(new MyRunnable());
//	    service.submit(new MyRunnable());
//	    service.submit(new MyRunnable());
//	    service.submit(new MyRunnable());
//	    service.submit(new MyRunnable());
		
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
//		service.submit(new MyCallable());
		
//		for(int i = 1 ; i<=5; i++) {
//			service.submit(new MyRunnable());
//		}
//		
//		service.shutdown();
//		service.shutdownNow();
		
		ExecutorService service2 = Executors.newSingleThreadExecutor();
//		Future<?> runnableFuture = service2.submit(new MyRunnable());
		
		Future<Integer> runnableFuture = service2.submit(new MyCallable());
		
		int runnableResult;
		
		try {
			
			runnableResult = runnableFuture.get();
			System.out.println("RunnableResult: "+runnableResult);
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
	}

}
