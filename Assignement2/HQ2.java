class Book{
    String BName;
    int BEdition;
    double BPrice;
    Book(String b,int e,double p){
        BName=b;
        BEdition=e;
        BPrice=p;
    }
    void display(){
        System.out.println(BName+"   "+BEdition+"        "+BPrice);
    }
}
public class HQ2 {
    public static void main(String[] args) {
        Book[] b=new Book[5];
        b[0]=new Book("DSA",45,190.2);
        b[1]=new Book("CAL",19,897.25);
        b[2]=new Book("UPM",25,145.6);
        b[3]=new Book("PME",101,225);
        b[4]=new Book("IGT",7,336.8);
        int maxIndex=-1;

        for(int i=0;i<5;i++){
            double maxPrice=-1;
            if(b[i].BPrice>maxPrice){
                maxPrice=b[i].BPrice;
                maxIndex=i;
            }
        }
        System.out.println("The details of the book with maximum price is ");
        System.out.println("BName BEdition BPrice");
        b[maxIndex].display();
    }
    
}
