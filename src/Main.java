import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        int max = 0;
        for (int i =0;i<5;i++) {
            String str = br.readLine();
            if (str.length()>max) max = str.length();
            for (int j=0;j<str.length();j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        for (int i=0;i<max;i++) {
            for (int j=0;j<5;j++) {
                if(arr[j][i]=='\0')
                    continue;
                System.out.print(arr[j][i]);
            }
        }

    }
}