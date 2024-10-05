import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i =0; i<N ;i++) {
            arr[i]=0;
        }
        for (int q = 0 ; q<M ;q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int a = i-1; a<j; a++ ) {
                arr[a]=k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i =0 ; i<N ; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}