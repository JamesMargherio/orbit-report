package org.launchcode.Hello.Spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloContoller {

    // Handles request at path /hello or /goodbye
    @GetMapping("hello")
    public String hello() {
        return "Hello, Spring!";
    }

    // Handles requests of the form /hey?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hey")
    public String helloWithQuery(@RequestParam String name) {
        return "Hello " + name + "!";
    }

//    @GetMapping("hey")
//    @ResponseBody
//    public String helloWithQuery(@RequestParam String name){
//        if (name == true) {
//            return "Venus is rocky.";
//        } else {
//            return "Venus is gaseous.";
//        }
//    }

    // Handles requests of the form /hey/LaunchCode
    @GetMapping("hey/{name}")
    public String helloWithPath(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hey' method = 'post'>" + // Submit request to /hey
                "<input type = 'text' name = 'name'>" +
                "<input type = 'submit' value = 'Greet Me'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping (method = RequestMethod.GET, value = "exercise")
    public String helloLanguage() {
        return  "<html>" +
                    "<body>" +
                        "<form action = 'exerciseGreet' method = 'post'>" + // Submit request to /hey
                            "<input type = 'text' name = 'name'>" +
                            "<select name = 'language' id = 'chosenLanguage'>" +
                                "<option value = 'english'> English </option>" +
                                "<option value = 'irish'> Irish </option>" +
                                "<option value = 'korean'> Korean </option>" +
                                "<option value = 'arabic'> Arabic </option>" +
                                "<option value = 'lojban'> Lojban </option>" +
                            "</select>" +
                            "<input type = 'submit' value = 'Greet Me'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping (method = RequestMethod.POST, value = "exerciseGreet")
    public String createMessage(@RequestParam String name, @RequestParam String chosenLanguage) {
        if (name == null) {
            name = "World";
        }
        String greeting = "";

        if (chosenLanguage.equals("english")) {
            greeting = "Hello, ";
        }
        if (chosenLanguage.equals("irish")) {
            greeting = "Dia dhuit, ";
        }
        if (chosenLanguage.equals("korean")) {
            greeting = "An-nyeong, ";
        }
        if (chosenLanguage.equals("arabic")) {
            greeting = "Marhaban, ";
        }
        if (chosenLanguage.equals("lojban")) {
            greeting = "Coi, ";
        }

        return greeting + name;
    }

}
