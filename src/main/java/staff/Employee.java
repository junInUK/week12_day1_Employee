package staff;

public abstract class Employee {
    private String name;
    private String NI_number;
    private double salary;

    public Employee(String name, String NI_number, double salary) {
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.trim().isEmpty()){
            this.name = name;
        }
    }

    public String getNI_number() {
        return NI_number;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if(raise >= 0){
            this.salary += raise;
        }
    }

    public double payBonus(){
        return this.salary*0.01;
    }

}
