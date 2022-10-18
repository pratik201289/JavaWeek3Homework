package JavaWeek3homework;
/*
Program :14
  */
public class Wall {

    public double width, height;

    public Wall() {
        System.out.println("No Argument Constructor");

    }

    public Wall(double width, double height) {

        this.width = width;
        this.height = height;
        width = 0;
        height = 0;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
       this.width = width;
        if (this.height < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {

        double area;
        area = this.height * this.width;

        return area;
    }

    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
