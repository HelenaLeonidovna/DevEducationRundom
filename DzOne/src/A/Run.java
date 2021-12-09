package A;

public class Run {
    public static void main(String[] args) {
        ConditionalStatements conditionalStatements = new ConditionalStatements();
        System.out.println(conditionalStatements.Equation(3, 7));

        System.out.println(conditionalStatements.Coordinate(52, 27));

        System.out.println(conditionalStatements.getSumOfPositiveNumbers(1, 52, 73));

        System.out.println(conditionalStatements.MaxSummery(5,13,21));

        System.out.println(conditionalStatements.StudentsRating(20));

        Cycles cycles = new Cycles();
        System.out.println(Cycles.SummaChutney());

        System.out.println(Cycles.RootOfNumber(100));

        System.out.println(Cycles.Factorial(3));

        System.out.println(Cycles.Mirror(0));

        System.out.println(Cycles.SummaChisel(2544));

        System.out.println(Cycles.ProstoeChislo(5));

        OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
        int [] Array = new int[] {5, 7, -102, 3, 21, -15, 8, 57, 64};


        System.out.println(oneDimensionalArrays.MinimalElementOfArray(Array));

        System.out.println(oneDimensionalArrays.MaxElementOfArray(Array));

        System.out.println(oneDimensionalArrays.SummaElements(Array));

        System.out.println(oneDimensionalArrays.KolichestvoNechernix(Array));

        System.out.println(oneDimensionalArrays.bubbleSorter(Array));

        System.out.println(oneDimensionalArrays.Select(Array)); //!

        System.out.println(oneDimensionalArrays.ReverseArray(Array));

        System.out.println(oneDimensionalArrays.SumOfOddElements(Array));

        System.out.println(oneDimensionalArrays.MinIndexElementOfArray(Array));

        System.out.println(oneDimensionalArrays.MaxIndexElementOfArray(Array));

        System.out.println(oneDimensionalArrays.ChangeOfPlace(Array));

        System.out.println(Functions.NumberDays(3));

        System.out.println(Functions.PointInSpace(2,2,2,2));


      //  System.out.println(Functions.ChisloTextom());







    }
}
