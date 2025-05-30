package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");
        isabela.setSalario(188);

       // isabela.calcularSalarioHorasExtras();

        isabela.calcularSalarioHorasExtras( 10, 24,4, 9, 1, 8);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.println("Horas extras R$ %.2f: "+ isabela.getHorasExtras());



    }
}
