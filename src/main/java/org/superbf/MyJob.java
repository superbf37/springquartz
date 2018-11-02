package org.superbf;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class MyJob {
    public void printWorkTime() {
        System.out.println("我是定时任务.我的执行时间是："+ DateFormatUtils.format(new Date(), "yyyy-MM-dd'T'HH:mm:ss"));
    }

}
