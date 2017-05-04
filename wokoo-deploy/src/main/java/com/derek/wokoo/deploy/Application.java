package com.derek.wokoo.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动入口
 * Created by derek.wu on 2017-05-05.
 */
@RestController
@SpringBootApplication(scanBasePackages = "com.derek.wokoo")
public class Application {

    @RequestMapping("/")
    public String home(){
        return "wokoo start...";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
