package com.example.springboot.mybatisplus.framework.service;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

/**
 * @author jiang
 * @since 2024-10-29
 */
public interface DemoThreadService {

    @Async("task1")
    CompletableFuture<Void> demoThreadTask();


}
