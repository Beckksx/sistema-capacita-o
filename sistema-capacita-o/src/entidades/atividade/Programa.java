package aplicacao;

import entidades.Aula1306;

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //leia = new Scanner(leia.next());
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//        isabela.setSalario(2500);
//
//        ServidorPublico João = new ServidorPublico();
//        ServidorPublico Maria = new ServidorPublico(123,"Maria");
//        System.out.println(Maria.getMatricula());
//        ServidorPublico Khaane = new ServidorPublico(22,"Khaane","contadora");
//        System.out.println(Khaane.getNome());
//
//       // isabela.calcularSalarioHorasExtras();
//
//        isabela.calcularSalarioHorasExtras( 5.60, 10,10);
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.println("Horas extras R$ %.2f: "+ isabela.getHorasExtras());
 //        Produto nome = new Produto();
        //     System.out.println("Nome do produto: ");
     //     leia.nextLine();

       //   Produto preco = new Produto();
//        System.out.println("Preço do produto: ");
  //        leia.nextDouble();

    //      Produto quantidade = new Produto();
      //  System.out.println("Quantidade do produto: ");
      //  leia.nextInt();

        Aula1306 aula  = new Aula1306 ();
        System.out.println("Digite os dados do funcionários");
        System.out.println("Digite seu nome: ");
        aula.setNome(leia.nextLine());
        System.out.println("Salário bruto: ");
        aula.setSb(leia.nextDouble());
        System.out.println("Imposto aplicado: ");
        aula.setImp(leia.nextDouble());
        System.out.println("Nome do funcionário: "+aula.getNome() + "\n Salário: "+aula.salarioLiquido());
        System.out.println("Porcentagem: ");
        aula.setPorcent(leia.nextDouble());
        System.out.println("Atualização!");
        System.out.println("Nome do funcionário: "+aula.getNome() + "\n Salário líquido: "+aula.atualizacaoSalario());










    }
}
