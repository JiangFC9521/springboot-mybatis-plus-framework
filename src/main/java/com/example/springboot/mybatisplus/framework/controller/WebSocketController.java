//package com.example.springboot.mybatisplus.framework.controller;
//
//import com.example.springboot.mybatisplus.framework.model.socket.ChatMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author jiangmengnan
// * @since 2025-11-20
// *
// * stomp demo
// */
//@Controller
//@RequestMapping("/socket")
//public class WebSocketController {
//
//    @Autowired
//    private SimpMessagingTemplate template;
//
//    @MessageMapping("/chat")
//    @SendTo("/topic/messages")
//    public ChatMessage sendMessage(ChatMessage message) {
//
//        System.out.println(message);
//        return message;
//    }
//
//    @PostMapping("/sendUser")
//    @ResponseBody
//    public String sendUser(String token) {
//
////        System.out.println(11);
//
////        // 向特定用户发送消息
////        template.convertAndSendToUser(token, "/queue/message", "Hello, user!");
//        // 向指定主题广播消息
//        template.convertAndSend("/topic/messages", "Hello, all!");
//
//        return "success";
//    }
//
//
//}
