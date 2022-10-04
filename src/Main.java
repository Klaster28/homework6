public class Main {
    public static void main(String[] args) {
        for (int i =1; i < 11; i++) {
            System.out.println(i);
        }


        for (int a = 10; a > 0 ; a--) {
            System.out.println(a);
        }

        for (int s = 0; s < 17; s = s+2) {
            System.out.println(s);
        }
        for (int z = 10; z >-11; z--) {
            System.out.println(z);
        }
        for (int r = 1904; r < 2096; r = r+4) {
            System.out.println(r+ "год является високосным!");
        }

        int contributionBob = 29000;
        int total = 0;
        for (int q = 1; q<13; q++) {
            total = total + contributionBob ;
            System.out.println("Меяц " + q + " сумма накопления равна " + total);
        }

        int contributionRob = 29000;
        int totAl = 0;
        for (int q = 1; q<13; q++) {
            totAl = totAl + contributionRob ;
            totAl = totAl + totAl/100;
            System.out.println("Меяц " + q + " сумма накопления равна " + totAl);
        }






    }
}