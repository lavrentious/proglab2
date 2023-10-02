package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.LightScreen;
import ru.lavrent.lab2.moves.ShadowPunch;
import ru.lavrent.lab2.moves.ThunderShock;

public class Electabuzz extends Pokemon {
  public Electabuzz(String name, int level) {
    super(name, level);
    this.setStats(65, 83, 57, 95, 85, 105);
    this.setType(Type.ELECTRIC);
    this.setMove(new ThunderShock(), new LightScreen(), new ShadowPunch());
  }
}