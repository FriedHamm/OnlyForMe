package ExceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {
    public static void main(String[] args) {




        try
        {
            throw new Exception("예외발생");

        }
        catch(Exception e)
        {
            //사용자 정의 예외는 이런 장점이 있을 거 같음
            //첫번째로는 다양한 예외들을 묶어버리는 용도
            // catch(이런 예외.. 저런 예외.. 이렇게 해버리고)
            //사용자 정의 예외를 생성해서 던져주면 깔끔하게 해결
            // 그리고 사용자 정의로 인하여.. 내가 원하는 예외를 만들어줄 수도 있고
        }
    }
}





