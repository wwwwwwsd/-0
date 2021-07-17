package dijiu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想创建的文件名");
        String input = sc.nextLine();
        File file=new File(input+".txt");
        boolean exists = file.exists();//判断文件是否存在

        if(!exists){//若不存在
            file.createNewFile();
        }else{
            int index = 0;
            while(exists){
                index++;
                file = new File(input+"_副本"+index+".txt");
                exists = file.exists();
            }
            file.createNewFile();
        }
        System.out.println("文件名:"+file.getName());
    }

}
