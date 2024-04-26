package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsTracker() {
        return """
                <h1>Skills</h1>
                    <h2>Programming Skills</h2>
                    <ol>
                        <li>python</li>
                        <li>Java</li>
                        <li>Javascript</li>
                    </ol>""";
    }

    @GetMapping("form")
    public String skillsForm() {
        return """
                 <form action = '/formcomplete' method = 'post'>
                 <div>
                 <label>Name</label>
                 <input name="name"/>
                 </div>
                 <div>
                 <label>1st Favorite Language:</label>
                     <select name="language1">
                         <option value="Python">Python</option>
                         <option value="Javascript">Javascript</option>
                         <option value="Java">Java</option>
                     </select>
                     </div>
                     <div>
                <label for="languageTwo">2nd Favorite Language:</label>
                     <select name="language2">
                         <option value="Python">Python</option>
                         <option value="Javascript">Javascript</option>
                         <option value="Java">Java</option>
                     </select>
                     </div>
                     <div>
                     <label for="languageThree">3rd Favorite Language:</label>
                     <select  name="language3">
                         <option value="Python">Python</option>
                         <option value="Javascript">Javascript</option>
                         <option value="Java">Java</option>
                     </select>
                     </div>
                     <input type = 'submit' value = 'Submit!' >
                     </form>
                     """;
    }

    @RequestMapping(value = "formcomplete", method = RequestMethod.POST)
    @ResponseBody
    public String postForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<head>\n" +
                "<style>\n" +
                "table {\n" +
                "  font-family: arial, sans-serif;\n" +
                "  border-collapse: collapse;\n" +
                "  width: 100%;\n" +
                "}\n" +
                "\n" +
                "td, th {\n" +
                "  border: 1px solid #dddddd;\n" +
                "  text-align: left;\n" +
                "  padding: 8px;\n" +
                "}\n" +
                "\n" +
                "tr:nth-child(even) {\n" +
                "  background-color: #dddddd;\n" +
                "}\n" +
                "</style>\n" +
                "</head>" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th>1st Favorite</th>\n" +
                "        <th>2nd Favorite</th>\n" +
                "        <th>3rd Favorite</th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>"+language1+"</td>\n" +
                "        <td>"+language2+"</td>\n" +
                "        <td>"+language3+"</td>\n" +
                "    </tr>\n" +
                "</table>";


//                "<h1>" + name + "</h1>" +
//                "<ol>" +
//                "<li>" + language1 + "</li>" +
//                "<li>" + language2 + "</li>" +
//                "<li>" + language3 + "</li>" +
//                "</ol>";


    }


}
