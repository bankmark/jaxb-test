package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RandomDouble extends MinMaxGenerator<Double> {

  public RandomDouble() {
    this(Double.MIN_VALUE, Double.MAX_VALUE);
  }

  public RandomDouble(Double min, Double max) {
    super(min, max);
  }

  @Override
  public Double getSampleAt(long index) {
    return null;
  }
}
