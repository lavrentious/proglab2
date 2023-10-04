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
        b.addAlly(new Vigoroth("Vladimir Putin ZV", 1));
        b.addAlly(new Electabuzz("Evgeny Prigozhin", 1));
        b.addAlly(new Aggron("Sergei Shoygu", 1));
        b.addFoe(new Cacnea("Vlaimir Zelensky", 1));
        b.addFoe(new Cacturne("Anthony Blinken", 1));
        b.addFoe(new Forretress("Joe Biden", 1));
        b.go();
    }
}
