package pl.javagda25.spring.students.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo/")
public class IndexController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String wyswietlMojaStroneHelloWorldTySpringu() {
        return "strona-hello";
    }

    @GetMapping("/hello")
    public String wyswietlHello() {
        return "strona-hello";
    }

    @GetMapping("/helloTo") //helloTo?imie=Pawel
    public String wyswietlHelloTo(Model model,              //jeśli required = false to nie trzeba wpisywać parapetru "imie"
                                  @RequestParam(name = "imie", required = false) String parametrImie) {
        model.addAttribute("atrybutImie", parametrImie);
        return "strona-hello-to";
    }

    @GetMapping("/helloMyBaby/{babyName}")
    public String wyswietlHelloTo2(Model model,
                                   @PathVariable(name = "babyName", required = false) String variable) {
        model.addAttribute("atrybutImie", variable);
        return "strona-hello-to";
    }
}
