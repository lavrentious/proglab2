package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {
  public SwordsDance() {
    super(Type.NORMAL, 0, 100);
  }

  @Override
  protected void applySelfEffects(Pokemon pokemon) {
    super.applyOppEffects(pokemon);
    pokemon.setMod(Stat.ATTACK, 2);
  }

  @Override
  protected String describe() {
    return "uses Sword Dance";
  }
}
