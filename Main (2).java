import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
    System.out.print("a: ");
    double a = sc.nextDouble();
    System.out.print("b: ");
    double b = sc.nextDouble();
    System.out.print("c: ");
    double c = sc.nextDouble();
    Formulas.findQuadraticRoots(a, b, c);
    System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are ("+Formulas.findQuadraticRoots(a, b, c).toString()+").");

    System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
    System.out.print("x1: ");
    double A = sc.nextDouble();
    System.out.print("y1: ");
    double B = sc.nextDouble();
    System.out.print("x2: ");
    double C = sc.nextDouble();
    System.out.print("y2: ");
    double D = sc.nextDouble();
    OrderedPair pair1 = new OrderedPair(A, B);
    OrderedPair pair2 = new OrderedPair(C, D);
    Formulas.findSlope(pair1, pair2);
    System.out.println("A line between ("+pair1.toString()+") and ("+pair2.toString()+") has a slope of "+Formulas.findSlope(pair1, pair2)+".");

    System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
    System.out.print("x1: ");
    double A1 = sc.nextDouble();
    System.out.print("y1: ");
    double B1 = sc.nextDouble();
    System.out.print("x2: ");
    double C1 = sc.nextDouble();
    System.out.print("y2: ");
    double D1 = sc.nextDouble();
    OrderedPair pair3 = new OrderedPair(A1, B1);
    OrderedPair pair4 = new OrderedPair(C1, D1);
    Formulas.findMidpoint(pair3, pair4);
    System.out.println("The midpoint between ("+pair3.toString()+") and ("+pair4.toString()+") is ("+Formulas.findMidpoint(pair3, pair4).toString()+").");

    System.out.println("SUM OF AN ARITHMETIC SERIES");
    System.out.print("Number of terms: ");
    int A2 = sc.nextInt();
    System.out.print("Starts with: ");
    double B2 = sc.nextDouble();
    System.out.print("Increases by: ");
    double C2 = sc.nextDouble();
    Formulas.findArithmeticSeriesSum(C2, B2, A2);
    System.out.println("The sum of the first "+A2+" terms of an arithmetic series that starts with "+B2+" and increases by "+C2+" is "+Formulas.findArithmeticSeriesSum(C2, B2, A2));

    System.out.println("SUM OF A GEOMETRIC SERIES");
    System.out.print("Number of terms: ");
    int A3 = sc.nextInt();
    System.out.print("Starts with: ");
    double B3 = sc.nextDouble();
    System.out.print("Rate of growth: ");
    double C3 = sc.nextDouble();
    Formulas.findGeometricSeriesSum(C3, B3, A3);
    System.out.println("The sum of the first "+A3+" terms of a finite geometric series that starts with "+B3+" and increases by a rate of "+C3+" is "+Formulas.findGeometricSeriesSum(C3, B3, A3)+".");

    System.out.println("DIE ROLLER");
    System.out.print("How many sides does your die have? ");
    int A4 = sc.nextInt();
    Formulas.rollDie(A4);
    System.out.println("Rolling a "+A4+"-sided die... you got a "+Formulas.rollDie(A4)+"!");

  }
}

class OrderedPair {
  double x;
  double y;
  
  public OrderedPair() {
    x = 0;
    y = 0;
  }

  public OrderedPair(double _x, double _y) {
    x = _x;
    y = _y;
  }

  public String toString() {
    return x+", "+y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}