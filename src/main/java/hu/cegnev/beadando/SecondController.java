package hu.cegnev.beadando;

import org.springframework.web.bind.annotation.*;

@RestController
public class SecondController {

    @PostMapping(path="/megfordit")
    public SimpleResponse reverse(@RequestParam(required = false) String text) {
        String uzenet;
        if (text != null) uzenet= megfordit(text) ;
        else uzenet= "ttala af a amlA";
        return SimpleResponse.builder().content(uzenet).build();
    }

    public String megfordit(String uzenet) {
        StringBuffer sb = new StringBuffer(uzenet);
        return sb.reverse().toString();
    }
}