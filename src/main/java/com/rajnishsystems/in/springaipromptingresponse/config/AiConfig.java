package com.rajnishsystems.in.springaipromptingresponse.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.google.genai.GoogleGenAiChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder){
        return builder
                .defaultSystem("You are a coding expert")
                .defaultOptions(GoogleGenAiChatOptions.builder()
                        .model("gemini-3.1-flash-lite")
                        .temperature(0.2))
                .build();
    }
}
