/* Starting code for Assignment 1
 * Student: Richard Jean-Baptiste
 * CISC 3115
 * Brooklyn College
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
        int tries = 0;
        int maxAttempts = 4;

		System.out.println("WELCOME TO THE BANK OF BC.");
		System.out.println("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		tries++;

		while ( entry != pin && tries < maxAttempts )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}

		if ( entry == pin )
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if ( tries >= maxAttempts )
			System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
  }
}
