package com.rajnishsystems.in.springaipromptingresponse.service;


import com.rajnishsystems.in.springaipromptingresponse.entity.Tut;

import java.util.List;

public interface ChatService {
    List<Tut> chat(String query);
}
