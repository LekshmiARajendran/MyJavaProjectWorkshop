package classandobjectsexample;
//write a class that describes the fields and methods of a rectangle.
public class Rectangle {
    private double length;
    private double width;
    //creating a constructor for initializing the object
    public Rectangle(double length, double width){
        this.length=length; //can also write as setLength(length);
        this.width=width; // can also write as setWidth(width);
    }
    /*here i can also give like below to avoid naming conflicts and 'this'-bcz it is clearly mentioned that lenght and width is instance variables and l and w are the parameters.
    public Rectangle(double l, double w){
        length=l;
        width=w;
        }
     */
    /*public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }*/
    public double calculatePerimeter(){
        return ( (2*width) + (2*length) );
    }
    public double calculateArea(){
        return (length * width);
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}
