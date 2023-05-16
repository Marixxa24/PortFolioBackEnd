
package com.portfolio.mrs.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping ("/hola")
    public String decimeHola(){
        return "Hola Mundo ";
    }
}
