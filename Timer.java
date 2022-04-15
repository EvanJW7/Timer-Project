package ds2;

public class Timer {
	
	//Code snippet
	public static void code(int N) {
		int count = 0;
		for (int i= 1; i<N; i++) {
			for (int j = 1; j<N; j++) {
				count++;}
		}
	}
	
	public static void main(String[] args) {
		//Run time - Case 1
		long startTime = System.nanoTime();
		code(15);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Case 1:");
		System.out.println(duration + " nanoseconds");
		System.out.println("\n");
		
		//Run time - Case 2
		long startTime2 = System.nanoTime();
		code(150);
		long endTime2 = System.nanoTime();
		long duration2 = (endTime2 - startTime2);
		System.out.println("Case 2:");
		System.out.println(duration2 + " nanoseconds");
		System.out.println("\n");
		
		//Run time - Case 3
		long startTime3 = System.nanoTime();
		code(1500);
		long endTime3 = System.nanoTime();
		long duration3 = (endTime3 - startTime3);
		System.out.println("Case 3:");
		System.out.println(duration3 + " nanoseconds");
		
	}

}
