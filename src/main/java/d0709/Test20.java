package d0709;

public class Test20 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(6);
        rectangle.setWidth(3);
        double area = rectangle.area();
        rectangle.tostring();

        Cuboid cuboid = new Cuboid();
        cuboid.setLength(5);
        cuboid.setWidth(4);
        cuboid.setHigh(3);
        cuboid.volume();
        cuboid.tostring();
    }
}

class Rectangle{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double area(){
        return length * width;
    }

    void tostring(){
        System.out.println("长方形长"+length+"，宽"+width+"，面积为"+length * width);
    }
}

class Cuboid extends Rectangle{
    private double length;
    private double width;
    private double high;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    double volume(){
        return length*width*high;
    }

    @Override
    void tostring() {
        System.out.println("长方体长"+length+"，宽"+width+"，高"+high+"，体积为"+volume());
    }
}