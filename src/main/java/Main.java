public class Main
{
    public static void main(String[] args)
    {
        int Val = 13;
        int Val1 = 11;
        int Val2 = 12;
        int Val3 = 13;

        int a = Val + Val1;
        int b = Val2 + Val3;

        boolean c = a < b;
        System.out.println("Первое значение меньше второго : " + c);

        int d = a;
        int e = d  ++;

        int f = b;
        f -=2;

        boolean g = a > b;
        System.out.println("Первое значение больше второго : " + g);

        boolean k = (a % 2 == 0) || (b % 2 == 0);
        System.out.println("Есть сумма, кратная 2 : " + k);
    }

}


