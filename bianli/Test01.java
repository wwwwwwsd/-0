package bianli;

import java.io.File;


public class Test01 {
    public static void main(String[] args) {
        File file=new File("D:\\绝密工作路径");
        long s=findAll(file);
    }
    public static long findAll(File file){
        File[] files=file.listFiles();
        for (File file1 : files) {
            String s1=file1.getName();
            boolean s2=s1.contains("java");
            if (file1.isDirectory()){
                findAll(file1);
            }else{
                if (s2 == true) {
                    System.out.println("文件中带有java名字的：" + file1.getName());
                }
            }
        }
        return 0;
    }
}
