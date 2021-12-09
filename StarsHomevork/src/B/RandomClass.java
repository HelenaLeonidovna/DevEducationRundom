package B;

public class RandomClass {

      // Вывести на консоль случайное число

      public void Random() {
            int a = 100;
            int i;
            i = (int) (Math.random() * a);
            System.out.println(i);
      }


      //ввести на консоль 10 случайных чисел

      public void TenRandom() {
            System.out.println("Первое число: " + Math.random());
            System.out.println("Первое число: " + Math.random());
            System.out.println("Второе число: " + Math.random());
            System.out.println("Третье число: " + Math.random());
            System.out.println("Четвертое число: " + Math.random());
            System.out.println("Пятое число: " + Math.random());
            System.out.println("Шестое число: " + Math.random());
            System.out.println("Седьмое число: " + Math.random());
            System.out.println("Восьмое число: " + Math.random());
            System.out.println("Девятое число: " + Math.random());
            System.out.println("Десятое число: " + Math.random());
      }


//ввести на консоль 10 случайных чисел в диапазоне от 0 до 10

      public void RandomFromZeroForTen() {
            int a = 0; //от
            int b = 10; // до
            int i = 0;
            for (i = 0; i < 10; i++) {
                  int rand = (a + (int) (Math.random() * b));
                  System.out.println("Cлучайное число: " + rand);
            }
      }


      //ввести на консоль 10 случайных чисел в диапазоне от 20 до 50

      public void RandomFromTwenty() {
            int a = 20; //от
            int b = 50; // до
            int i = 0;
            for (i = 0; i < 10; i++) {
                  int rand = (int) (Math.random() * ((b-a
                  )+a));
                  System.out.println("Cлучайное число: " + rand);
            }
      }


      //ввести на консоль 10 случайных чисел в диапазоне от -10 до 10


      public void RandomFromMinus() {
            int a = -10; //от
            int b = 10; // до
            int i = 0;
            for (i = 0; i <= 10; i++) {
                  int rand = (int) (Math.random() * (10 - (-10)) + (-10));
                  System.out.println("Cлучайное число: " + rand);
            }
      }

      //ввести на консоль случайное количество (в диапазоне от 3 до 15) случайных чисел, каждое в диапазоне от -10 до 35
      public void RandomHelp() {
            int xxx = (int) (Math.random()*(15-3)+3);

            for (int i = 0; i<xxx; i++)
            {int y = (int) (Math.random()*(35-(-10))+(-10));
            System.out.println((int)  y+ "");
      }



      }
}