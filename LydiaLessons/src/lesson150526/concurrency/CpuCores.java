package lesson150526.concurrency;

public class CpuCores {
	
	public static void main(final String[] args) {
		
		int avaliable = Runtime.getRuntime().availableProcessors();
		System.out.println("avaliable cpu: " + avaliable);
		
	}
	
}
