package com.dylanharper.webApps;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Controller
public class webAppController {

    @GetMapping("/templates/Calculator.jar")
    public void doGet() throws IOException {
        File jarPath = new File("C:\\Users\\dylan\\Documents\\GitHub\\portfolio\\src\\main\\resources\\templates\\Calculator.jar");
        Runtime.getRuntime().exec("java -jar ./Calculator.jar");
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