package com.example.springboot.mybatisplus.framework.socketIo.handler;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author jiangmengnan
 * @since 2025-12-05
 */
@Component
@Slf4j
public class MessageListener {

    @OnConnect
    public void onConnect(SocketIOClient client) {
        log.info("客户端连接：" + client.getSessionId());
    }

    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        log.info("客户端断开：" + client.getSessionId());
    }

    @OnEvent("chat")
    public void onChatEvent(SocketIOClient client, String message) {
        log.info("收到 chat 消息：" + message);

        // 回消息
        client.sendEvent("chat", "服务端收到：" + message);
    }

}
