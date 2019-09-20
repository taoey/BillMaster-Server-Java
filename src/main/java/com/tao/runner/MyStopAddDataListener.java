package com.tao.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * 结束的时候执行
 */
@Component
public class MyStopAddDataListener implements ApplicationListener<ContextClosedEvent> {
    private static Logger logger = LoggerFactory.getLogger(MyStopAddDataListener.class);
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        logger.info("后端程序终止运行");
        Runtime rt = Runtime.getRuntime();
        Process p = null;
        try {
            //rt.exec("cmd.exe /C start wmic process where name='cmd.exe' call terminate");  //关闭所有cmd窗口
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}