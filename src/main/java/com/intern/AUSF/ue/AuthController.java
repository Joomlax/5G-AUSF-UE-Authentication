package com.intern.AUSF.ue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="nausf-auth/v1/ue-authentications")
public class AuthController {


    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public List<Auth> getAuth() {
        return authService.getAuth();
    }

    @PostMapping()
    public ResponseEntity<String> addAuth(@RequestBody Auth auth){
        authService.addAuth(auth);

        return ResponseEntity.status(201).body("Tmp response");

    }

}
