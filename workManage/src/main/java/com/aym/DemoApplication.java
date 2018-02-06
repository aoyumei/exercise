package com.aym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author plum
 */
//same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class DemoApplication {

//EnableAutoConfiguration 这个注解是自动配置的意思，它表示SpringBoot可以通过添加的jar依赖关系来猜你将如何配置spring。

    /**
     * main方法通过调用run()委托给SpringBoot的SpringApplication类，SpringApplication类将引导我们的应用程序，启动Spring，
     * 然后启动自动配置的Tomcat Web服务器。我们需要将DemoApplication.class作为一个参数传给run方法，告诉SpringApplication，
     * 它是一个主要组件，还传递了args数组以传递命令行参数。
     * 只是一个可以使用的库
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
