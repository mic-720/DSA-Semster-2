class Student{
    int rollno;
    String name;
    String course;
    void input_Student(int r,String n,String c){
        rollno=r;
        name=n;
        course=c;
    }
    void display_Student(){
        // System.out.println("Roll No. : "+rollno);
        // System.out.println("Name : "+name);
        // System.out.println("Course : "+course);
        System.out.print(rollno+"         "+name+" "+course);
    }

}
class Exam extends Student{
    double mark1,mark2,mark3;
    void input_Marks(double m1,double m2,double m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void display_Result(){
        // System.out.println("Mark 1 : "+mark1);
        // System.out.println("Mark 2 : "+mark2);
        // System.out.println("Mark 3 : "+mark3);
        System.out.println("    "+mark1+"   "+mark2+"   "+mark3);
    }
}
public class Q9 {
    public static void main(String[] args) {
        Exam[] e=new Exam[5];
        for(int i=0;i<5;i++){
            e[i]=new Exam();
        }
        // for(int i=0;i<3;i++){
        //     System.out.print("Roll No. : ");
        //     int r=s.nextInt();
        //     System.out.print("Name : ");
        //     String n=s.next();
        //     System.out.print("Course : ");
        //     String c=s.next();
        //     System.out.print("Enter Marks of 3 subjects : ");
        //     double m1=s.nextDouble();
        //     double m2=s.nextDouble();
        //     double m3=s.nextDouble();

        //     e[i].input_Student(r,n,c);
        //     e[i].input_Marsk(m1, m2, m3);
        //     System.out.println();
        // }
        // for(int i=0;i<3;i++){
        //     System.out.println("Roll No. : "+e[i].rollno);
        //     e[i].display_Result();
        //     System.out.println();
        // }
        e[0].input_Student(1, "Prajna", "DSA");
        e[1].input_Student(2, "Yuvraj", "IGT");
        e[2].input_Student(3, "Aditya", "CAL");
        e[3].input_Student(4, "Ujjwal", "PME");
        e[4].input_Student(5, "Sanket", "UPE");

        e[0].input_Marks(97,98,99);
        e[1].input_Marks(85,87,82);
        e[2].input_Marks(67,70,82);
        e[3].input_Marks(56,78,99);
        e[4].input_Marks(89,94,51);

        System.out.println("Roll no. "+" Name "+" Course "+" Mark1 "+" Mark2 "+" Mark3 ");
        for(int i=0;i<5;i++){
            e[i].display_Student();
            e[i].display_Result();
        }




    } 
}

