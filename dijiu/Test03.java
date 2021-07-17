package dijiu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想创建的目录");
        String input = sc.nextLine();
        File file=new File(input);
        boolean exists = file.exists();//判断文件是否存在
        if(!exists){//若不存在
            file.mkdir();
        }else{
            int index = 0;
            while(exists){
                index++;
                file = new File(input+"_副本"+index);
                exists = file.exists();
            }
            file.mkdir();
        }
        System.out.println("文件名:"+file.getName());

    }
}