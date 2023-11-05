
public class Main {
    public static void main(String[] args) {


        //Account
        Account account1 = new Account("112345","bader");
        System.out.println(account1.getID());
        System.out.println(account1.getName());
        System.out.println(account1.getBalance());
        account1.credit(5000);
        System.out.println(account1.toString());

        Account account2 = new Account("1334245","khaled",15000);

        account2.transferTo(account1,10000);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.transferTo(account2,15000);
        System.out.println(account1.toString());
        System.out.println(account2.toString());


        System.out.println("--------------------------");



        //Employee

        Employee e1 = new Employee("223333","Rakan",10000);
        System.out.println("name:"+e1.getName());
        System.out.println("id: "+e1.getId());
        Employee e2 = new Employee();
        e2.setSalary(9000);
        e2.setName("saleh");
        e2.setId("213414");

        //raised amount
        System.out.println("20% raise on salary");
        System.out.println("The amount raised: "+e1.raisedSalary(20));
        System.out.println("Employee id: "+e1.getId()+", "+"Salary: "+e1.getSalary());
        System.out.println("Annual salary: "+e1.getAnnualSalary());

        System.out.println("-----------");

        System.out.println(e1.toString());
        System.out.println(e2.toString());




    }
}