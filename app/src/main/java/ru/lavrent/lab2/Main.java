package ru.lavrent.lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.lavrent.lab2.pokemon.Aggron;
import ru.lavrent.lab2.pokemon.Cacnea;
import ru.lavrent.lab2.pokemon.Cacturne;
import ru.lavrent.lab2.pokemon.Electabuzz;
import ru.lavrent.lab2.pokemon.Forretress;
import ru.lavrent.lab2.pokemon.Vigoroth;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Vigoroth("Nigger", 1));
        b.addAlly(new Electabuzz("Faggot", 1));
        b.addAlly(new Aggron("Gay", 1));
        b.addFoe(new Cacnea("Pidor", 1));
        b.addFoe(new Cacturne("Negro", 1));
        b.addFoe(new Forretress("Joe Biden", 1));
        b.go();
    }
}
