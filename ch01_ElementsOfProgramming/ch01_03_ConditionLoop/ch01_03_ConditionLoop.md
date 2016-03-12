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

```
# While Loops

# For Loops

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

