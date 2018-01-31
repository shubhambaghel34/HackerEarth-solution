import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String st=line;
        int count=0;
        for (int i=0; i<st.length(); i++) {
         if(st.charAt(i)=='1'){
          count=count+2;
         }else if(st.charAt(i)=='2'){
          count=count+5;
         }else if(st.charAt(i)=='3'){
          count=count+5;
         }else if(st.charAt(i)=='4'){
          count=count+4;
         }else if(st.charAt(i)=='5'){
          count=count+5;
         }else if(st.charAt(i)=='6'){
          count=count+6;
         }else if(st.charAt(i)=='7'){
          count=count+3;
         }else if(st.charAt(i)=='8'){
          count=count+7;
         }else if(st.charAt(i)=='9'){
          count=count+6;
         }else if(st.charAt(i)=='0'){
          count=count+6;
         }
        }


        System.out.println(count);
    }
}
