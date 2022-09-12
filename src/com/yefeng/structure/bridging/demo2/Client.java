package com.yefeng.structure.bridging.demo2;

/**
 * @author 夜枫
 */
public class Client {

    public static void main(String[] args) {
        // TODO 联想笔记本

        Notebook notebookByLenovo = new Notebook(new Lenovo());
        notebookByLenovo.info();


        // todo 苹果台式机

        Desktop desktopByApple = new Desktop(new Apple());
        desktopByApple.info();

    }
}
