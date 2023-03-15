public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int x = 3;

        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");*/

        for(int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        for(int i = 5; i >0 ; i--) {
            System.out.println(i);
        }

        while (x < 5) {
            System.out.println("You are the best");
            x= x+1;
        }
        int result = 0;
        for(int k = 1; k <= 10 ; k++) {
         result = result + k;
        }
        System.out.println("Sum from 1 till 10 = " + result);

        int result_2= 0;
        for(int k = 2; k <= 10 ; k = k+2) {
            result_2 = result_2 + k;
        }
        System.out.println("Sum from 1 till 10 = " + result_2);

        int result_3= 0;
        for (int k = 1; k <= 10 ; k ++) {
            if (k % 2 == 0) {
                result_3 = result_3 + k;
            } else {
                System.out.println(" Нечетное число " + k);
            }
        }
        System.out.println("Sum from 1 till 10 = " + result_3);

        int y = 8;
        do {
            System.out.println(y);
            y--;
        } while (y>2);

        String [] names = new String [] {"Olena", "Victor", "Anastasia", "Anton"};
        System.out.println("Hello " + names [0]);

        for (int f = 0; f < names.length; f++)
        {
            System.out.println(names [f] + " You are the best ");}



    }
}

