package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({RandomDouble.class, RandomLong.class, RandomString.class, VoidGenerator.class})
public abstract class Generator<T> {

  public abstract T getSampleAt(long index);

}
