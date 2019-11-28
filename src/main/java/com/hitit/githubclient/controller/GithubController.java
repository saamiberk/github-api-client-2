package com.hitit.githubclient.controller;


import com.hitit.githubclient.model.response.ContributorsRest;
import com.hitit.githubclient.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class GithubController {

       @Autowired
       private GithubService githubService;

       @GetMapping("/")
       public ModelAndView Index() throws IOException {
           ContributorsRest contributorsRest = githubService.getTopContributor("facebook", "react");
           ModelAndView mv = new ModelAndView("index");
           mv.addObject("contributor", contributorsRest);
           return mv;
       }


}
