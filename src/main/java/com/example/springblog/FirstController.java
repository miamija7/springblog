package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello from Spring!";
    }

    // @POST @GET @PATCH @DELETE
    @RequestMapping(method = RequestMethod.GET, path = "/bubbles")
    @ResponseBody
    public String bubbles(){
        return "bubububub!";
    }

    @GetMapping("/greeting/{name}/{lastName}")
    @ResponseBody
    public String greeting(@PathVariable String name, @PathVariable String lastName){
        return "Greetings " + name + " " + lastName;
    }

}
