package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RandomLong extends MinMaxGenerator<Long> {

  public RandomLong() {
    this(Long.MIN_VALUE, Long.MAX_VALUE);
  }

  public RandomLong(long min, long max) {
    super(min, max);
  }


  @Override
  public Long getSampleAt(long index) {
    return 0L;
  }
}
