package Zy.selectFile;

import java.io.File;

public class selectFile {
    public static void main(String[] args) {
        File file=new File("G:"+File.separator+"Android work");
        find(file);
    }
    public static void find(File file){
        if(file.isDirectory()){
            File[] f=file.listFiles();  //返回某个目录下所有文件和目录的绝对路径
            if(f!=null){
                for(int x=0;x<f.length;x++){  //遍历每个文件
                    find(f[x]);
                }
            }
        }else{
            System.out.println(file);
        }
    }
}
