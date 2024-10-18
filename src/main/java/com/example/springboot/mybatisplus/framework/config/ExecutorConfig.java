package com.example.springboot.mybatisplus.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;


/**
 * Description: 线程池配置类
 * Author: jiangmengnan
 * CreateDate: 2023/2/28
 */
@Configuration
public class ExecutorConfig {

    @Bean(name = "task1")
    @Primary
    public ThreadPoolTaskExecutor taskExecutor() {
        // 创建线程池任务执行器对象
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数量
        executor.setCorePoolSize(5);
        // 设置最大线程数量
        executor.setMaxPoolSize(10);
        // 设置阻塞队列容量
        executor.setQueueCapacity(100);
        // 设置线程空闲时间，默认为 60 秒
        executor.setKeepAliveSeconds(60);
        // 设置是否支持回收核心线程，默认为 false
        executor.setAllowCoreThreadTimeOut(false);
        // 设置线程名称前缀，若不设置则根据对象的 beanName 生成
        executor.setThreadNamePrefix("my-executor-task1-");
        // 设置线程池拒绝策略，默认为 AbortPolicy，即线程数量达到最大线程数量，且阻塞队列容量已满，再添加任务则抛出异常。
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        // 初始化
        executor.initialize();
        return executor;
    }

//    @Bean(name = "task2")
//    public ThreadPoolTaskExecutor taskExecutor2() {
//        // 创建线程池任务执行器对象
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        // 设置核心线程数量
//        executor.setCorePoolSize(1);
//        // 设置最大线程数量
//        executor.setMaxPoolSize(1);
//        // 设置阻塞队列容量
//        executor.setQueueCapacity(10);
//        // 设置线程空闲时间，默认为 60 秒
//        executor.setKeepAliveSeconds(60);
//        // 设置是否支持回收核心线程，默认为 false
//        executor.setAllowCoreThreadTimeOut(false);
//        // 设置线程名称前缀，若不设置则根据对象的 beanName 生成
//        executor.setThreadNamePrefix("my-executor-task2-");
//        // 设置线程池拒绝策略，默认为 AbortPolicy，即线程数量达到最大线程数量，且阻塞队列容量已满，再添加任务则抛出异常。
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
//        // 初始化
//        executor.initialize();
//        return executor;
//    }



}
