package bianli;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        File file=new File("D:\\绝密工作路径");
        long s=findAll(file);
    }
    public static long findAll(File file){
        File[] files=file.listFiles();
        for (File file1 : files) {
            String s1=file1.getName();
            int D= s1.lastIndexOf(".");
            String h1=s1.substring(D+1);
            String h2="."+h1;
            String zz=".class";
            if (file1.isDirectory()){
                findAll(file1);
            }else{
                if (h2.equals(zz)) {
                    System.out.println("文件后缀名带有.class的文件名：" + file1.getName());
                }
            }
        }
        return 0;
    }
}
