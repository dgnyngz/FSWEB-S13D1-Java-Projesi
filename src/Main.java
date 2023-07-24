import java.net.SocketOption;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("--------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("---------------");
        System.out.println(area2(5.0));
        System.out.println(area2(-1.0));
        Scanner scanner = new Scanner(System.in) ;

        boolean isValid = true ;
        while (isValid) {
            try {
                System.out.println("İlk Sayı : ");
                double x = scanner.nextDouble();
                System.out.println(("İkinci Sayı : "));
                double y = scanner.nextDouble();
                System.out.println("Alan : " + area(x,y));
            }catch (Exception ex) {
                isValid = false ;
                System.out.println("Geçersiz Değer");

            }
        }
    }


    public static boolean shouldWakeUp(boolean isBarking,int time ) {
        if(time<0 || time>23) {
            return false;
        }
        if( time >20 || time <8  &&  isBarking == true) {
             return true;
        }
        return  false ;
    }
    public static  boolean hasTeen(int age1,int age2,int age3) {
        return ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19));

    }
    public static boolean isCatPlaying(boolean isSummer , int degree) {
        if(isSummer && (25<degree && 45>degree)){
            return true ;
        } else if (isSummer == false && (25 < degree && 35 >= degree)) {
            return  true ;
        }
        return  false ;
    }
    public static double area(double x , double y) {
        if(x < 0 || y < 0) {
            return  -1 ;
        }
        return x*y ;
    }
    public  static double area2(double r) {
        if(r < 0 ) {
            return  -1;
        }
        return  r * r * Math.PI;

    }
}


