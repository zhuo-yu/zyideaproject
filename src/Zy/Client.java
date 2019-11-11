package Zy;

import java.io.*;
import java.util.HashMap;

class   Client {
    public static void main(String[] args) throws IOException {
//        reader() ;
        writer();
    }
    public static void reader() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str);
    }
    public static void writer() throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("存储为字节流");
        bw.close();
    }
}


