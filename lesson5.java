package ru.geekbrains.lesson5;

class Employee {
    String lastname, name, middlename, position, email;
    int phone, salary, age;

    Employee(String lastname,
             String name,
             String middlename,
             String position,
             String email,
             int phone,
             int salary,
             int age) {
        this.lastname = lastname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("lastname: " + lastname
                + " | name: " + name
                + " | middlename: " + middlename 
                + " | position: " + position
                + " | phone: " + phone
                + " | email: " + email
                + " | salary: " + salary
                + " | age: " + age);
    }

    int getAge() {
        return age;
    }
}

public class lesson5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Senior Tester", "ivanov@mail.ru", 892312312, 50000, 45);
        employees[1] = new Employee("Petrov", "Petr", "Petrovich", "Tester",
                "petrov@mail.ru", 892312312, 40000, 30);
        employees[2] = new Employee("Maksimov", "Maksim", "Maksimovich",
                "Tester", "maksimov@mail.ru", 892312312, 40000, 25);
        employees[3] = new Employee("Vasilenko", "Vasiliy", "Vasilevich",
                "Tester", "vasilenko@mail.ru", 892312312, 40000, 41);
        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "Tester", "semenov@mail.me", 892312312, 40000, 23);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}
