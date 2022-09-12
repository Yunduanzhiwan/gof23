package com.yefeng.structure.decorate;

/**
 * 测速
 *
 * @author 夜枫
 */
public class Test {


    static void testFileDataSource() {
        FileDataSource test = new FileDataSource("test");
        test.writeData("hello world");
        String readData = test.readData();
        System.out.println(readData);
    }

    public static void main(String[] args) {
        testCompressionDataSource();
    }


    /**
     * 测速加密/压缩封装
     */
    static void testCompressionDataSource() {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);


        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

    static void testEncodingDataSource() {
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(new FileDataSource("test"));
        encryptionDecorator.writeData("hello world jiangshao");
        String readData = encryptionDecorator.readData();
        System.out.println(readData);
    }

}
