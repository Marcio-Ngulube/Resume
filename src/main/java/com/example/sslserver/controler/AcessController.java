package com.example.sslserver.controler;

import com.example.sslserver.rest.service.AcessService;
import com.example.sslserver.view.Acess;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format."),
        @ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized. "),
        @ApiResponse(code = 500, message = "The server is down. Please make sure that the Location microservice is running.")
})
public class AcessController {

    private AcessService acessService;

    @Autowired
    public void setAcessService(AcessService acessService) {
        this.acessService = acessService;
    }

    @GetMapping("/acessAll")
    public ResponseEntity<List<Acess>> retrieveMorador() {
        List<Acess> list = acessService.retrieveAcess();
        return new ResponseEntity<List<Acess>>(list, HttpStatus.OK);
    }

    @GetMapping("/acess")
    public ResponseEntity<Integer> retrieveAcess() {
         int list = acessService.incrementAcess();

        return new ResponseEntity<Integer>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/access", method = RequestMethod.GET,
            produces = { "application/json" }
    )
    public String acess() {

        String string = "{\"acess\":"+acessService.incrementAcess()+"}";

        return string;
    }



}
