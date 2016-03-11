public class QandA {
    public static void main(String[] args) {
	// Q: How do I get the | symbol
	System.out.println("--------------------------");
	System.out.println("Get |");
	System.out.println("|");

	// Q: display only 3 digits after the decimal place
	System.out.println("--------------------------");
	System.out.println("display only 3 digits after the decimal place");
	System.out.println(7.0/3.0);
	System.out.printf("%.3f\n", 7.0/3.0);

	// Q: % /
	System.out.println("--------------------------");
	System.out.println("/ vs %");
	System.out.println(-4 / 5);
	System.out.println(-4 % 5);

	// Q: print \
	System.out.println("--------------------------");
	System.out.println("print \\");

	// Q: a+=b vs a = a + b
	System.out.println("--------------------------");
	System.out.println("a+=b vs a=a+b");
	int a = 0;
	double b = 0.0;

	a = 3;
	b = 4.0;
	a += b;
	System.out.println("After a+=b" + a);

	a = 3;
	b = 4.0;
	//a = a + b;
	System.out.println("After a=a+b, you get compiler error");

    } // end main
}
