package codereuse;

public class Person {

    //composition has-a relationship
    private Job javajob;
    private Job mysqljob;
   
    public Person(){
        this.javajob=new Job();
        javajob.setSalary(6000L);//若申请java的工作，一个月的薪水是6000
        
        this.mysqljob=new Job();
        mysqljob.setSalary(5000L);//若申请mysql的工作，一个月的薪水是5000
    }
    public long getSalaryJava() {
        return javajob.getSalary();
    }
    
    public long getSalaryMysql() {
        return mysqljob.getSalary();
    }

}

