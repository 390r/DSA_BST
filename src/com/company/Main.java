

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter wr = new PrintWriter("output.txt");


        MyNode root = null;
        MyBST tree = new MyBST();

        String[] str = new String[4];
        int i=0;
        int[] arr;

        while(sc.hasNextLine()){
            str[i] = sc.nextLine();
            i++;
        }

        String[] strArr = str[0].split(" ");

        arr = new int[strArr.length];

        for (i=0; i<strArr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for (i=0; i<arr.length; i++)
            root = tree.insert(root, arr[i]);

        wr.println(tree.findVal(root, Integer.parseInt(str[1])));
        root = tree.remove(root, Integer.parseInt(str[2]));
        root = tree.insert(root, Integer.parseInt(str[3]));
        wr.println(tree.inOrderTrav(root));
        wr.write("BST:\n" + tree.print(root, arr.length+1));
        tree.mirror(root);
        String lastStr = "";
        lastStr = "BSMT:\n" + tree.print(root, arr.length+1);
        wr.print(lastStr.substring(0, lastStr.length()-1));

        wr.close();

    }
}
