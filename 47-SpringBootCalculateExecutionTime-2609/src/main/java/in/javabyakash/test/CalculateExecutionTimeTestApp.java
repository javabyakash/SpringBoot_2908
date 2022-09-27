package in.javabyakash.test;

import java.time.Duration;

import org.springframework.util.StopWatch;

public class CalculateExecutionTimeTestApp {

	public static void main(String[] args) {
		// Using Spring Core "StopWatch" class , methods: start() and stop() [old approach]
		/*StopWatch sw = new StopWatch();
		
		sw.start();
		System.out.println("START");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow(Math.pow(i + 1, 2), i + 3); 
		}
		sw.stop();
		System.out.println("STOP");
		
		System.out.println("Execution Time in Second : "+sw.getTotalTimeSeconds());
		System.out.println("Execution Time in Millis : "+sw.getTotalTimeMillis());
		System.out.println("Execution Time in Nonos : "+sw.getTotalTimeNanos());*/
		
		
		//Using JDK 8 java.time package Duration(C) [new and recommended approach]
		Long startTime = System.currentTimeMillis();
		System.out.println("START");
		for(int i =0;i < Integer.MAX_VALUE; i++) {
			Math.pow(Math.pow(i+1, 2), i+3);
		}
		System.out.println("STOP");
		Long endTime = System.currentTimeMillis();
		Duration timeTakenToStartup = Duration.ofSeconds(endTime-startTime);
		
		/*
		// formula for conversion for
        // milliseconds to minutes.
        long minutes = (milliseconds / 1000) / 60;
 
        // formula for conversion for
        // milliseconds to seconds
        long seconds = (milliseconds / 1000) % 60;
		*/
		
		System.out.println(timeTakenToStartup.getSeconds());
	}
}
