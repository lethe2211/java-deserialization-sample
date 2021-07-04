package com.example.sample;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

    // Version ID of the serialized schema
    private static final long serialVersionUID = 199035831519635924L;

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Define how to deserialize the object.
     *
     * @param stream
     * @throws Exception
     */
    private void readObject(ObjectInputStream stream) throws Exception {
        // Default deserialization behavior
        stream.defaultReadObject();
    }

    /**
     * Define how to serialize the object.
     *
     * @param stream
     * @throws Exception
     */
    private void writeObject(ObjectOutputStream stream) throws Exception {
        // Default serialization behavior
        stream.defaultWriteObject();
    }
}
