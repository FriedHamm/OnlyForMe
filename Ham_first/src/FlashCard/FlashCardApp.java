package FlashCard;

import java.util.Scanner;

/**
 * //일단 어떤 기능이 있어야 하나면
 *     //랜덤으로 조문을 호출해주는 기능
 *     //그리고 맞추면 맞춘 카운트를 1회 해주는 기능
 *     //틀리면 카운트는 그대로 그리고 정답을 보여주는 기능
 *     //전부 순환하면 그대로 종료
 *     //객체는 2페이지당 하나로 구성하자
 *     //
 */
public class FlashCardApp {
    private String[][] law = new String[90][];
    private int lawIndex = 0;
    private int answered = 1;
    private boolean isTurnOn = true;
    private boolean[] check = new boolean[90];
    private int[] wrongAnswer = new int[90];
    public void setLaw(String number, String name, String ... contents) {
        law[lawIndex] = new String[contents.length+2];
        law[lawIndex][0] = number;
        law[lawIndex][1] = name;
        for(int k = 2; k <= contents.length+1; k++)
        {
            law[lawIndex][k] = contents[k-2];
        }
        lawIndex++;
        answered++;
    }

    public void turnOn()
    {
        Scanner scanner = new Scanner(System.in);
        String str;
        outter:while(isTurnOn)
        {
            int random = (int)(Math.random()*lawIndex);
            if(check[random] == false)
            {
                System.out.println();
                System.out.println(law[random][0]);

                for(int i = 1; i < law[random].length; i++)
                {
                    str = scanner.nextLine();
                    boolean check = str.equals(law[random][i]);
                    if(check == false)
                    {

                        System.out.printf("\n틀렸습니다.\n\n");
                        answer(random);
                        System.out.println();
                        continue outter;
                    }
                }
                System.out.printf("\n정답입니다.\n");
                check[random] = true;
                answered--;
            }
          if(answered == 1)
          {
              isTurnOn = false;
              System.out.printf("\n\n모든 문제를 맞추셨습니다.");

          }

        }
    }

    private void answer(int random)
    {
        for(String i : law[random])
        {
            System.out.println(i);
        }
        System.out.println("틀린횟수 : "+(++wrongAnswer[random]));
    }
}
