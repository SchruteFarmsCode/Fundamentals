package org.example.File;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFileExample {
    public  final String FILEPATH = "myFile.TXT";
    public static byte[] readFromFile(String filepath, int position, int size) throws IOException {

        RandomAccessFile file = new RandomAccessFile(filepath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    public static void writeToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }

}
