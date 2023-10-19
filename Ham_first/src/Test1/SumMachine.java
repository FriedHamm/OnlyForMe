package Test1;

public class SumMachine {

    private SumMachine() {
    }

    public static int Sum(int ... i)
    {
        int sum = 0;

        for(int k : i)
        {
            sum += k;
        }
        return sum;
    }
}
