@RestController
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Docker!";
    }
}
