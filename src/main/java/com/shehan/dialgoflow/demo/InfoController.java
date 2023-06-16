package com.shehan.dialgoflow.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class InfoController {
    @GetMapping(path = "getUsers")
    public  Map<String, List<String>> getUser() {
        Map<String, List<String>> usersList = new HashMap<>();
        List<String> users = new ArrayList<>();
        users.add("Shehan");
        users.add("Amila");
        users.add("Kasun");
        users.add("Chamath");
        usersList.put("user", users);
        return usersList;
    }

    @PostMapping("api")
    public Object requestApi(Object request){
        System.out.println("------------------LOGS-----------------");
        System.out.println(request);
        return request;
    }

}
