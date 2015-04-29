package INT;

/**
 * Created by student on 29.04.2015.
 */
public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side,side);

    }

    public Square(double side,  String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.width;
    }
    public void setSide(double side){
        super.width=side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Square: subclass of " + super.toString() +
                "side="+ width + '}';
    }
}
