package com.shehan.dialgoflow.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {
    @GetMapping(path = "getUsers")
    public List<String> getUser() {
        List<String> users = new ArrayList<>();
        users.add("Shehan");
        users.add("Amila");
        users.add("Kasun");
        users.add("Chamath");
        return users;
    }

    @PostMapping
    public Object requestApi(Object request){
        System.out.println("------------------LOGS-----------------");
        System.out.println(request);
        return request;
    }

}
