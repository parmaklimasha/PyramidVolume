import java.util.Scanner;
public class PyramidVolume {


public static void main (String [] args) {
    double area;
    double height;
    double volume;
    double a = 1d/3d;
    Scanner input = new Scanner(System.in);
System.out.println("Введите площадь основания пирамиды:");
    area = input.nextDouble();
System.out.println("Введите высоту пирамиды:");
    height = input.nextDouble();

volume = a * area * height;

System.out.println("Объем пирамиды равен " + volume);



}

}
