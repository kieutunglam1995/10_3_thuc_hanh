import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều cao:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn"+ rectangle.display());
        System.out.println("chu vi của hình chữ nhật: "+ rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: "+ rectangle.getArea());
    }
}

class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "hình chữ nhật{" + "chiều rộng=" + width + ", chiều cao=" + height + "}";
    }
}
