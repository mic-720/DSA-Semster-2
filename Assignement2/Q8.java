interface DetailInfo{
    void display();
    int count();

}
class Person implements DetailInfo{
    static int maxCount;
    String name;
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("No. of characters present in "+name+" are "+count());}
    public int count(){
        int countt=0;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(c!=' '){
                countt++;
            }
        }
        return countt;
} 
}
public class Q8 {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="Satyam Kumar";
        p.display();
    }
}
