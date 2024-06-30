public class TypeCosting {
  public static void main(String[] args) {
    // byte-> short-> int -> long ->double
    int n = 1938;
    while (n > 0) {
      int r = n % 10;
      System.out.print(r);
      n = n / 10;
    }
  }

}
