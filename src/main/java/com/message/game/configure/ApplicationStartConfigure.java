package com.message.game.configure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by LRG on 2019/5/29.
 */
@Configuration
@Slf4j
public class ApplicationStartConfigure implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("项目启动在此定义！");
    }
}
