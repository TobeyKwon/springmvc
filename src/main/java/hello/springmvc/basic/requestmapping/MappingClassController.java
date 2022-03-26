package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String users() {
        return "get users";
    }

    @PostMapping
    public String addUsers() {
        return "post user";
    }

    @GetMapping("{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userID=" + userId;
    }

    @PatchMapping("{userId}")
    public String patchUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }
}
