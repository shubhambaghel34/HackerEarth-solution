import java.math.BigInteger;

import java.io.BufferedReader;

import java.io.InputStreamReader;


class TestClass {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int N = Integer.parseInt(line);

        for (int i = 0; i < N; i++) {

        line=br.readLine();

        String str[]=new String[line.length()];

    str=line.split(" ");

      BigInteger a=new BigInteger(str[0]);

   BigInteger b=new BigInteger(str[1]);

   BigInteger c=new BigInteger("0");

   c=b.add(a);

   System.out.println(c);

        }

    }

}
