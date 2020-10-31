package edu.miu.groupx.security.securityservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping({"/", "/home"})
    String home() {
        return "{home doesn't need authentication}";
    }
}
