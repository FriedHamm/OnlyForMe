package Test1;

public class MemberService {

    private MemberService() {
    }

    private final static String ID = "hong";
    private final static String PASSWORD = "12345";

    public static boolean login(String id, String password)
    {
        return ID.equals(id)&&PASSWORD.equals(password) ? true : false;
    }

    public static void logout(String id)
    {
        System.out.println(id+"님이 로그아웃 하셨습니다.");
    }
}
