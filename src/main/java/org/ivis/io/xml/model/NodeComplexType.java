package org.ivis.io.xml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nodeComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nodeComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{}graphObjectComplexType">
 *       &lt;sequence>
 *         &lt;element name="bounds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="children" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}node" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clusterIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clusterID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodeComplexType", propOrder = {
            "bounds",
            "children",
            "clusterIDs",
            "type"
})
public class NodeComplexType
    extends GraphObjectComplexType
{
    
    protected NodeComplexType.Bounds bounds;
    protected NodeComplexType.Children children;
    protected NodeComplexType.ClusterIDs clusterIDs;
    protected NodeComplexType.Type type;

    
    public NodeComplexType.Type getTypeInfo() {
        return type;
    }
    
    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link NodeComplexType.Bounds }
     *     
     */
    public NodeComplexType.Bounds getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeComplexType.Bounds }
     *     
     */
    public void setBounds(NodeComplexType.Bounds value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link NodeComplexType.Children }
     *     
     */
    public NodeComplexType.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeComplexType.Children }
     *     
     */
    public void setChildren(NodeComplexType.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the clusterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link NodeComplexType.ClusterIDs }
     *     
     */
    public NodeComplexType.ClusterIDs getClusterIDs() {
        return clusterIDs;
    }

    /**
     * Sets the value of the clusterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeComplexType.ClusterIDs }
     *     
     */
    public void setClusterIDs(NodeComplexType.ClusterIDs value) {
        this.clusterIDs = value;
    }    

    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Bounds {

        @XmlAttribute(required = true)
        protected double x;
        @XmlAttribute(required = true)
        protected double y;
        @XmlAttribute(required = true)
        protected double width;
        @XmlAttribute(required = true)
        protected double height;

        /**
         * Gets the value of the x property.
         * 
         */
        public double getX() {
            return x;
        }

        /**
         * Sets the value of the x property.
         * 
         */
        public void setX(double value) {
            this.x = value;
        }

        /**
         * Gets the value of the y property.
         * 
         */
        public double getY() {
            return y;
        }

        /**
         * Sets the value of the y property.
         * 
         */
        public void setY(double value) {
            this.y = value;
        }

        /**
         * Gets the value of the width property.
         * 
         */
        public double getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         */
        public void setWidth(double value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         * 
         */
        public double getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         */
        public void setHeight(double value) {
            this.height = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}node" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "node"
    })
    public static class Children {

        protected List<NodeComplexType> node;

        /**
         * Gets the value of the node property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the node property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NodeComplexType }
         * 
         * 
         */
        public List<NodeComplexType> getNode() {
            if (node == null) {
                node = new ArrayList<NodeComplexType>();
            }
            return this.node;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="clusterID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clusterID"
    })
    public static class ClusterIDs {

        protected List<String> clusterID;

        /**
         * Gets the value of the clusterID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clusterID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClusterID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getClusterID() {
            if (clusterID == null) {
                clusterID = new ArrayList<String>();
            }
            return this.clusterID;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Type {

        @XmlAttribute
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}