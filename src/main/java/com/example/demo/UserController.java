@RestController
public class UserController {
    @GetMapping
    public String demo() {
        return "Hello World";
    }
}