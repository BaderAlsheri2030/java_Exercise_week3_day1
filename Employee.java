public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(){

    }

    public Employee(String id,String name,double salary){
    this.id =id;
    this.name = name;
    this.salary =salary;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary =salary;
    }
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name =name;
    }

    public double getAnnualSalary(){

        return salary*12;
    }

    public double raisedSalary(int percent){
        double raisedAmount = (getSalary()*(percent/100.0));
        setSalary(salary+raisedAmount);
        return raisedAmount;
    }


    public String toString(){
        return "Employee ID: "+getId()+" Name: "+getName()+", Salary: "+getSalary()
        +", Annual salary: "+getAnnualSalary();
    }
}
