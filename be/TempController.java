package com.example.demo;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TempController {
    @GetMapping("/api/1")
    public void api1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("API 1");
        Cookie cookie = new Cookie("accessToken", "FUCK");
        cookie.setPath("/");
        cookie.setSecure(false);

        response.addCookie(cookie);
        response.setStatus(200);
    }

    @GetMapping("/api/2")
    public void api2(){
        System.out.println("2222");
    }
}
