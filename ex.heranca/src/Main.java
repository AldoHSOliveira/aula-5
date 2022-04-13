
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> Pessoas = new ArrayList<>();

        Pessoas.add(new PessoaFisica("Rafael", "1234", "Teste@teste1", "123"));
        Pessoas.add(new PessoaJuridica("Marcini", "\n4321", "\nTeste@teste2", "\n321"));

        Pessoas.forEach((x) -> {

            if (x instanceof PessoaFisica) {
                System.out.println(((PessoaFisica) x).imprimir());
            } else {
                System.out.println(((PessoaJuridica) x).imprimir());

            }

        });
        
    

}}
