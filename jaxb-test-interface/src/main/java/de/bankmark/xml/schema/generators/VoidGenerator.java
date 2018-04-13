package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VoidGenerator implements Generator<Void> {


  public VoidGenerator() {
  }

  @Override
  public Void getSampleAt(long index) {
    return null;
  }
}
