package com.yefeng.creative.prototype.demo1;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author 夜枫
 */
@Data
@Accessors(chain = true)
@ToString
public class Video implements Cloneable {


    private String title;
    private Date date;

    public Video(String title) {
        this.title = title;
        date = new Date();
    }

    public Video(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Video video = (Video) obj;
        video.date = (Date) date.clone();
        return obj;
    }
}
