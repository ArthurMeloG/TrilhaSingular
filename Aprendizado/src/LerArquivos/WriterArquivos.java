package LerArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterArquivos {

    // new FileWriter cria ou recria, para acrescentar precisa colocar um argumento true no construtor da classe

    public WriterArquivos(String path) {
        String[] lines = new String[] {
                "Good morning",
                "Good afternoon",
                "Good night"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
