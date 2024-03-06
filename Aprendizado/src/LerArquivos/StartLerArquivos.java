package LerArquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartLerArquivos {
    private static String path = "C:\\Users\\ArthurdeMeloGarcia\\Desktop\\TrilhaSingular\\Aprendizado\\src\\texto.txt";
    public static void start() {
        File file = new File(path);
        Scanner sc = null;

        //scanner pode gerar ume exceção
//        try {
//            sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            // sera fechado independente se deu erro ou não
//            if(sc != null) {
//                sc.close();
//            }
//        }

        // stream de leitura de caracteres a partir de arquivos
        FileReader fr  = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error de leitura do arquivo" + e.getMessage());
        }
        finally {
            try {
                if(br != null) {
                    br.close();
                }
                if(fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                System.out.println( e.getMessage());
            }
        }

        new BlocoTryWithResources(path);
        new WriterArquivos(path);
        // bufferReader => a partir do FileReader porem mais rapido

        File pathFile = new File("C:\\Users\\ArthurdeMeloGarcia\\Desktop\\TrilhaSingular");
        File[] folders = pathFile.listFiles(File::isDirectory);

        List<String> a = new ArrayList<>();
        a.removeIf()
        for(File folder: folders) {
            System.out.println(folder);
        }
    }

}
