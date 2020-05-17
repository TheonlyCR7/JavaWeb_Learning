import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileOutput {

    String[] files;
    String fileAP;
    File filesAP;
    private void printFilesTree() {
        // 正则表达式筛选出当前文件夹名称
        System.out.println( fileAP);
        this.printFilesTree(filesAP);
    }
    public String printFilesTree(File files){

        if (files == null)
            return "该路径下无文件或文件夹";
        else if (!this.filesAP.isAbsolute()){
            return "该路径无效或不为绝对路径";
        }else if (this.filesAP.isDirectory()){
            System.out.print("| --");
            for(File file: filesAP.listFiles()) {
                System.out.println(file.getName());
                printFilesTree(file);  //  获得它的绝对路径, 返回到printFilesTree() 通过正则将当前文件夹的名字筛选出来
            }
        }else if (this.filesAP.isFile()){
            System.out.print("| --");
        }
        return "1";

    }


    public static void main(String[] args) throws IOException {
        // 用户输入绝对路径
        Scanner input = new Scanner(System.in);
        String fileAP = input.nextLine();

        // 添加文件流
        File dir = new File(fileAP);
        // 创建对象
        FileOutput printtree = new FileOutput();
        // 将绝对路径下啊的文件夹 文件 转为字符数组
        String[] filesNames = dir.list();
        printtree.files = filesNames;
        printtree.filesAP = dir;
        printtree.printFilesTree();
    }

}
