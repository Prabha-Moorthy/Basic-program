import java.util.Scanner;

public class NPrimenumber {
	    public static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void generatePrimes(int n) {
	        int count = 0;
	        int num = 2;

	        System.out.println("The first " + n + " prime numbers are:");

	        while (count < n) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10; 
	        generatePrimes(n);
	    }
	}

