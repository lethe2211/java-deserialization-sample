package com.example.sample;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a target object
        Person person = new Person("John Doe");

        // Deserialize it
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(person);
        oos.flush();

        // Print a hex representation of the serialized object
        StringBuilder serializedStringBuilder = new StringBuilder();
        for (byte b : bos.toByteArray()) {
            serializedStringBuilder.append(String.format("%02X", b));
        }
        System.out.println(serializedStringBuilder.toString());
    }
}
