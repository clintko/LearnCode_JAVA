/******************************************************************************
 *  Compilation:  javac Harmonic.java
 *  Execution:    java Harmonic N
 *  
 *  Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N.
 * 
 *  % java Harmonic 10
 *  2.9289682539682538
 *
 *  % java Harmonic 10000
 *  9.787606036044348
 *
 ******************************************************************************/

public class Harmonic {

    public static void main(String[] args) {

	// initialization
	int N = Integer.parseInt(args[0]);
	double harmonic = 0;

	for (int idx = 1; idx <= N; idx++) {
	    harmonic += 1.0 / idx;
	} // end for

	System.out.println(harmonic);
	
    } // end main
} // end class
