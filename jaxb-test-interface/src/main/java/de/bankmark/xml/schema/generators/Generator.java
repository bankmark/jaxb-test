package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({RandomDouble.class, RandomLong.class, RandomString.class, VoidGenerator.class})
public interface Generator<T> {

  T getSampleAt(long index);

}
