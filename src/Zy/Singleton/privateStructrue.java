package Zy.Singleton;

public class privateStructrue {
    private static privateStructrue p=new privateStructrue();
    private privateStructrue(){
        System.out.println("私有构造器创建了");
    }
    public static privateStructrue mehtod(){
        return p;
    }
}
