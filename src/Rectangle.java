class Rectangle{
    double length;
    double breadth;

    public Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth= breadth;
    }

    double calculateArea(){
        return length * breadth;
    }

    double calculatePerimeter(){
        return 2 * (length + breadth);
    }
}


class Main{
    public static void main(String[] args) {
        Rectangle rectangle5x6 = new Rectangle(5,6);
        Rectangle rectangle2x3 = new Rectangle(2,3);


        System.out.println(rectangle5x6 .calculateArea() );
        System.out.println(rectangle2x3.calculateArea());
        System.out.println(rectangle5x6.calculatePerimeter());
        System.out.println(rectangle2x3.calculatePerimeter());
    }
}