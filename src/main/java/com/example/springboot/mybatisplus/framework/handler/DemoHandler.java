package com.example.springboot.mybatisplus.framework.handler;

import com.example.springboot.mybatisplus.framework.service.DemoThreadService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author jiang
 * @since 2024-10-29
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class DemoHandler {

    private final DemoThreadService demoThreadService;

//    @Scheduled(fixedDelayString = "5000")
    void demo() throws ExecutionException, InterruptedException {

        log.info("线程测试开始");
        List<CompletableFuture<Void>> completableFutures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CompletableFuture<Void> voidCompletableFuture = demoThreadService.demoThreadTask();
            completableFutures.add(voidCompletableFuture);
        }
        CompletableFuture<Void> allOf = CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0]));
        allOf.get();
        log.info("测试线程结束");
    }

}
