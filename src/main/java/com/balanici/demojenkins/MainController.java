package com.balanici.demojenkins;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/method-1")
    public ResponseEntity<ResponseModel> getMethod1() {
        ResponseModel responseModel = new ResponseModel("Helo from method 1", 200);

        return new ResponseEntity<>(responseModel, HttpStatus.OK);
    }
}
