class Person{
    String name;
    int age;
    Person(String n,int a){
        name=n;
        age=a;
    }
}
class Employee extends Person{
    long EID;
    double salary;
    Employee(String n,int a,long e,double s){
        super(n,a);                             //use super keyword when paramaterised constructor of parent class is to be called
        EID=e;
        salary=s;
    }
    String empDisplay(){
        return "Name : "+name+"\nAge : "+age+"\nEID : "+EID+"\nSalary : "+salary;
    }
}
public class Q7 {
    public static void main(String[] args) {
        Employee e=new Employee("Satyam",10,4180,2365.2);   
        System.out.println(e.empDisplay());      
    }
    
}
