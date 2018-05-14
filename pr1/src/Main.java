import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main ex = new Main();
        ex.run();}
    private void run()
    {
        System.out.println("Vhodnie dannie:");
        double x=0.335;
        double y=0.025;
        System.out.println("x=" +x );
        System.out.println("y=" +y);
        System.out.println("Nahodim s1 i f1:");
        double s = calculateR(x, y);
        double f = calculateS(x, y);
        print(s,f);

        System.out.println("Vvedennie dannie:");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("x=" +x1 );
        System.out.println("y=" +y1);

        double s1= calculateR1(x1, y1);
        double f1= calculateS1(x1, y1);
        System.out.println("Nahodim s2 i f2:");
        print2(s1, f1);
        // gg:mm:dd
        System.out.println("God - Mesats - Chislo :");
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
        System.out.println(format.format(d));

    }

    private double calculateS1(double a1, double b1, double x1) {
        return Math.sqrt((x1 * b1) / a1)+Math.cos(Math.pow((x1+b1),3))*Math.cos(Math.pow((x1+b1),3));
    }

    private double calculateR1(double a1, double b1, double x1) {
        return  (x1*x1*(x1+1))/(b1-Math.sin(x1+a1)*Math.sin(x1+a1));
    }

    private double calculateR(double a, double b, double x) {
        return (x*x*(x+1))/(b-Math.sin(x+a)*Math.sin(x+a));

    }

    private double calculateS(double a, double b, double x) {
        return Math.sqrt((x * b) / a)+Math.cos(Math.pow((x+b),3))*Math.cos(Math.pow((x+b),3));

    }
    private void print(double r, double s ){
        System.out.printf(" R = %8.6f\n", r);
        System.out.printf(" S = %8.6f\n", s);

    }
    private void print2(double r1, double s1 ){
        System.out.printf(" R1 = %8.6f\n", r1);
        System.out.printf(" S1 = %8.6f\n", s1);
    }
}

