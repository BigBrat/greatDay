package ydzhao.weixin.tuisong.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ydzhao.weixin.tuisong.util.Pusher;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid，多个用,分格
    private static String openId = "oAKKs59OhmLd_3Hwp4AxF-t_B_hY,oAKKs5x_TYvG7MyKnkvy8uAlq7ug";

    @Scheduled(cron = "0 30 7 * * ?")
//    @Scheduled(cron = "0 39 23 * * ?")
    public void goodMorning(){
        Pusher.push(openId);
    }

}
