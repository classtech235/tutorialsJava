package abhi.practice.object;
class Rectangle{
    int length;
    int breath;
    void setUp(int i,int j){
        length= i;
        breath=j;
    }
    int rectangleArea(){
        return length*breath;
    }
}
public class Object {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setUp(5, 8);
        int area = r1.rectangleArea();
        System.out.println(area);
    }
}
