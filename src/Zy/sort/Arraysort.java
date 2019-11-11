package Zy.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Arraysort {
    public static void main(String[] args) throws IOException {
        t2();
    }
    public static void t1() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入需要排列的数字,使用,分隔");
        String str=br.readLine();
        String[] str1=str.split(",");//使用,分割
        Integer[] in=new Integer[str1.length];
        int k=0;
        for(String s:str1){
            in[k]=Integer.parseInt(s);
            k++;
        }
        Arrays.sort(in);
        for(Integer i:in){
            System.out.println(i);
        }
    }
    public static void t2() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入需要排列的数字,使用,分隔");
        String str=br.readLine();
        Set<Integer> s=new HashSet<>();
        String[] str1=str.split(",");
        for(String st:str1){
            s.add(Integer.parseInt(st));
        }
        System.out.println("排序之后的结果是:");
        Iterator iterator=s.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }
}
