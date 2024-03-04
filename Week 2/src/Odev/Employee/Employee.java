package Odev.Employee;

public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String fullName, int salary, int workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double Tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
    public int Bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double RaiseSalary() {
        int year = 2021 - hireYear;
        if (year <= 9) {
             return this.salary * 0.05;
        } if (year  >= 10 && year < 20) {
             return this.salary * 0.10;
        } else {
             return this.salary * 0.15;
        }
    }

    public void toPrint() {
        System.out.println("Çalışanın Adı-Soyadı : " + this.fullName);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + Tax());
        System.out.println("Bonus : " + Bonus());
        System.out.println("Maaş Artışı : " + RaiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - Tax() + Bonus()));
        System.out.println("Toplam Maaş : " + (this.salary - Tax() + Bonus() + RaiseSalary()));
    }
}
