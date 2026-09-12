package com.rajnishsystems.in.springaipromptingresponse.service;
//import com.rajnishsystems.in.springaipromptingresponse.entity.Tut;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.metadata.ChatResponseMetadata;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.google.genai.GoogleGenAiChatOptions;
//import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

//import java.lang.reflect.Type;
//import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatClient chatClient;



    //  we can move this inside config or pass inside anywhere when injecting bean

    public ChatServiceImpl(ChatClient chatClient){
        this.chatClient=chatClient;

     /*
        we can move this inside config or pass inside anywhere when injecting bean

        public ChatServiceImpl(ChatClient.Builder builder){
        this.chatClient=builder
                .defaultOptions(GoogleGenAiChatOptions.builder()
                        .model("gemini-3.1-flash-lite")
                        .temperature(0.2))
                .build();
    }*/


    }


    @Override
    public String chat(String query) {

   /*     call the llm for response(Fluent api)
        String content = chatClient
                .prompt()
                .user(prompt)
                .system("you are a cricket expert")
                .call()
                .content();*/

   /*     String prompt=query;     //prompt= "Tell me about Virat Kohli?";
        Prompt prompt1=new Prompt(prompt);
        String content = chatClient
                .prompt(prompt1)  //passing prompt
                .call()  // executed via call
                .chatResponse()

//                .getMetadata();
//                .content();   // get content (text)
//        System.out.println(metadata);

                .getResult()
                .getOutput()
                .getText();
        return content;
        }
        */



/*        String prompt=query;     //prompt= "Tell me about Virat Kohli?";
        Prompt prompt1=new Prompt(prompt);
        Tut tutorial = chatClient
                .prompt(prompt1)  //passing prompt
                .call()  // executed via call
                .entity(Tut.class);
        return tutorial; */


 /*
        Receiving output as list

        String prompt=query;     //prompt= "Tell me about Virat Kohli?";
        Prompt prompt1=new Prompt(prompt);
        List<Tut> tutorial = chatClient
                .prompt(prompt1)  //passing prompt
                .call()  // executed via call
                .entity(new ParameterizedTypeReference<List<Tut>>(){

        });
        return tutorial;
    }*/


    String prompt=query;     //prompt= "Tell me about Virat Kohli?";
        Prompt prompt1=new Prompt(prompt, GoogleGenAiChatOptions.builder()
                .model("gemini-3.1-flash-lite")
                .temperature(0.2)
                .build());
        String tutorial = chatClient
                .prompt(prompt1)  //passing prompt
                .call()  // executed via call
                .content();
        return tutorial;
    }
}
