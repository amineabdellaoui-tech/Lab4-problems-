package problem6;

public class Square extends Forme{
    private double side;

    public Square(double side){
        this.side=side;
    } //constructor

    @Override
    public double getSurface(){ //surface=side*side
        return Math.round(this.side*this.side*100.0)/100.0;
    }

    @Override
    public String toString(){
        return "Square (side "+this.side+" cm)";
    } //print
}
