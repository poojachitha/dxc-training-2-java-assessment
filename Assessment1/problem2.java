package Assessment1;

public class problem2 {
    public static void main(String[] args) {
        Janitor j1 = new Janitor();
        System.out.println(j1.getHours());
        System.out.println(j1.getSalary());
        System.out.println(j1.getVacationDays());
        System.out.println(j1.getVacationForm());
        j1.clean();
    }

}

class Employee {

    private int baseHours = 40;
    private double baseSalary = 40000.0;
    private int baseVacationDays = 10;
    private String baseVacationForm = "yellow";

    public int getHours() {
        return baseHours;
    }

    public double getSalary() {
        return baseSalary;
    }

    public int getVacationDays() {
        return baseVacationDays;
    }

    public String getVacationForm() {
        return baseVacationForm;
    }

    public final void setBaseHours(int hours) {
        baseHours = hours;
    }

    public final void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public final void setBaseVacationDays(int days) {
        baseVacationDays = days;
    }

    public final void setBaseVacationForm(String form) {
        baseVacationForm = form;
    }
}

class Janitor extends Employee {
    public int getHours() {
        return super.getHours() * 2;
    }

    public double getSalary() {
        return super.getSalary() - 10000;
    }

    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    public String getVacationForm() {
        return super.getVacationForm();
    }

    public void clean() {
        System.out.println("Workin' for the man.");
    }
}