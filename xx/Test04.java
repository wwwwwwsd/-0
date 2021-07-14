package text;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入email地址");
        Scanner scanner=new Scanner(System.in);

        String str = scanner.nextLine();
        int i = str.indexOf("@");
        //System.out.println("i = " + i);
        String substring = str.substring(0, i);
        System.out.println("您的用户名为 " + substring);
    }
}