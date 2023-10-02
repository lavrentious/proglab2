package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.Charge;
import ru.lavrent.lab2.moves.DoubleEdge;
import ru.lavrent.lab2.moves.Endeavor;

public class Cacturne extends Pokemon {
  public Cacturne(String name, int level) {
    super(name, level);
    this.setStats(70, 115, 60, 115, 60, 55);
    this.setType(Type.GRASS, Type.DARK);
    this.setMove(new Endeavor(), new DoubleEdge(), new Charge());
  }
}
