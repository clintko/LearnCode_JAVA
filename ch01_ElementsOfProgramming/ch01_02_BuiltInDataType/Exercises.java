public class Ex02 {
    public static void main(String[] args) {

	for (String num : args){
	    double degrees = Double.parseDouble(num);
	    double radians = Math.toRadians(degrees);
	    double s = Math.sin(radians);
	    double c = Math.cos(radians);
	    double r = s*s + c*c;
	    System.out.println(s*s + " + " + c*c + " = " + r);
	} // end for
	
    } // end main
} // end Exercises
