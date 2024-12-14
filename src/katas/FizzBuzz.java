package katas;

public class FizzBuzz {

	public static void main (String[]args) {
		int numeroActual=0;
		
		for(int i=0;i<100;i++) {
			numeroActual++;
			if(numeroActual % 3 == 0) {
				System.out.println("Fizz");
			}else if(numeroActual % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(numeroActual);
				}
		}
	}	
}
