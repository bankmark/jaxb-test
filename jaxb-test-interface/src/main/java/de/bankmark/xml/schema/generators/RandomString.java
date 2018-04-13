package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RandomString implements Generator<String> {

  @Override
  public String getSampleAt(long index) {
    return null;
  }
}
