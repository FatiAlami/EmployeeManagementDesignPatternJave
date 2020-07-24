// test file
public class Main {
    public static void main (String[] args){
        //Department test
        /*
        Administrative a = new Administrative();
        Service        s = new Service();
        s.getName();
        a.getName();
        a.ManageEmpoloyee();
        People p = new People();
        p.set_isSalaryFix(true);
        p.set_salary(5000.00);
        Remuneration remuneration = new Remuneration(p);
        remuneration.salary();
        */
        People p = new People();
        p.set_isSalaryFix(false);
        p.set_salary(500.00);
        System.out.println("---------------------------------");
        RemEmp remp = new RemEmp(p);
        remp.create().newSalary(p.get_salary());
        remp.create().typeRem();
        System.out.println("---------------------------------");
        p.set_isSalaryFix(true);
        remp.create().newSalary(p.get_salary());
        remp.create().typeRem();
    }
}
