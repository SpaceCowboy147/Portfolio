package com.dylanharper.navigationBar;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.*;

@Controller
public class controller {

    @GetMapping("/")
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

    @GetMapping("/DylanHarper_resume.pdf")
    public void downloadResume(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {

         InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/DylanHarper_resume.pdf");
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);

            File targetFile = new File("/DylanHarper_resume.pdf");
            OutputStream outStream = new FileOutputStream(targetFile);
            outStream.write(buffer);

            System.out.println("orange");
        } catch (Exception ex) {

            ex.printStackTrace();
        }

            }
            }






