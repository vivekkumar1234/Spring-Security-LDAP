package org.javalearn.springsecurityldap.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vibha Saluja on 16-07-2020.
 */
@RestController
public class HomeResource {

    @GetMapping("/")
    public String index(){
        return "<h1>Home</h1>";
    }
}
