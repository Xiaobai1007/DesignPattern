package com.xiaobai.IO;

import java.io.File;
import java.io.IOException;
public class FileIO{

    public static void main(String[] args) {
        File file = new File("E:\\Study");
        selectFile(file, ".txt");
    }

    public static void selectFile(File file, String str) {
        File[] fileList = file.listFiles();
        File createFile = null;
        for (File f : fileList) {
            if (f.isFile() && f.getName().endsWith(str)) {
                createFile = new File("E:"+ File.separator + f.getName());
                if(createFile.exists()){
                    createFile.delete();
                }else{
                    try {
                        createFile.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
