public abstract class abstra {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); 
}

// Subclass (inherit from Main)
class Student extends abstra {
  public int graduationYear = 2018;
  public void study() { 
    System.out.println("Studying all day long");
  }
}

public class Second {
  public static void main(String[] args) {
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); 
  }
} 