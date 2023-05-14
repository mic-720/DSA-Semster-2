class Student{
    int Roll;
    String name;
    double DSA_Mark;
    void getData(int r,String n,double d){
        Roll=r;
        name=n;
        DSA_Mark=d;
    }
    void showData(){
        System.out.println("Roll No : "+Roll);
        System.out.println("Name : "+name);
        System.out.println("DSA Marks : "+DSA_Mark);
    }
    public String toString(){
        return "Roll no : "+Roll+"\nName : "+name+"\nDSA Marks : "+DSA_Mark;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student[] s=new Student[3];
        for(int i=0;i<s.length;i++){
            s[i]=new Student();
        }
        s[0].getData(1,"Satyam",27);
        s[1].getData(2,"Yuvraj",29);
        s[2].getData(3,"Sanket",30);

        // for(int i=0;i<3;i++){
        //     s[i].showData();
        //     System.out.println();
        // }
        double maxMark=Integer.MIN_VALUE;
        int maxIndex=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(s[i].DSA_Mark>maxMark){
                maxMark=s[i].DSA_Mark;
                maxIndex=i;
            }
        }
       System.out.println("The Details of the Student that has secured highest mark is --> ");
    //    for(int i=0;i<3;i++){
    //         if(highMark==s[i].DSA_Mark){
    //             s[i].showData();
    //         }
    //    } 
    s[maxIndex].showData();
    }
}
