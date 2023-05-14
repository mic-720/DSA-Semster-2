class Rectangle{
    private int length;
    private int breadth;
    void setLength(int l){
        length=l;
    }
    int getLength(){
        return length;
    }
    void setBreadth(int b){
        breadth=b;
        }
    int getBreadth(){
        return breadth;
    }
    int area(){
        return getLength()*getBreadth();
    }
    int perimeter(){
        return 2*(length+breadth);
    }
    boolean isSquare(){
        if(length==breadth){
            return true;
        }
        return false;
    }
}
public class r1{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.setLength(10);
        r.setBreadth(10);
        System.out.println("Length : "+r.getLength());
        System.out.println("Breadth :"+r.getBreadth());
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
        System.out.println("is Square : "+r.isSquare());
    }
}