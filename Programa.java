import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Scanner scContrato = new Scanner(System.in);
/*--------------------Classes---------------------------------------------- */

        Contrato contrato = new Contrato();
        CadastroPlano cadastroPlano = new CadastroPlano();
        PaginaInicial paginaInicial = new PaginaInicial();

/*------------------------------------------------------------------------ */


/*--------------------Contrato---------------------------------------------- */

        System.out.println("Digite Contrato:");
        contrato.abaContrato = scContrato.nextLine();

        System.out.println("DigiteBeneficiario");
        contrato.abaBeneficiario = scContrato.nextLine();

        System.out.println("Digite Anexo");
        contrato.abaAnexo = scContrato.nextLine();

        System.out.println("Digite Historico:");
        contrato.abaHistorico = scContrato.nextLine();


        System.out.println("========================================================================================================");

        System.out.println("Imprimir Algo");
        System.out.println("Imprimir Algo");

        System.out.println("========================================================================================================");


        scContrato.close();

        /*--------------------Cadastro-Plano---------------------------------------------- */

        Scanner scCadastroPlano = new Scanner(System.in);

        System.out.println("Digite o Nome Completo do Titular:");
        cadastroPlano.nomeTitular = scCadastroPlano.nextLine();

        System.out.println("Digite o CPF do Titular:");
        cadastroPlano.cpfTitular = scCadastroPlano.nextLine();

        System.out.println("Digite o Numero de telefone do Titular:");
        cadastroPlano.numeroTelefoneTitular = scCadastroPlano.nextLine();

        System.out.println("Digite o Numero para Recado:");
        cadastroPlano.numeroTelefoneRecado = scCadastroPlano.nextLine();

        System.out.println("Digite o Endereco do Titular:");
        cadastroPlano.endereco = scCadastroPlano.nextLine();

        System.out.println("Digite o Tipo de Plano:");
        cadastroPlano.tipoPlano = scCadastroPlano.nextInt();


        System.out.println("========================================================================================================");

        System.out.println("Imprimir algo");
        System.out.println("Imprimir algo");

        System.out.println("========================================================================================================");


        scCadastroPlano.close();

        /*--------------------Pagina-Incial---------------------------------------------- */

        Scanner scPaginaIncial = new Scanner(System.in);

        System.out.println("Digite o Nome Completo do Titular ou de Algum Beneficiario que Esteja no Plano:");
        paginaInicial.nomeCompleto = scPaginaIncial.nextLine();

        System.out.println("Digite o CPF do Titular ou de Algum Beneficiario que Esteja no Plano:");
        paginaInicial.cpf = scPaginaIncial.nextLine();

        System.out.println("Digite o Numero de Contrato:");
        paginaInicial.numeroContrato = scPaginaIncial.nextLine();


        System.out.println("========================================================================================================");

        System.out.println("Imprimir algo");
        System.out.println("Imprimir algo");

        System.out.println("========================================================================================================");


        scPaginaIncial.close();
    }
}