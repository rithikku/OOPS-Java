// creating class student
class Student {
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }

  // Non paramaterize constructor
  Student() {
   
  }

  // Paramaterize constructor
  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Copy constructor
  Student(Student s3) {
    System.out.println("constructor called");
  }
}

public class classesAndObject {
  public static void main(String args[]) {

    Student s1 = new Student();
    s1.name = "Rithik";
    s1.age = 21;

    Student s2 = new Student("Aman", 25);
    s1.printInfo();

    Student s3 = new Student(s1);
    s3.printInfo();
  }
}
