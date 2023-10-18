package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.Charge;

public class Cacturne extends Cacnea {
  public Cacturne(String name, int level) {
    super(name, level);
    this.setStats(70, 115, 60, 115, 60, 55);
    this.setType(Type.GRASS, Type.DARK);
    this.addMove(new Charge());
  }
}
