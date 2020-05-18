package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String temp = null;

        char []ch = new char[10];
        try {
            while ((temp = br.readLine()) != null) {

                    sb.append(temp);

            }
            String str = sb.toString();

            char[] arr = str.toCharArray();
            int len = arr.length;
            for(int i=len;i>0;i--){
                System.out.print(arr[i]);
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
