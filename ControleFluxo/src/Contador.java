import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
        terminal.nextLine();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        try
        {
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e)
        {
            System.err.println(e);
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
        if (parametroUm > parametroDois)
        {
            throw new ParametrosInvalidosException("primeiro parametro eh maior que o segundo");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0 ; i < contagem ;i++)
        {
            System.out.println("Imprimindo o numero "+ (i+1));
        }

    }
}
