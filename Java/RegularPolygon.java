public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    //no args constructor
    RegularPolygon(){
        this(3,1,0,0);
    }

    //two args 
    RegularPolygon(int n, double side){
        this(n,side,0,0);
    }

    //all args
    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //accessor and mutator methods
    int getN(){
        return n;
    }
    void setN(int n){
        this.n = n;
    }
    double getSide() {
        return side;
    }

    void setSide(double side) {
        this.side = side;
    }

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }
    //get perimeter
    public double getPerimeter() {
        return n * side;
    }

    //get Area
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1: Perimeter = " + poly1.getPerimeter() + ", Area = " + poly1.getArea());
        System.out.println("Polygon 2: Perimeter = " + poly2.getPerimeter() + ", Area = " + poly2.getArea());
        System.out.println("Polygon 3: Perimeter = " + poly3.getPerimeter() + ", Area = " + poly3.getArea());
    }
}
