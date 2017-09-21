package com.steven.util.timer;

import com.steven.game.dao.WxTokenMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Administrator on 2017/9/20/020.
 */
public class MyTimerTaskListener {
    @Autowired
    private WxTokenMapper wxTokenMapper;
    private Timer timer = null;
    public void contextInitialized() {
        System.out.println("-----开始启动定时器------");
        Calendar twentyOne = Calendar.getInstance();
        twentyOne.set(Calendar.HOUR_OF_DAY, 23);
        twentyOne.set(Calendar.MINUTE, 0);
        twentyOne.set(Calendar.SECOND, 0);
        timer = new Timer(true);
        //第一次是项目启动执行，间隔2小时执行一次
        timer.schedule(new MyTimerTask(wxTokenMapper), new Date(), 1000*60*60*2);
    }
}
