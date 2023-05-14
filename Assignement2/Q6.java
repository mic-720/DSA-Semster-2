abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Square extends Shape{
    double side;
    double area(){
        return side*side;
    }
    double perimeter(){
        return 4*side;
    }
}
class Circle extends Shape{
    double radius;
    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
    double circumference(){
        return perimeter();
    }
}
class Triangle extends Shape{
    double side;
    double area(){
        return (Math.sqrt(3)*side*side)/4;           //equilateral triangle }
    }     
    double perimeter(){
        return 3*side;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Square s=new Square();
        s.side=3;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
