package de.varitaxx.rpg.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data //Enthält u.a. Getter und Setter
@NoArgsConstructor //Parameterloser Konstruktor
@AllArgsConstructor //Konstruktor mit allen Parametern
@ToString
@EqualsAndHashCode
@Builder
@Entity
public class Charakter implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @Column(length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    private int age;

    @Column
    private double height;

    @Enumerated(EnumType.STRING)
    private Klasse klasse;

    @Enumerated(EnumType.STRING)
    private Race race;

    @Enumerated(EnumType.STRING)
    private Rank rank;

    @Column
    private int strength;

    @Column
    private int dexterity;

    @Column
    private int power;

    @Column
    private int stamina;

    @Column
    private int mage_power;

    @Column
    private int hitpoints;

    @Column
    private int exp_points;







}
