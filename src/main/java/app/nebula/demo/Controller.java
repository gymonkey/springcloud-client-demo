package app.nebula.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Client client;

    @GetMapping("/")
    public String root(){
        return "ok";
    }

    @GetMapping("/invoke")
    public String echo() {
        System.out.println("invoke");
        return client.echo("nebula");
    }

}
