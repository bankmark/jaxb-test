package de.bankmark.xml.schema;

import de.bankmark.xml.schema.generators.Generator;
import de.bankmark.xml.schema.generators.VoidGenerator;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "field")
public class Field<T> {

  @XmlAttribute
  private String name;
  @XmlAttribute
  private Class type;

  @XmlAnyElement
  private Generator<T> generator;

  public Field() {
    new Field<>("UNNAMED-FIELD", Object.class, new VoidGenerator());
  }

  public Field(String name, Class type, Generator<T> generator) {
    this.name = name;
    this.type = type;
    this.generator = generator;
  }
}
