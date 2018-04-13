package de.bankmark.xml.schema;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.Collections;

@XmlRootElement
@XmlAccessorType()
public class Table {

  @XmlAttribute(required = true)
  private String name;

  @XmlElementRef
  private Collection<Field> fields;

  public Table() {
    this.name = "UNNAMED";
    this.fields = Collections.emptyList();
  }

  public Table(String name, Collection<Field> fields) {
    this.name = name;
    this.fields = fields;
  }
}
