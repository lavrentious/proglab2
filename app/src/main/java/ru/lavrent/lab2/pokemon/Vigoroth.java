package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.Growl;
import ru.lavrent.lab2.moves.IcePunch;
import ru.lavrent.lab2.moves.SwordsDance;

public class Vigoroth extends Pokemon {
  public Vigoroth(String name, int level) {
    super(name, level);
    this.setStats(80, 80, 80, 55, 55, 90);
    this.setType(Type.NORMAL);
    this.setMove(new Growl(), new SwordsDance(), new IcePunch(), new SwordsDance());
  }
}