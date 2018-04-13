module de.bankmark.xml.jaxb.test {
  requires java.xml.bind;

  exports de.bankmark.xml.schema;
  opens de.bankmark.xml.schema;
  opens de.bankmark.xml.schema.generators;
}