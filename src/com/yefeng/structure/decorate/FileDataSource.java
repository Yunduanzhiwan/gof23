package com.yefeng.structure.decorate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 夜枫
 */
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }


    @Override
    public void writeData(String data) {
        File file = new File(name);
        try {

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes());
            fos.close();    // close the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String readData() {
        File file = new File(name);
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            return new String(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
