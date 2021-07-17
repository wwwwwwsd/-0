package dijiu;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class Test01 {
    public static void main(String[] args) throws IOException {
        File file=new File("myfile.txt");
        //System.out.println("file = " + file);

        boolean exists = file.exists();//判断文件是否存在
        if (exists){
            System.out.println("文件已存在，BOOlean值="+exists);
        }else {
            System.out.println("文件不存在，BOOlean值="+exists);
            boolean create = file.createNewFile();
            System.out.println("文件创建成功 = " + create);
        }
        //名字
        String name = file.getName();
        System.out.println("name = " + name);
        //大小
        long length = file.length();
        System.out.println("length = " + length);
        //最后修改时间
        long l = file.lastModified();
        System.out.println("最后修改时间 = " + l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String chinaDateStr=sdf.format(l);
        System.out.println("chinaDateStr = " + chinaDateStr);

    }
}
