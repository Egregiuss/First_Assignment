package com.doge.to.the.moon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrenthenPathway {
    @GetMapping (path = "/Expert")
    public String returnExpert (){
        return " what we are doing is strenthening the neural pathway";
    }
}
