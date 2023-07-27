package package_2;

public class Triangle extends TwoDShape{
    private String style;

    Triangle(int w, int h,String style) {
        super(w, h);
        this.style=style;
    }
    public String toString(){
        return "This is a "+style
                +" triangle.";
    }
}
