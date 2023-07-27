package package_2;

public class TwoDShape extends Shape{
private int height;
private int width;

TwoDShape(int w,int h){
    width=w;
    height=h;
}
    @Override
    void area() {
        System.out.println(this.width*this.height/2);
    }
}
