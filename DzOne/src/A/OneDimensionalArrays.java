package A;

import java.util.Arrays;



public class OneDimensionalArrays {

    //Найти минимальный элемент массива

    public int MinimalElementOfArray(int[] array) {
        int minElement = array[0];

        for (int a = 1; a < array.length; a++) {
            if (array[a] <= minElement) {
                minElement = array[a];
            }
        }
        return minElement;
    }


    // Найти максимальный элемент массива
    public int MaxElementOfArray(int[] array) {
        int maxElement = array[0];

        for (int a = 1; a > array.length; a++) {
            if (array[a] >= maxElement) {
                maxElement = array[a];
            }
        }
        return maxElement;
    }


    //Посчитать сумму элементов массива с нечетными индексами

    public int SummaElements(int[] array) {
        int i;
        int summaNechetnih = 0;
        for (i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                summaNechetnih += array[i];
            }
        }
        return summaNechetnih;

    }

    public int KolichestvoNechernix(int[] Array) {     //посчитать количество нечетных элементов массива
        int i;
        int summa = 0;
        for (i = 0; i < Array.length; i++) {
            if (i % 2 != 0) {
                summa = summa + 1; //добавляем каждый нечетный элемент массива
            }

        }
        return summa;
    }


    //Отсортировать массив (пузырьком (Bubble)

    public String bubbleSorter(int[] mas) {
        boolean Order = false;
        int cash = 0;
        while (!Order) {
            Order = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    Order = false;
                    cash = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = cash;
                }
            }
        }
        return Arrays.toString(mas);
    }


// Cортировка выбором (Select)

    public String Select(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            int z = i;
            int minimal = mas[i];
            for (int x = i + 1; x < mas.length; x++) {
                if (mas[x] < minimal) {
                    z = x;
                    minimal = mas[x];
                }
            }
            mas[z] = mas[i];
            mas[i] = minimal;
        }
        return Arrays.toString(mas);
    }


    // cортировка вставками (Insert)

    public String Insert(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            int CurrentElement = mas[i];
            int x = i - 1;
            while (x > 0 && mas[x - 1] > CurrentElement) {
                mas[x] = mas[x - 1];
                x--;
            }
            mas[x] = CurrentElement;
        }
        return Arrays.toString(mas);
    }


    //Сделать реверс массива (массив в обратном направлении)

    public String ReverseArray(int[] mas) {
        int res[] = new int[mas.length];
        for (int i = 0; i < mas.length / 2; i++) {
            int cash = mas[i];
            int index = mas.length - i - 1;
            mas[i] = mas[index];
            mas[index] = cash;

        }
        return Arrays.toString(mas);
    }


    //Посчитать количество нечетных элементов массива

    public int SumOfOddElements(int[] array) {
        int i;
        int result = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result++;
            }
        }
        return result;
    }


    //Найти индекс минимального элемента массива


    public int MinIndexElementOfArray(int[] m) {
        int MinimalIndex = 0;
        int Minimal = m[0];

        for (int i = 1; i < m.length; i++) {
            if (m[i] > Minimal) {
                Minimal = m[i];
                MinimalIndex = i;
            }
        }
        return MinimalIndex;
    }


    //  Найти индекс максимального элемента массива

    public int MaxIndexElementOfArray(int[] m) {
        int MaximalIndex = 0;
        int Maximal = m[0];

        for (int i = 1; i < m.length; i++) {
            if (m[i] < Maximal) {
                Maximal = m[i];
                MaximalIndex = i;
            }
        }
        return MaximalIndex;
    }


    //Поменять местами первую и вторую половину массива, например, для массива
    //1 2 3 4, результат 3 4 1 2

    public String ChangeOfPlace(int[] mas) {
        int[] result = new int[mas.length];
        for (int i = 0; i < mas.length / 2; i++) {
            result[i + mas.length / 2] = mas[i];
        }
        for (int i = 0; i > mas.length / 2; i--)
        {result[i] = mas[mas.length / 2 + i];}

        return Arrays.toString(result);
    }

}





