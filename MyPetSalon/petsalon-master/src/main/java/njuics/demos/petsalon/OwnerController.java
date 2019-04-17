package njuics.demos.petsalon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path="/demo")
public class OwnerController {
    @Autowired
    private OwnerRepository ownerRepository;
    @GetMapping(path="/add")
    public @ResponseBody
    String addOwner(@RequestParam String name){
        Owner n=new Owner();
        n.setName(name);
        ownerRepository.save(n);
        return "Saved";
    }
    @GetMapping(path="/delete")
    public @ResponseBody String deleteOwner(@RequestParam Long index){
        ownerRepository.deleteById(index);
        return "delete succeed";
    }
    @GetMapping(path="/edit")
    public @ResponseBody String editOwner(@RequestParam String name,@RequestParam Long id){
        Owner n=ownerRepository.getOne(id);
        n.setName(name);
        ownerRepository.save(n);
        return "succeed";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    @GetMapping(path="/Get")
    public @ResponseBody
    Optional<Owner> getOwners(@RequestParam Long id) {
        return ownerRepository.findById(id);
    }
}
