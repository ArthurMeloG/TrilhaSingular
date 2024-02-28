import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Format de strings
        String meuNome = "Arthur de Melo Garcia";
        System.out.println(meuNome.trim());
        System.out.println(meuNome.toLowerCase());
        System.out.println(meuNome.toUpperCase());
        System.out.println(meuNome.substring(2));
        System.out.println(meuNome.substring(2, 6));

        System.out.println(Arrays.toString(meuNome.split("Melo")));
    }
}
