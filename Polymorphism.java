class student {
  String name;
  int age;

  // function with same name, but it can do different tasks 
  // function overloding same name ke function ko ek he class ke aandar create karna
  public void printInfo(String name) {
    System.out.println(name);
  }
  public void printInfo(int age) {
    System.out.println(age);
  }
  public void printInfo(String name, int age) {
    System.out.println(name +  " " + age);
  }
}

public class Polymorphism {
  public static void main(String args[]) {
    Student s1 = new Student();
    s1.name = "aman";
    s1.age = 24;

    Student s2 = new Student(s1);
    s2.printInfo();
  }
}
