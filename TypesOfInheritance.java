class Shape {
  public void area() {
    System.out.println("Displays area");
  }
}

// Yaha tak Single level inheritance.. 
class Triangle extends Shape {
  public void area(int l, int h) {
    System.out.println(1/2*l*h);
  }
}

// But yaha multiple level inheritance..
class EquilateralTriangle extends Triangle {
  public void area(int l, int h) {
    system.out.println(1/2*l*h);
  }
}

// Hierarical inheritance..
class Circle extends Shape {
  public void area(int r) {
    System.out.println((3.14)*r*r);
  }
}

public class TypesOfInheritance {
  public static void main(String args[]) {
    
  }
}
