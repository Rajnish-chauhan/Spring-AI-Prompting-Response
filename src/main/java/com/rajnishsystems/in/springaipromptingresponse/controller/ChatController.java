package com.rajnishsystems.in.springaipromptingresponse.controller;

import com.rajnishsystems.in.springaipromptingresponse.entity.Tut;
import com.rajnishsystems.in.springaipromptingresponse.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import java.util.List;

@RestController
@RequestMapping
public class ChatController {


    private final ChatService chatService;
//    private final ChatClient chatClient;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public ResponseEntity<String> chat(
            @RequestParam(value = "q" ,required = true) String message){

        return ResponseEntity.ok(chatService.chat(message));
    }
}