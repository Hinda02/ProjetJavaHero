package main;

import java.io.*;

public class Serializer {

    /**
     * Allows the serialization, used to save a game
     * @param object
     * @param filePath
     * @throws IOException
     */
    public static void serialize(Object object, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(object);
        }
    }

    /**
     * Used to load a saved game
     * @param filePath
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object deserialize(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return ois.readObject();
        }
    }
}

