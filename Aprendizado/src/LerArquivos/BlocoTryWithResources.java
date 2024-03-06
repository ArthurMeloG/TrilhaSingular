package LerArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWithResources {

    // É um bloco que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
    public BlocoTryWithResources(String path) {
        //declarado no próprio try
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error de leitura do arquivo" + e.getMessage());
        }
    }
}
