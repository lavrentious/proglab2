package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.Attract;
import ru.lavrent.lab2.moves.Charge;
import ru.lavrent.lab2.moves.DoubleEdge;
import ru.lavrent.lab2.moves.Endeavor;

public class  Forretress extends Pokemon {
  public Forretress(String name, int level) {
    super(name, level);
    this.setStats(75, 90, 140, 60, 60, 40);
    this.setType(Type.GRASS, Type.DARK);
    this.setMove(new Endeavor(), new DoubleEdge(), new Charge(), new Attract());
  }
}
