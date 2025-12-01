//package com.example.springboot.mybatisplus.framework.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
///**
// * @author jiangmengnan
// * @since 2025-11-20
// *
// * stomp demo
// */
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketStompConfig implements WebSocketMessageBrokerConfigurer {
//
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/ws")
//                .setAllowedOriginPatterns("*")  // 在 2.6.x 中使用 setAllowedOriginPatterns
//                .withSockJS();
////                .setStreamBytesLimit(512 * 1024) // 设置流字节限制
////                .setHttpMessageCacheSize(1000)   // 设置消息缓存大小
////                .setDisconnectDelay(30 * 1000);  // 设置断开延迟
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        // 启用简单内存消息代理，指定消息目的地前缀
//        registry.enableSimpleBroker("/topic", "/queue");
//
//        // 设置应用程序目的地前缀
//        registry.setApplicationDestinationPrefixes("/app");
//
////        // 设置用户目的地前缀
////        registry.setUserDestinationPrefix("/user");
////
////        // 设置心跳设置（可选）
////        registry.setPreservePublishOrder(true);
//    }
//
//
//
//
//}
