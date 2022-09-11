package com.yefeng.creative.prototype.demo1;

import java.util.Date;

/**
 * @author 夜枫
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("hello", date);
        System.out.println(video);


        System.out.println("--------------------------------");
        Video video1 = (Video) video.clone();
        System.out.println(video1);


        System.out.println("--------------------------------");


//        date.setTime(321681321);

        video1.setTitle("sssssssssssssss");
        video1.getDate().setTime(1231232343);

        System.out.println(video);
        System.out.println(video1);



//        Date date = video1.getDate();
//        DateTime dateTime = DateUtil.offsetHour(date, 10);
//        System.out.println(dateTime);


    }
}
