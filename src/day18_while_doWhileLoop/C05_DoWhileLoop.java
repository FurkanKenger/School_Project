package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 1 ) 9 den 190 e kadar 7 nin kati olan tum tam sayilari ekrana yazdiriniz.

         */

        int bas = 9;
        int bitis = 190;

        int temp = bas;

        //while loop ile
        while (temp < bitis) {

            if (temp % 7 == 0) {
                System.out.println(temp + " ");
            }
            temp++;
        }


    }
}
