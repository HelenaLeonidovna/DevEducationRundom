package A;

public class ConditionalStatements {

    public int One;
    public int Two;
    public int Three;
    public int MaxSummery;


    public int Equation(int a, int b) {
        //если а - четное, посчитать а*в, если не четное - а+в
        int result;
        if (a % 2 == 0) {
            result = (a * b);
        } else {
            result = a + b;
        }
        return result;
    }


    //Определить какой четверти принадлежит точка с координатами (х,у); 1 четверть - x>0, y>0, 2 четверть - x<0, y>0,
    // 3 четверть - x<0, y<0, 4 четверть - x>0, y<0, точка 0
    public int Coordinate(int x, int y) {
        int quarter;

        if (x > 0 && y > 0) {
            quarter = 1;
        } else if (x < 0 && y > 0) {
            quarter = 2;
        } else if (x < 0 && y < 0) {
            quarter = 3;
        } else if (x > 0 && y < 0) {
            quarter = 4;
        } else {
            quarter = 0;
        }
        return quarter;
    }


//Найти суммы только положительных из трех чисел

    public int getSumOfPositiveNumbers(int i, int i1, int i2) {
        int sum = 0;

        if (One > 0) {
            sum = sum + One;
        }
        if (Two > 0) {
            sum = sum + Two;
        }
        if (Three > 0) {
            sum = sum + Three;
        }

        return sum;

    }

    //Посчитать выражение (макс(а*б*с, а+б+с))+3

    public int MaxSummery(int c, int d, int e) {
        int sum = 0;
        if (c + d + e > c * d * e) {
            sum = c + d + e + 3;
        } else if (c + d + e < c * d * e) {
            sum = (c * d * e) + 3;
        } else if (c + d + e == c * d * e) {
            sum = c + d + e + 3;
            System.out.print("Оба значения одинаковы");
        }
        return sum;
    }

    //Написать программу определения оценки студента по его рейтингу, на основе следующих правил
    // Рейтинг 0-19 - F; 20-39 - E; 40-59 - D; 60-74 - C; 75-89 - B; 90-100 - A

    public String StudentsRating(int j) {
        String grade = null;
        if (j >= 0 && j <= 19) {
            grade = "F";
        } else if (j >= 20 && j <= 39) {
            grade = "E";
        } else if (j >= 40 && j <= 59) {
            grade = "D";
        } else if (j >= 60 && j <= 74) {
            grade = "C";
        } else if (j >= 75 && j <= 89) {
            grade = "B";
        } else if (j >= 90 && j <= 100) {
            grade = "A";
        } else if (j > 100 || j < -1) {
            grade = "Non-existent assessment";
        }
        return grade;
    }

}





