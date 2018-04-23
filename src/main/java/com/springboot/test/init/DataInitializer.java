package com.springboot.test.init;

import org.springframework.boot.CommandLineRunner;
        import org.springframework.stereotype.Component;

/**
 * Created by ZhouYuhan on 2018/4/23 0023.
 */
@Component
public class DataInitializer implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务器已启动");
    }
}
