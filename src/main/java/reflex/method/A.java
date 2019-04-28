package reflex.method;

public class A {
    public void print() {
   System.out.println("helloworld");
  }

  public void print(int a, int b) {
     System.out.println(a + b);
  }

  public void print(String a, String b) {
          System.out.println(a.toUpperCase() + "," + b.toLowerCase());
      }
}
