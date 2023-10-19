package Test1;


public class LottoMachine {
    private static int total_of_balls = 45;
    private static int total_of_selected_balls = 6;

    private static int[] balls;

    private LottoMachine() {
    }

    private static void generate_balls(){
        balls = new int[total_of_balls];
        for(int i = 1; i <= total_of_balls; i++)
        {
            balls[i-1] = i;
        }
    }

    private static void mix_balls()
    {
        int first;
        int second;
        for(int i = 0; i < 10000; i++)
        {
            first = (int)(Math.random()*(total_of_balls-1));
            second = (int)(Math.random()*(total_of_balls-1));

            int temp = balls[first];
            balls[first] = balls[second];
            balls[second] = temp;
        }
    }

    private static int[] select_balls()
    {
        int[] selected_balls = new int[total_of_selected_balls];
        for(int i = 0; i < total_of_selected_balls; i++)
        {
            selected_balls[i] = balls[i];
        }
        return selected_balls;
    }

    public static int[] templete_method()
    {
        generate_balls();
        mix_balls();
        return select_balls();
    }




}
