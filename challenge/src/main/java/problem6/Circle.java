package problem6;

public class Circle extends Forme{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }//constructor

    @Override
    public double getSurface(){ //surface=pi*(r*r)
        return Math.round(Math.PI*Math.pow(this.radius,2)*100.0)/100.0;
    }

    @Override
    public String toString(){
        return "Circle (radius "+this.radius+" cm)";
    } //print
}
