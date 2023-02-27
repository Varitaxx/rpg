package de.varitaxx.rpg.controller;

import de.varitaxx.rpg.model.Charakter;
import de.varitaxx.rpg.repository.CharakterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rpg/chars")
public class CharakterController {

    @Autowired
    private CharakterRepository charRepo;

    @GetMapping("")
    public List<Charakter> index(){
        return charRepo.findAll();
    }

    @GetMapping("{id}")
    public Optional<Charakter> byId(@PathVariable("id")Long id){
        return charRepo.findById(id);
    }

    @PostMapping("")//INSERT
    public Charakter insert(@RequestBody Charakter charakter){
        return charRepo.save(charakter);
    }

    @PutMapping("{id}")
    public Charakter update(@PathVariable("id")Long id, Charakter charakter){
        Optional<Charakter> opt = charRepo.findById(id);

        if(opt.isPresent()){
            Charakter c = opt.get();
            c.setName(charakter.getName());
            c.setAge(charakter.getAge());
            c.setGender(charakter.getGender());
            c.setHeight(charakter.getHeight());
            c.setRace(charakter.getRace());
            c.setKlasse(charakter.getKlasse());
            c.setRank(charakter.getRank());
            c.setDexterity(charakter.getDexterity());
            c.setExp_points(charakter.getExp_points());
            c.setHitpoints(charakter.getHitpoints());
            c.setPower(charakter.getPower());
            c.setMage_power(charakter.getMage_power());
            c.setStamina(charakter.getStamina());
            c.setStrength(charakter.getStrength());

            return charRepo.save(c);
        }
        return new Charakter();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Long id){
        charRepo.deleteById(id);
    }



}
