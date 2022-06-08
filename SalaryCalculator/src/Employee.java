import java.time.Year;

public class Employee {
    String Name;
    double Salary;
    int WorkHours;
    int HireYear;
    double NewSalary;
    double Bonus;
    double TaxedSalary;
    double RaiseSalary;
    int today;

    Employee(String Name, int Salary, int WorkHours, int HireYear) {
        this.Name = Name;
        this.Salary = Salary;
        this.WorkHours = WorkHours;
        this.HireYear = HireYear;
        this.NewSalary = NewSalary;
        this.Bonus = Bonus;
        this.TaxedSalary = TaxedSalary;
        this.RaiseSalary = RaiseSalary;
        this.today = 2021;
    }

    public void ToString() {
        //Print details of workers
        System.out.println("Employee's Name: " + this.Name);
        System.out.println("Salary:  " + this.Salary);
        System.out.println("Working Hours:  " + this.WorkHours);
        System.out.println("Hire Year:  " + this.HireYear);
    }


    public void Tax() {
        //  Less than 1000 TL tax ->  0 TAX
        //More than 1000 TL tax ->  %3  TAX
        double tax = 0.03;
        if (this.Salary > 1000) {
            this.TaxedSalary = this.Salary * tax;
            System.out.println("Taxed Salary:  " + this.TaxedSalary);
        }
    }

    public void Bonus() {
        //Work more than 40 hours in a week -> for per hour +30 TL
        if (this.WorkHours > 40) {
            int EkstraHour = this.WorkHours - 40;
            this.Bonus = EkstraHour * 30;
            System.out.println("Bonus Amount:  " + this.Bonus);
        }
    }

    public void RaiseSalary() {
        //Working more than 19 years  ->  %15 Raise
        //Working more than 9 - less than 20 years  ->  %10 Raise
        //Working less than 10 years  ->  %5 Raise

        int remaining = this.today - this.HireYear;
        //System.out.println(remaining);

        if (remaining <= 9) {
            this.RaiseSalary = Salary * 0.05;
            System.out.println("Raised Salary:  " + this.RaiseSalary);
        } else if (remaining > 10 && remaining <= 20) {
            this.RaiseSalary = Salary * 0.10;
            System.out.println("Raised Salary:  " + this.RaiseSalary);
        } else if (remaining > 19) {
            this.RaiseSalary = Salary * 0.20;
            System.out.println("Raised Salary:  " + this.RaiseSalary);
        }
    }
    void TotalNewSalary () {
        ToString();
        Tax();
        Bonus();
        RaiseSalary();
        System.out.println("______________________");
        this.NewSalary = this.TaxedSalary + this.Bonus + this.RaiseSalary;
        System.out.println("Addition Amount on the Salary:  " + this.NewSalary);
        System.out.println("-----------------------");
        System.out.println("Total New Salary:  " + (this.NewSalary + this.Salary));

    }
}





