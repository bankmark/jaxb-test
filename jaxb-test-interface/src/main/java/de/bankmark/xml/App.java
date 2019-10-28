package de.bankmark.xml;

import de.bankmark.xml.schema.Field;
import de.bankmark.xml.schema.Schema;
import de.bankmark.xml.schema.Table;
import de.bankmark.xml.schema.generators.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.List;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    var aF = new Field<>("a", String.class, new RandomString());
    var bF = new Field<>("b", Long.class, new RandomLong());

    var rT = new Table("r", List.of(aF, bF));

    var xF = new Field<>("x", Integer.class, new RandomLong());
    var yF = new Field<>("y", Double.class, new RandomDouble(0.0D, 1.0D));
    var zF = new Field<>("z", Long.class, new MetaGenerator(new RandomLong(1, 10)));

    var sT = new Table("s", List.of(xF, yF, zF));

    var schema = new Schema(List.of(rT, sT));

    var genarator = null;

    for i : List.of(1, 2) {

      generateDate(schema, generator, i)
    }


    try {
      Class<?>[] annotadedClasses = {
              RandomDouble.class, RandomLong.class, RandomString.class, VoidGenerator.class, MetaGenerator.class,
              Schema.class
      };

      JAXBContext jaxbContext = JAXBContext.newInstance(annotadedClasses); //, Table.class, Field.class, Generator.class);
      Marshaller marshaller = jaxbContext.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

      marshaller.marshal(schema, System.out);
    } catch (JAXBException e) {
      e.printStackTrace();
    }
  }
}
