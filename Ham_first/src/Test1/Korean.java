package Test1;

public class Korean {
    private final static String nation = "대한민국";
    private String name;
    private final String ssn;

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Korean{" +
                "nation='" + nation + '\'' +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
