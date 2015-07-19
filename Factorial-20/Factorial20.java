public class Factorial20 {

  private static long factorial( int value ) {
    long result = 1L;

    for ( int iteration = 1; iteration <= value ; iteration++ ) {
      result = result * iteration;
    }

    return result;
  }

  public static void main( String[] arguments ) {
    for ( int i = 0; i <= 50000; i++ ) {
      for ( int value = 0; value <= 20; value++ ) {
        long result = Factorial20.factorial( value );
        System.out.println( result );
      }
    }
  }

}
