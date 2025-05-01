class Shape {
  String color;
}
// Ek class ki property or methods ko dushri class le leti hai toh wahi INHERITANCE hota hai..
// Triangle class ne Shape class ki property ko le liya hai..
class Triangle extends Shape {
  
}

public class Inheritance {
  public static void main(String args[]) {
    Triangle t1 = new Triangle();
    t1.color = "red";
  }
}
