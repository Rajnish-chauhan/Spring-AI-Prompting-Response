package com.rajnishsystems.in.springaipromptingresponse.service;
import com.rajnishsystems.in.springaipromptingresponse.entity.Tut;
import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.ai.chat.metadata.ChatResponseMetadata;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatClient chatClient;

    public ChatServiceImpl(ChatClient.Builder builder){
        this.chatClient=builder.build();
    }
    @Override
    public List<Tut> chat(String query) {

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


        String prompt=query;     //prompt= "Tell me about Virat Kohli?";
        Prompt prompt1=new Prompt(prompt);
        List<Tut> tutorial = chatClient
                .prompt(prompt1)  //passing prompt
                .call()  // executed via call
                .entity(new ParameterizedTypeReference<List<Tut>>(){

        });
        return tutorial;
    }
}
