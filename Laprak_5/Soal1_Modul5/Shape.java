package Soal1_Modul5;

public abstract class Shape {
    private String shapeName ;

    public Shape(String name) {
        shapeName = name ;
    }

    protected abstract double area() ;

    public String toString() {
        return shapeName ;
    }
}