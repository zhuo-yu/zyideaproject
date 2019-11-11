package Zy.Singleton;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception{
        privateStructrue p1=privateStructrue.mehtod();
        Class clazz=privateStructrue.class;
        Constructor con=clazz.getDeclaredConstructor();
        privateStructrue p2= (privateStructrue) con.newInstance();
    }
}
