package com.dylanharper.navigationBar;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @GetMapping("/homePage")
    public String homePage() {

        return "homePage";
    }

    @GetMapping("/webApps")
        public String webAppPage() {
        return "webProjects";
    }

    @GetMapping("/gameApps")
        public String gameAppPage() {
        return "gameProjects";
    }

    @GetMapping("/aboutMe")
        public String aboutMePage() {
        return "aboutDylan";
    }

    @GetMapping("/contact")
        public String contactPage() {
            return "contact";
        }

        @GetMapping("/templates/DylanHarper_resume.pdf")
            public String downloadResume() {
                return "templates/DylanHarper_resume.pdf";
}

}