package lesson150526.concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CompletionServiceExample {

	static class Task implements Callable<Double> {
		
		static int count = 0;
		private int id;
		
		{
			id = count++;
		}
		
		private double[] _vector;

		public Task(final double[] vector) {
			_vector = vector;
		}
		
		@Override
		public Double call() throws Exception {
			Random random = new Random();
			Thread.sleep(random.nextInt(100));
			double result = 0;
			for (int i = 0; i < _vector.length; i++) {
				result += Math.pow(_vector[i], Math.E);
			}
			System.out.println(id);
			return result;
		}
		
	}
	
	public static void main(final String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(Runtime
				.getRuntime().availableProcessors());
		double[][] matrix = generate();
		
		CompletionService<Double> completionService = new ExecutorCompletionService<Double>(service);
		
		for (double[] row : matrix) {
			Task task = new Task(row);
			completionService.submit(task);
		}
		
		double sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			try {
				double result = completionService.take().get();
				sum += result;
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println("sum = " + sum);
		
		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("finished");
	}

	private static double[][] generate() {
		double[][] matrix = new double[1000][1000];		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.random();
			}
		}
		return matrix;
	}
	
}
