package A;
import java.lang.Math;

public class Functions {


    //Получить строковое название дня недели по номеру дня.

    public static String NumberDays(int DayNumber) {

        String Day = null;
        if (DayNumber == 1) {
            Day = "Понедельник";
        } else if (DayNumber == 2) {
            Day = "Вторник";
        } else if (DayNumber == 3) {
            Day = "Среда";
        } else if (DayNumber == 4) {
            Day = "Четверг";
        } else if (DayNumber == 5) {
            Day = "Пятница";
        } else if (DayNumber == 6) {
            Day = "Суббота";
        } else if (DayNumber == 7) {
            Day = "Воскресенье";
        } else {
            Day = "Такого дня недели не существует, попробуйте еще раз";
        }

        return Day;

    }


    //Найти расстояние между двумя точками в двухмерном декартовом пространстве (= квадратный корень от (х2-х1)2 + (у2-у1)2)
    public static int PointInSpace(int x1, int x2, int y1, int y2) {
        int One = x1 - y1;
        int Two = x2 - y2;
        int OneEndTwoInSquare = One * One + Two * Two; // возводим по формуле в квадрат и суммируем
        int result = (int) Math.sqrt(OneEndTwoInSquare);
        return result;
    }
}





//Вводим число(0-999), получаем строку с прописью числа.

//  public int ChisloTextom(String num) {
//      Scanner Scanner = new Scanner(System.in);
//      int Number = Scanner.nextInt();
//      System.out.println("Введите число в интервале от 0 до 999");

//  }


//Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число

//   public String ChisloCifroy(int num) {

//       Scanner Scanner = new Scanner(System.in);
//       String Number = Scanner.nextLine();
//       System.out.println("Напишите прописью число в интервале от 0 до 999");
//
//   }



