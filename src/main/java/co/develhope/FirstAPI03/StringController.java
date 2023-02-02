package co.develhope.FirstAPI03;

import org.springframework.web.bind.annotation.*;

/**
 * @author Drumstyle92
 * Class that contains the path and controller for Spring Boot.
 */
@RestController
@RequestMapping("/strings")
public class StringController {
    /**
     * @param first the first String we insert into the get.
     * @param second the second String that we insert in the get.
     * @return Returns either the first string or the union of the first and second.
     * Get method which receives either one or two strings.
     * Through an if the answer will be either only the first string or the concatenation of the two.
     */
    @GetMapping("/")
    public String getString(@RequestParam String first,@RequestParam(required = false) String second){

        if(second == null){

            return first;

        }

        return first + second;

    }

}
