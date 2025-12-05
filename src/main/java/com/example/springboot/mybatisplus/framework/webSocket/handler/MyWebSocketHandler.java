package com.example.springboot.mybatisplus.framework.webSocket.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @author jiangmengnan
 * @since 2025-11-27
 *
 * websocket demo
 */
@Component
public class MyWebSocketHandler extends TextWebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 连接建立后，可保存session用于后续推送消息
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // 处理收到的文本消息
        String payload = message.getPayload();
        // 业务逻辑处理
        session.sendMessage(new TextMessage("服务器回复: " + payload));
    }

}
