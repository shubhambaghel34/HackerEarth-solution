import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line=br.readLine();
         String str[]=new String[N];
         int arr[]=new int[N];
         str=line.split(" ");
         for(int l=0;l<str.length;l++){
          arr[l]=Integer.parseInt(str[l]);
         }
        int l=0;

        for (int i = 0; i < N; i++) {
         for(int k=1;k<=arr[l];k++){
             if(k%3==0 && k%5==0){
           System.out.println("FizzBuzz");
             }else if(k%3==0){
           System.out.println("Fizz");
          }else if(k%5==0){
           System.out.println("Buzz");
          }else{
           System.out.println(k);
          }

         }
         l++;

        }



    }
}
