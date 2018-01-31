import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
         public static void main(String args[] ) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int N = Integer.parseInt(line);
            for (int i = 0; i < N; i++) {
                String s=br.readLine();
                String r="";
                for(int j=s.length()-1;j>=0;j--){
                   r=r+s.charAt(j);
                }
               System.out.println(r);
           }
       }
}
