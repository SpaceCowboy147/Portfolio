package com.dylanharper.navigationBar;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

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
        public ResponseEntity<InputStreamResource> downloadPDF() {
            try {
                ClassPathResource pdfFile = new ClassPathResource("//templates/DylanHarper_resume.pdf");

                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_PDF);
                headers.add("Content-Disposition", "attachment; filename= DylanHarper_resume.pdf");
                headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
                headers.add("Pragma", "no-cache");
                headers.add("Expires", "0");

                return ResponseEntity
                        .ok()
                        .headers(headers)
                        .contentLength(pdfFile.contentLength())
                        .contentType(MediaType.APPLICATION_PDF)
                        .body(new InputStreamResource(pdfFile.getInputStream()));
            } catch (IOException ex) {
                return ResponseEntity.badRequest().build();

        }
    }
}






