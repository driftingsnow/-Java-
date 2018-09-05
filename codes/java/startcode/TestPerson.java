package codereuse;

public class TestPerson {

    public static void main(String[] args) {
        Person applyer1 = new Person();     //出现第一个申请人：applyer1
        long salary_appler1_java = applyer1.getSalaryJava();  //若申请java的工作，一个月的薪水是6000
        long salary_appler1_mysql = applyer1.getSalaryMysql();//若申请mysql的工作，一个月的薪水是5000
        System.out.println("salary_appler1_java" + " " + salary_appler1_java);   
        System.out.println("salary_appler1_mysql" + " " + salary_appler1_mysql); 
        
//      long salary = person.getSalary();
//      System.out.print(salary);
    }

}

