import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam de kiem tra: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }


//        if (year % 4 == 0) {
//            if (year % 100 != 0) {
//                System.out.println("la nam nhuan");
//            } else {
//                if (year % 400 != 0) {
//                    System.out.println("khong la nam nhuan");
//                } else {
//                    System.out.println("la nam nhuan");
//                }
//            }
//        } else {
//            System.out.println("Khong la nam nhuan");
//        }
    }
}
