package com.example.sslserver.controler;

import com.example.sslserver.rest.service.AcessService;
import com.example.sslserver.view.Acess;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format."),
        @ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized. "),
        @ApiResponse(code = 500, message = "The server is down. Please make sure that the Location microservice is running.")
})
public class AcessController {


    @Autowired
    private AcessService acessService;

    @GetMapping("/access")
    public String acess() {
        return   "{\"acess\":"+acessService.incrementAcess()+"}";
    }

}
