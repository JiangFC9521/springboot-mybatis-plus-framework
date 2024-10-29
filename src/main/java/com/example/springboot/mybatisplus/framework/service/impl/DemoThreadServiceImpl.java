package com.example.springboot.mybatisplus.framework.service.impl;

import com.example.springboot.mybatisplus.framework.service.DemoThreadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * @author jiang
 * @since 2024-10-29
 */
@Slf4j
@Service
public class DemoThreadServiceImpl implements DemoThreadService {

    @Override
    public CompletableFuture<Void> demoThreadTask() {
        log.info("demoThread 执行");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture(null);
    }
}
