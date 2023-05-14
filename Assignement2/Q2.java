class Complex{
    int real;
    int img;
    void display(){
        System.out.print("("+real+"+"+img+"i)");
    }
    void setData(int r,int i){
        real=r;
        img=i;
    }
    Complex add(Complex c1,Complex c2){
        Complex result=new Complex();
        result.real=c1.real+c2.real;
        result.img=c1.img+c2.img;
        return result;
    }
}
public class Q2{
    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.setData(1,2);
        Complex c2=new Complex();
        c2.setData(7,9);
        Complex ans=c2.add(c1,c2);
        System.out.print("The Addition of ");
        c1.display();
        System.out.print(" and ");
        c2.display();
        System.out.print(" is ");
        ans.display();
    } 
}