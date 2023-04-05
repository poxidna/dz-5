public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = 9;
        int d = 3;
        int sum1 = a + b;
        int sum2 = c + d;

        //System.out.println(sum1);
        //System.out.println(sum2);

        System.out.println (sum1 > sum2); //Коментар викладача, що достатньо просто вивестирезультат, не обов'язково використовувати тернарний оператор
        ++sum1;
        sum2 -= 2;

        System.out.println((sum1 > sum2) ? true : false);


        System.out.println(sum1 % 2 == 0 || sum2 % 2 == 0 ? true : false); //Коментар викладача, що краще використати подвійний оператор.

    }
}
