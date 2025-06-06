package aplicacao;

import entidades.Produto;
//import entidades.ServidorPublico;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        leia = new Scanner(leia.next());
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

 // System.out.println("Digite as informações do produto:");
   //     System.out.println("Nome: ");
     //   produto.setNome(leia.next());
       // System.out.println("Preço: ");
        //produto.setPrice(leia.nextDouble());
       // System.out.println("Quantidade em estoque: ");
       // produto.setQuantly(leia.nextInt());

       // System.out.println("Informações do produto: "+produto.getNome());
     
         Produto nome = new Produto();
         System.out.println("Digite os dados do produto: ");
        System.out.println("Nome do produto: ");
          Produto produto = new Produto();
          produto.setNome(leia.next());

        System.out.println("Preço do produto: ");
          produto.setPreco(leia.nextDouble());

        System.out.println("Quantidade do produto: ");
        produto.setQuatidade(leia.nextInt());

        System.out.println("Dados do produto" +produto);
        System.out.println("Digite o número dos produtos adicionados no estoque: ");
        int addProdutos = leia.nextInt();
        produto.addProdutos(addProdutos);
        System.out.println("Atualização: "+produto);
        System.out.println("Digite o número de produtos que vai ser removido: ");
        int removerProdutos = leia.nextInt();
        produto.removerProdutos(removerProdutos);

        System.out.println("Informações do produto: "+produto); 






    }
}
