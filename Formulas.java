public class Formulas {
    
  public static OrderedPair findQuadraticRoots (double a, double b, double c) {
    double answer1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
    double answer2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
      
    OrderedPair answer = new OrderedPair(answer1, answer2);
    return answer;
  }

  public static Double findSlope (OrderedPair A, OrderedPair B) {
    double answer = (B.getY()-A.getY())/(B.getX()-A.getX());
    return answer;
  }

  public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B)
  {
    double answer1 = (A.getX()+B.getX())/2;
    double answer2 = (A.getY()+B.getY())/2;

    OrderedPair answer = new OrderedPair(answer1, answer2);
    return answer;
  }

  public static double findArithmeticSeriesSum (double a, double d, int k) {
    double answer = ((double) k/2)*((2*a)+(d*(k-1)));
    return answer;
  }

  public static double findGeometricSeriesSum (double r, double a, int k) {
    double answer = a*((1-Math.pow(r,k))/(1-r));
    return answer;
  }

  public static int rollDie (int sides) {
    int answer = (int)(Math.random() * (sides)) + 1;
    return answer;
  }
}