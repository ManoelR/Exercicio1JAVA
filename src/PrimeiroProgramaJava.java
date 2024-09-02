public class PrimeiroProgramaJava {

    public static void main(String[] agrs) {
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em Dev");
        }else if (ambiente.equalsIgnoreCase("TESTE")) {
            System.out.print("Ambiente de Teste");
        }else {
            System.out.print(ambiente);
        }
    }
}
