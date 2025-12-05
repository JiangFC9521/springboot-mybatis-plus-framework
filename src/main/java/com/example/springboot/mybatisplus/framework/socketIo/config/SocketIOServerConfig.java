package com.example.springboot.mybatisplus.framework.socketIo.config;

import com.corundumstudio.socketio.SocketIOServer;
import com.example.springboot.mybatisplus.framework.socketIo.handler.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangmengnan
 * @since 2025-12-04
 */
@Configuration
public class SocketIOServerConfig {

    @Autowired
    private MessageListener messageListener;

    @Bean
    public SocketIOServer socketIOServer() {
        com.corundumstudio.socketio.Configuration config = new com.corundumstudio.socketio.Configuration();
        config.setHostname("0.0.0.0");
        config.setPort(9092);

        config.setOrigin("*");

        SocketIOServer server = new SocketIOServer(config);
        server.addListeners(messageListener);

        return server;
    }

    @Bean
    public ApplicationRunner runner(SocketIOServer server) {
        return args -> server.start();
    }


}
