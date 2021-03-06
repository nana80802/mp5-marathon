package at.refugeescode.mp5marathon.endpoint;

import at.refugeescode.mp5marathon.model.Runner;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/runners")
public class Runners {
    public static List<Runner> runners= new ArrayList<>();
    @GetMapping
    List<Runner> displayRunners(){
        return runners;
    }

    @PostMapping
    List<Runner> addRunner(@RequestBody Runner runner){
        runners.add(runner);
        return runners;
    }
}
