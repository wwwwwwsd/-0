package dijiu;

import java.io.File;
import java.util.Scanner;


public class Test05 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入一个将要删除文件的文件名： ");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();

        File file = new File(s);
        boolean flag = file.exists();
        if (flag) {
            file.delete();
            System.out.println(file+"已删除成功！");
        }else{
            System.out.println("您输入的文件或文件目录不存在！");

        }
    }

}
