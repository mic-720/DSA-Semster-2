class Deposit{
    long principal;
    int time;
    double rate;
    double total_amt;

    Deposit(){
        principal=1000;
        time=2;
        rate=1.2;
    }
    Deposit(long p,int time,double rate){
        principal=p;
        this.time=time;
        this.rate=rate;
    }
    Deposit(long p,int time){
        principal=p;
        this.time=time;
    }
    Deposit(long p,double rate){
        principal=p;
        this.rate=rate;
    }
    double cal_amt(){
        double amt=principal+(principal*rate*time)/100;
        return amt;
    }
    public String Display(){
        return "Principal : "+principal+"\nRate : "+rate+"\nTime : "+time+"\nTotal Amount : "+cal_amt();
    }
}
public class Q5 {
    public static void main(String[] args) {
        Deposit d=new Deposit(1000,2,2);
        System.out.println(d.Display());
    }
}
