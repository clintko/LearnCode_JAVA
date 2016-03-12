---
Title: 1.3   Conditionals and Loops
Content: If/While/For Statements and Application
---

# If Statements
```
/******************************************************************************
 *  Compilation:  javac Flip.java
 *  Execution:    java Flip
 *  
 *  Simulate a fair coin flip and print out "Heads" or "Tails" accordingly.
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Tails
 *
 *
 ******************************************************************************/

public class Flip {

    public static void main(String[] args) { 
        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time
        if (Math.random() < 0.5) System.out.println("Heads");
        else                     System.out.println("Tails");
    }
}
//Copyright © 2000–2011, Robert Sedgewick and Kevin Wayne. 
//Last updated: Sun Aug 2 18:43:37 EDT 2015.
```

# While Loops
```
/******************************************************************************
 *  Compilation:  javac TenHellos.java
 *  Execution:    java TenHellos
 * 
 *  Prints ith Hello for i = 1 to 10. Illlustrates using a while loop
 *  for a repetitive task.
 *
 *  % java TenHellos
 *  1st Hello
 *  2nd Hello 
 *  3rd Hello
 *  4th Hello
 *  5th Hello
 *  6th Hello
 *  7th Hello
 *  8th Hello
 *  9th Hello
 *  10th Hello
 *
 ******************************************************************************/

public class TenHellos { 
    public static void main(String[] args) {

        // print out special cases whose ordinal doesn't end in th
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");

        // count from i = 4 to 10
        int i = 4;
        while (i <= 10) {
            System.out.println(i + "th Hello");
            i = i + 1;
        }

    }
}

//Copyright © 2000–2011, Robert Sedgewick and Kevin Wayne. 
//Last updated: Sun Aug 2 18:43:37 EDT 2015.
```

```
/******************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo N
 *  
 *  This program takes a command-line argument N and prints a table of
 *  the powers of 2 that are less than or equal to 2^N.
 *
 *  % java PowersOfTwo 5
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *
 *  % java PowersOfTwo 6
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *  6 64
 *
 *  Remarks
 *  ------------
 *  Only works if 0 <= N < 31 since 2^31 overflows an int.
 *
 ******************************************************************************/

public class PowersOfTwo {
    public static void main(String[] args) {

        // read in one command-line argument
        int N = Integer.parseInt(args[0]);

        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals N
        while (i <= N) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }

    }
}

//Copyright © 2000–2011, Robert Sedgewick and Kevin Wayne. 
//Last updated: Sun Aug 2 18:43:37 EDT 2015.
```

# For Loops
```
for (int i = 4; i <= 10; i = i + 1)
    System.out.println(i + "th Hello");
```

# Applications
- **Ruler subdivisions**
- **Finite Sums**
- **Newton's method**
- **Number Conversion**
- **Gambler's ruin**

# Other Conditional and Loop Constructs
- **Do-while statements**
- **Break Statements**
- **Continue Statements**
- **Conditional Operator**
- **Labeled Break and Continue Statements**

# Q&A

