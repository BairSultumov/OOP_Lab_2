
import java.util.Scanner;
public class Quiz {
    /**
     * Variant 24
     * @author Bair Sultumov
     */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Выражение= "+(n-10*Math.sin(n)+Math.abs(Math.pow(n,4)-Math.pow(n,5))));
        //
        //2
        System.out.println("Первые 4 степени PI: ");
        System.out.println(Math.pow(Math.PI,1));
        System.out.println(Math.pow(Math.PI,2));
        System.out.println(Math.pow(Math.PI,3));
        System.out.println(Math.pow(Math.PI,4));
        //
        //3
        int x1=1,y1=2,x2=3,y2=3,x3=5,y3=6;
        double a,b,c,P,p2,S;
        a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
        b=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2), 2));
        c=Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1), 2));
        P=a+b+c;
        p2=P/2;
        S=Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
        System.out.println("Периметр: "+P);
        System.out.println("Площадь: "+S);
        //
        //4
        double x,y;
        System.out.println("Сколько кошек? ");
        x=scan.nextDouble();
        System.out.println("Сколько часов? ");
        y=scan.nextDouble();
        System.out.println("Съедено мышек= "+(2/3*x*y));
    }
}