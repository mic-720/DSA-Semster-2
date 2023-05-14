class Complex{
    int real;
    int img;
    void setData(int r,int i){
        real=r;
        img=i;
    }
    void display(){
        System.out.println(real+"+"+img+"i");
    }
    public Complex add(Complex c1,Complex c2){
        Complex ans=new Complex();
        ans.real=c1.real+c2.real;
        ans.img=c1.img+c2.img;
        return ans;
    }
}
public class rough{
    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.setData(1,2);

        Complex c2=new Complex();
        c2.setData(4,5);

        Complex ans=c1.add(c1,c2);
        ans.display();
    }

}