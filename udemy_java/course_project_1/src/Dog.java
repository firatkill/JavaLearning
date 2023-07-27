public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutter", "large", 13.4);
    }

    public Dog(String size, double weight, String earShape, String tailShape) {
        super("Dog", size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("woof!");
    }

    public String getEarShape() {
        return earShape;
    }


    public String getTailShape() {
        return tailShape;
    }
}
