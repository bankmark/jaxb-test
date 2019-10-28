package de.bankmark.xml.schema.generators;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MetaGenerator implements Generator<Long> {

    @XmlAnyElement
    private Generator<Long> subGenerator;

    private MetaGenerator() {
        this.subGenerator = null;
    }

    public MetaGenerator(Generator<Long> subGenerator) {
        this.subGenerator = subGenerator;
    }


    @Override
    public Long getSampleAt(long index) {
        long sub = subGenerator.getSampleAt(index);
        return sub + 1L;
    }
}
