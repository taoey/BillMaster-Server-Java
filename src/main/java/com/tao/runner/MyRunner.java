package com.tao.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 项目启动时自动执行
 */
@Component
public class MyRunner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(MyRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("后端项目启动成功");

//        //启动前端工程
//        File directory = new File("");
//        File absolutePath = directory.getAbsoluteFile();
//        logger.info("当前工作路径为：{}",absolutePath);
//        try {
//            String commandText =String.format("cmd /k start %s\\start_front.bat",absolutePath);
//            Runtime.getRuntime().exec(commandText);
//            logger.info("已启动前端程序......请勿关闭弹出的窗口");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
