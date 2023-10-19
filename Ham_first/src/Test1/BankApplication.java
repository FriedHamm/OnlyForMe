package Test1;

import java.util.Scanner;

public class BankApplication {

    private static int accountIndex = 1;
    private Account[] myAccount = new Account[101];
    private boolean isTurn = true;
    public void turnOnApplication()
    {
        Scanner scanner = new Scanner(System.in);
        String str;
        while(isTurn)
        {
            System.out.println("원하시는 숫자를 입력하세요.");
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------");

            str = scanner.nextLine();
            System.out.println(str+"번을 선택하셨습니다.");
            System.out.println("--------------------");

           switch (str)
           {
               case "1" ->{
                   System.out.println("계좌생성");
               System.out.println("--------------------");
                   System.out.println("초기입금액과 이름을 정확하게 순서대로 입력하세요.");
                   System.out.println();
                   int money = Integer.parseInt(scanner.nextLine());
                   newAccount(money, scanner.nextLine());
               }
               case "2" ->{
                   System.out.println("계좌목록");
                   System.out.println("--------------------");
                   accountList();
               }
               case "3" ->{
                   System.out.println("예금");
                   System.out.println("--------------------");
                   System.out.println("계좌번호와 예금하실 금액을 입력하세요.");
                   addBalance(Integer.parseInt(scanner.nextLine()),
                           Integer.parseInt(scanner.nextLine()));

               }
               case "4" ->{
                   System.out.println("출금");
                   System.out.println("--------------------");
                   System.out.println("계좌번호와 출금하실 금액을 입력하세요.");
                   if(getMoney(Integer.parseInt(scanner.nextLine()),
                           Integer.parseInt(scanner.nextLine())))
                   {
                       System.out.println("출금에 성공하였습니다.");
                   }
                   else {
                       System.out.println("출금에 실패하였습니다.");
                   }
               }
               case "5" ->{
                 System.out.println("어플리케이션을 종료합니다.");
                 isTurn = false;
               }

               default ->
               {
                   System.out.println("재대로된 값을 입력하세요.");
               }
           }
        }
    }

    private void newAccount(int money, String name)
    {
        System.out.printf("\n계좌번호: %d\n계좌주: %s\n초기입금액 %d\n", accountIndex,name,money);
        myAccount[accountIndex-1] = new Account(money, accountIndex,name);
        System.out.println("계좌가 생성되었습니다.");
        accountIndex++;
    }

    private void accountList()
    {
        for(Account i : myAccount)
        {
            if(i==null)
            {
                break;
            }
            i.accountInfo();
        }
    }

    private void addBalance(int accountNumber,int money)
    {
        myAccount[accountNumber-1].addBalane(money);
        System.out.println(money+"를 예금하였습니다.");
    }

    private boolean getMoney(int accountNumber,int money)
    {
        if(myAccount[accountNumber-1].takeBalance(money))
        {
            return true;
        }
        return false;

    }


}
