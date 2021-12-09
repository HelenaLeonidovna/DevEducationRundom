package A;

public class Cycles<Public> {

//Найти сумму четных чисел и их количество в диапазоне от 1 до 99


    public static String SummaChutney() {
        int sum = 0;
        int number = 0;
        String result = null;

        for (int a = 1; a < 100; a++) {
            if (a % 2 == 0) {
                number++;
            }
            if (a % 2 == 0) {
                sum += a;
            }
        }

        result = "Сумма четных чисел: " + sum + ";  " + "Сумма четных чисел в диапазоне от 1 до 99: " + number;
        return result;
    }


//Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)


    public static int RootOfNumber(int chi) {
        int Num;
        int Root = chi/2;
        do {
            Num = Root;
            Root = (Num+(chi/Num))/2;
            }
        while ( (Num - Root)!=0);
                       return Root;
    }


//Вычислить факториал числа n. n! = 1*2*…*n-1*n;

    public static int Factorial(int d) {
        int F = 1;
        int i;
        for (i = 1; i <= d; i++) {
            F = F * i;
        }
                return F;
    }

    //Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.

    public static StringBuffer Mirror(int a) {
        StringBuffer Num = new StringBuffer("123");
        Num.reverse(); // делаем реверс числа
       int NumReverse = Integer.parseInt(String.valueOf(Num.reverse()));
        // конвертируем стринг в инт
        return Num.reverse();
    }


//Посчитать сумму цифр заданного числа

    public static int SummaChisel(int s) {
        int result = 0;
        while (s != 0) {
            result = result + (s % 10);
            s /= 10;
        }
        return result;

    }


    //Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1) // алгоритм проверки перебора множителей

    public static boolean ProstoeChislo(int num) {


        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) { //число поделилось без остатка на какое-то число без остатка - значит непростое
                return false;
            }

        }
        return true;
    }
}