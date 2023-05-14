class Phone{
    int area_code;
    int exchange;
    int number;
    public void input(int a,int e,int number){
        area_code=a;
        exchange=e;
        this.number=number;
    }
    public void display(){
        System.out.println("("+area_code+") "+exchange+"-"+number);
        }
    // public String toString(){
    //     return "(area_code)"+" exchange"+"-number";
    // }
}
public class Q1 {
    public static void main(String[] args) {
        Phone p1=new Phone();
        Phone p2=new Phone();

        p1.area_code=212;
        p1.exchange=767;
        p1.number=8900;
        System.out.print("My number is : ");
        p1.display();

        p2.input(415, 555, 1212);
        System.out.print("Your number is : ");
        p2.display();
    }
}
