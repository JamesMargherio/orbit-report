package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping (method = RequestMethod.GET)
    public String index() {
        return  "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping (method = RequestMethod.GET, value = "form")
    public String form() {
        return  "<html>" +
                    "<body>" +
                        "<form action = 'formResponse' method = 'post'>" +
                            "<div>" +
                                "Name:<br>" +
                                "<input type = 'text' name = 'name' placeholder = 'Name'>" +
                            "</div>" +
                            "<br>" +
                            "<div>" +
                                "My favorite language:<br>" +
                                "<select name = 'firstLanguage'>" +
                                    "<option value = 'Java'> Java </option>" +
                                    "<option value = 'Javascript'> JavaScript </option>" +
                                    "<option value = 'Python'> Python </option>" +
                                "</select>" +
                            "</div>" +
                            "<br>" +
                            "<div>" +
                                "My second favorite language:<br>" +
                                "<select name = 'secondLanguage'>" +
                                    "<option value = 'Java'> Java </option>" +
                                    "<option value = 'Javascript'> JavaScript </option>" +
                                    "<option value = 'Python'> Python </option>" +
                                "</select>" +
                            "</div>" +
                            "<br>" +
                            "<div>" +
                                "My third favorite language:<br>" +
                                "<select name = 'thirdLanguage'>" +
                                    "<option value = 'Java'> Java </option>" +
                                    "<option value = 'Javascript'> JavaScript </option>" +
                                    "<option value = 'Python'> Python </option>" +
                                "</select>" +
                            "</div>" +
                            "<br>" +
                            "<div>" +
                                "<input type = 'submit' value = 'SUBMIT'>" +
                            "</div>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping (method = RequestMethod.POST, value = "formResponse")
    public String formResponse(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return  "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + firstLanguage + "</li>" +
                            "<li>" + secondLanguage + "</li>" +
                            "<li>" + thirdLanguage + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
}
