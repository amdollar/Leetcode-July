package io.test.Week2;

public class AngleBetweenHands {

	public static void main(String[] args) {
		int hour = 12;
		int min = 20;
		System.out.println(angleClock(hour, min));

	}

	public static double angleClock(int hour, int minutes) {
		 double a1 = 360 * (minutes / 60.0);
	        double a2 = 360 * (hour / 12.0) + 30 * (minutes / 60.0);
	        double result = Math.abs(a1 - a2);
	        if(result > 180.0){
	            result = 360.0 - result;
	        }
	        
	        return result;
	}
}
