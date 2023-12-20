public class Main {
  static float myMethod(int x, float y) {
    return x + y;
  }

  public static void main(String[] args) {
    float z = myMethod(5, 3.8f); // Note: Use 'f' to indicate a float literal
    System.out.println(z);
  }
}

//output
//8.8
