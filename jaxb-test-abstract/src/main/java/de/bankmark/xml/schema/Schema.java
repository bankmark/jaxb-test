package de.bankmark.xml.schema;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.Collections;

@XmlRootElement
public class Schema {

  @XmlAttribute
  private String name;

  @XmlElement(name = "table")
  private Collection<Table> tables;

  public Schema() {
    this.tables = Collections.emptyList();
  }

  public Schema(Collection<Table> tables) {
    this.tables = tables;
  }
}
