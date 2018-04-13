package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlElement;

public abstract class MinMaxGenerator<T> extends Generator<T> {

  @XmlElement
  private T min;

  @XmlElement
  private T max;

  public MinMaxGenerator() {
    this(null, null);
  }

  public MinMaxGenerator(T min, T max) {
    this.min = min;
    this.max = max;
  }
}
