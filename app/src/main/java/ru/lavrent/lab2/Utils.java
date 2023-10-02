package ru.lavrent.lab2;

public abstract class Utils {
  public static int complexProbability(int[] numbers, double[] probabilities) {
    if (numbers.length != probabilities.length) {
      throw new IllegalArgumentException("Arrays must have the same length");
    }

    double[] pProb = new double[probabilities.length];
    pProb[0] = probabilities[0];

    for (int i = 1; i < probabilities.length; i++) {
      pProb[i] = pProb[i - 1] + probabilities[i];
    }

    double randomValue = Math.random();

    for (int i = 0; i < pProb.length; i++) {
      if (randomValue <= pProb[i]) {
        return numbers[i];
      }
    }

    throw new IllegalStateException("Could not select a number based on probabilities");
  }
}
