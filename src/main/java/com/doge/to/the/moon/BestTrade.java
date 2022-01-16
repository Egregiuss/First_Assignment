package com.doge.to.the.moon;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BestTrade {
    @GetMapping (path = "/doge")
    public String returnDogeresponse (){
        return "This will be my best trade yet this year";

    }
}
