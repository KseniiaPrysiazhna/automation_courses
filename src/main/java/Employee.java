public class Employee {
    public String name;
    public String surname;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String name, String surname, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary $: " + salary);
        System.out.println("Age: " + age);

    }
}