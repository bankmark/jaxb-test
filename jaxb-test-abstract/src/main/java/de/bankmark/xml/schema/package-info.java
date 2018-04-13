/**
 * This package contains all schema elements that are needed to specify a PDGF schema.
 */
@XmlSchema(
        elementFormDefault=XmlNsForm.UNQUALIFIED,
        attributeFormDefault=XmlNsForm.UNQUALIFIED,
        xmlns = {
                @XmlNs(namespaceURI = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
                @XmlNs(namespaceURI = "http://www.w3.org/2001/XMLSchema", prefix = "xs")
        })
package de.bankmark.xml.schema;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;