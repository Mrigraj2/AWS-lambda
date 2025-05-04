package org.lamda.helloworld;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class HelloWorld
{
    public String handler(){

        String LOG_FILE = "/mnt/logs/lambda_logs.txt";
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write("Lambda executed");
        } catch (IOException e) {
            e.printStackTrace();
        }



        return "Hello world";
    }
}
