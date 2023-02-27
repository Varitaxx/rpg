package de.varitaxx.rpg;

import de.varitaxx.rpg.model.*;
import de.varitaxx.rpg.repository.CharakterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RpgApplication implements CommandLineRunner {

    @Autowired
    private CharakterRepository charRepo;

    public static void main(String[] args) {
        SpringApplication.run(RpgApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Charakter> charakters = new ArrayList<>();
        Charakter c1 = new Charakter();
        c1.setName("Ragnar");
        c1.setGender(Gender.MAENNLICH);
        c1.setAge(30);
        c1.setHeight(1.88);
        c1.setKlasse(Klasse.KRIEGER);
        c1.setRace(Race.MENSCH);
        c1.setRank(Rank.ERFAHRENER);
        c1.setStrength(5);
        c1.setDexterity(7);
        c1.setPower(11);
        c1.setStamina(22);
        c1.setMage_power(0);
        c1.setHitpoints(200);
        c1.setExp_points(3);

        Charakter c2 = new Charakter();
        c2.setName("Thorin");
        c2.setGender(Gender.MAENNLICH);
        c2.setAge(94);
        c2.setHeight(1.03);
        c2.setKlasse(Klasse.KRIEGER);
        c2.setRace(Race.ZWERG);
        c2.setRank(Rank.MEISTER);
        c2.setStrength(25);
        c2.setDexterity(17);
        c2.setPower(31);
        c2.setStamina(64);
        c2.setMage_power(0);
        c2.setHitpoints(1200);
        c2.setExp_points(33);

        charakters.add(c1);
        charakters.add(c2);

        charRepo.saveAll(charakters);


    }
}
