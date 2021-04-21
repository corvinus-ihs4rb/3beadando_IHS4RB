package hu.cegnev.beadando;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @ResponseBody
    @GetMapping(path ="/harmadik")
    public SimpleResponse getMessage(@RequestParam(required = false) String name) {
        String uzenet;
        if (name != null) uzenet= String.format("Hello %s!", name ) ;
        else uzenet= "Hello Felhasznalo!";
        return SimpleResponse.builder().content(uzenet).build();
    }
}