class Product{
    long pid;
    double price;
    static double tot_price;
    Product(long p,double price){
        pid=p;
        this.price=price;
    }
    void display(){
        System.out.println("PID : "+pid);
        System.out.println("Price : "+price);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Product p[]=new Product[3];
        Product.tot_price=0;
        p[0]=new Product(4180,236.3);
        p[1]=new Product(5689, 136.9);
        p[2]=new Product(3658,56.3);

        for(int i=0;i<3;i++){
            p[i].display();
            Product.tot_price+=p[i].price;
            System.out.println();
        }
        System.out.println(Product.tot_price);
    }
}
