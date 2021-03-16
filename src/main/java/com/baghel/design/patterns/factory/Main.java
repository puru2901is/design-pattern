package com.baghel.design.patterns.factory;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		
		Protocol p1 = ProtocolFactory.getProtocol("SMTP");
		
		p1.sendMail("hello this mail");
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<Callable<Boolean>> tasks = new ArrayList<Callable<Boolean>>();
		List<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();
		
		Callable<Boolean> c1 = () ->  {
			return p1.receiveMail();
		};
		Callable<Boolean> c2 = () -> false;
		
		tasks.add(c1);
		tasks.add(c2);
		
		try {
			 futures = executorService.invokeAll(tasks);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			executorService.shutdown();
		}
		
		
		for(Future<Boolean> f: futures) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
