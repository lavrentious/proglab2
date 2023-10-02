package ru.lavrent.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.moves.LightScreen;
import ru.lavrent.lab2.moves.MudSlap;
import ru.lavrent.lab2.moves.ShadowPunch;
import ru.lavrent.lab2.moves.ThunderShock;

public class Aggron extends Pokemon {
  public Aggron(String name, int level) {
    super(name, level);
    this.setStats(70, 110, 180, 60, 60, 50);
    this.setType(Type.STEEL, Type.ROCK);
    this.setMove(new ThunderShock(), new LightScreen(), new ShadowPunch(), new MudSlap());
  }
}
