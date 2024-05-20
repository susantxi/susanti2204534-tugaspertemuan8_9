package java_inheritance_polymorphism.no1;

public class ObjekGeometris {
    private String color;
    private boolean filled;
    
    public ObjekGeometris(){
        color = "white";
        filled = true;
    }

    public ObjekGeometris(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Warna: " + color + ", Terisi: " + filled;
    }
}
