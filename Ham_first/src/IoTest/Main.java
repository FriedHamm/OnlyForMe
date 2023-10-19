package IoTest;

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{

        InputStream in = new FileInputStream("/Users/k_ham/Desktop/test1.dat");
        int a = -1;

        while((a = in.read()) != -1)
        {
            System.out.println(a);
        }
     in.close();
    }



}
