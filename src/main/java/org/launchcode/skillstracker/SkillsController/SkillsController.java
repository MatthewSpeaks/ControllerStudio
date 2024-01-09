package org.launchcode.skillstracker.SkillsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping
    public String skillsTracker() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @ResponseBody
    @GetMapping("form") //localhost:8080/form
    public String skillsForm() {
        return "<form action='form' method='post'>" +
                "<label for='name'>Your Name:</label><br>" +
                "<input type='text' id='name' name='aName' value='your name'><br>" +
                "<label for 'aFavLang'>My Second Favorite Coding Language</label><br>" +
                "<select name='aFavLang' id='aFavLang'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for 'aTwoFavLang'>My Second Favorite Coding Language</label><br>" +
                "<select name='aTwoFavLang' id='aTwoFavLang'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='aThreeFavLang'>My Third Favorite Coding Language</label><br>" +
                "<select name='aThreeFavLang' id='aThreeFavLang'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<br><input type='submit' value='Submit'>" +
                "</form>";
    };

    @ResponseBody
    @PostMapping("form")
    public String skillsFormDisplay(@RequestParam String aName, @RequestParam String aFavLang, @RequestParam String aTwoFavLang, @RequestParam String aThreeFavLang) {
       return
               "<h4>" + aName + "</h4>" +
               "<ol>" +
                "<li>My Favorite Coding Language: " + aFavLang + "</li>" +
                "<li>My Second Favorite Coding Language: "+ aTwoFavLang + "</li>" +
                "<li>My Third Favorite Coding Language: " + aThreeFavLang + "</li>" +
               "</ol>";
    }
}
