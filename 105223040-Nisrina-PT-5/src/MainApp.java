class Person {
    private String name;
    private int age;

    public Person() {  // Konstruktor default
        this.name = "no name";
        this.age = 0;
    }

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        setName(n); 
        setAge(a);
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, 5000.0);
        emp.display();
        emp.showSalary();
    }
}