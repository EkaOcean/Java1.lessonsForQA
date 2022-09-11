package java1.lessonsforqa.lesson5;

public class Employee {

    private String lastname;
    private String firstname;
    private String middlename;
    private String position;
    private String email;
    private String telephoneNumber;
    private int salary;
    private int age;

    public Employee(String lastname, String firstname, String middlename, String position, String email, String telephoneNumber, int salary, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Last name: " + lastname + " | First name: " + firstname + " | Middle name: " + middlename +
                " | Position: " + position + " | Email: " + email + " | Telephone number: " + telephoneNumber + " | Salary: " + salary + " | Age: " + age + " ";
    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov", "Ivan", "Ivanovich", "Engeneer",
                "ivanovii@gmail.com", "89010530121", 70000, 41);
        empArray[1] = new Employee("Petrov", "Petr", "Petrovich", "Manager",
                "petrovpp@gmail.com", "89000137723", 50000, 46);
        empArray[2] = new Employee("Sidorov", "Semen", "Vladimirovich", "Software Engineer",
                "sidorovsv@gmail.com", "89000400501", 65000, 58);
        empArray[3] = new Employee("Sviridov", "Eugene", "Viktorovich", "Project Manager",
                "sviridovev@gmail.com", "89041258763", 75000, 40);
        empArray[4] = new Employee("Semenova", "Irina", "Sergeevna", "Customer Service Manager",
                "semenovais@gmail.com", "89000600394", 48000, 39);

        for (Employee empAfter40 : empArray)
                if (empAfter40.getAge()>40)
                    System.out.println(empAfter40);
    }
    public int getAge() {
        return age;
    }

}
