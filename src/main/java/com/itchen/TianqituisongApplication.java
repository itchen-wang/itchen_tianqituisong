package com.itchen;

import com.itchen.controller.Pusher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling // 开启定时任务
public class TianqituisongApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianqituisongApplication.class, args);
    }
    // 定时 早6点推送  0秒 0分 6时
    @Scheduled(cron = "0 0 6 * * ?")
    public void goodMorning(){
        Pusher.push();
    }
}
