package com.arifulislam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ariful on 11/5/2016.
 */

@Controller
public class WebController {

    //Home Page Controller
    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }


    @RequestMapping(value = "/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

//     @RequestMapping(value = "/login")
//        public String login(){
//            return "login";
//        }

    @RequestMapping(value = "/403")
        public String error403(){
            return "403";
        }

}
