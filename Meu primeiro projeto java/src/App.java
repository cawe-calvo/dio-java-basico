public class App {
public static void main(String[] args) {
    String primeiroNome = "Cawe";
    String segundoNome = "Calvo";
    
    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat("").concat(segundoNome);
}

}
