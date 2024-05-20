package java_inheritance_polymorphism.no1;

public class Segitiga extends ObjekGeometris{
    public double side1;
    public double side2;
    public double side3;
    
    Segitiga(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    
    Segitiga(double sisi1, double sisi2, double sisi3){
        side1 = sisi1;
        side2 = sisi2;
        side3 = sisi3;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public double setSide1(double sisi1){
        return side1 = sisi1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public double setSide2(double sisi2){
        return side2 = sisi2;
    }
    
    public double getSide3() {
        return side3;
    }
    
    public double setSide3(double sisi3){
        return side3 = sisi3;
    }
    
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
         return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + ", sisi2 = " + side2 + ", sisi3 = " + side3;
    }
    
}
