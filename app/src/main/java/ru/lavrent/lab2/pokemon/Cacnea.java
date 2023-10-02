package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.DoubleEdge;
import ru.lavrent.lab2.moves.Endeavor;

public class Cacnea extends Pokemon {
  public Cacnea(String name, int level) {
    super(name, level);
    this.setStats(50, 85, 40, 85, 40, 35);
    this.setType(Type.GRASS);
    this.setMove(new Endeavor(), new DoubleEdge());
  }
}
