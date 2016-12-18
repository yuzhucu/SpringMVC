package com;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    public TestController() {
        System.out.println("TestController constructed......");
    }


    @RequestMapping(value="/test",method=RequestMethod.GET) 
    public ModelAndView testMVC(){
    	System.out.println("Hello Spring MVC" );
        ModelAndView modelAndView = new ModelAndView("/test");
        modelAndView.addObject("info", " Spring MVC");
        return modelAndView;
    }

}
