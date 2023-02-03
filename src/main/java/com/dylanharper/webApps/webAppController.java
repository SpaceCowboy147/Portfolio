package com.dylanharper.webApps;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;

@Controller
public class webAppController {


        @GetMapping("/Calculator.jar")
        public ResponseEntity<InputStreamResource> downloadJar() {
            try {
                ClassPathResource jarFile = new ClassPathResource("jars/sample.jar");

                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                headers.add("Content-Disposition", "attachment; filename=calculator.jar");
                headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
                headers.add("Pragma", "no-cache");
                headers.add("Expires", "0");

                return ResponseEntity
                        .ok()
                        .headers(headers)
                        .contentLength(jarFile.contentLength())
                        .contentType(MediaType.APPLICATION_OCTET_STREAM)
                        .body(new InputStreamResource(jarFile.getInputStream()));
            } catch (IOException ex) {
                return ResponseEntity.badRequest().build();
            }
        }




    @GetMapping("/login")
    public void startMusicParadise(HttpServletRequest request, HttpServletResponse response) throws IOException {

        File mpJarPath = new File("C:\\Users\\dylan\\Documents\\GitHub\\portfolio\\src\\main\\resources\\templates\\shop-0.0.1-SNAPSHOT.jar");
        if (mpJarPath.exists()) {

            //Files.e(mpJarPath.toPath(), response.getOutputStream());
            Runtime.getRuntime().exec("java -jar ./shop-0.0.1-SNAPSHOT.jar");
        }

    }
}