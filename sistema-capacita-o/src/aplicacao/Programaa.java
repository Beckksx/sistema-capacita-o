package aplicacao;

import entidades.Curso;
import entidades.ServidorPublico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Programaa {

        Scanner leia = new Scanner(System.in);

        //Lista de Servidores
        List<ServidorPublico> servidores = new ArrayList<>();
        //Lista de cursos
        List<Curso> cursos =new ArrayList<>();

        /**
         * Método que adiciona o servidor instanciado na nossa [...]
         */
        public void adicionarServidorPublico() {
            int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a matricula: "));
            String nome = JOptionPane.showInputDialog(null,"Informe nome do servidor: ");
            String orgao = JOptionPane.showInputDialog(null, "Informe o orgão: ");
            String cargo = JOptionPane.showInputDialog(null, "Informe o cargo: ");
            String lotacao = JOptionPane.showInputDialog(null, "Informe a locação: ");
            String email = JOptionPane.showInputDialog(null, "Informe o email do servidor: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o salário do servidor:"));

            ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, salario, cargo, lotacao, email);
            servidores.add(servidor);

          };
        /**
         * Método que lista todos os mossos servidores adicionados na lista de Servidores
         */
        public void listarServidoresPublicos(){
            for (ServidorPublico servidor: servidores){
                System.out.println(servidor);
            }
        }

    public void listarServidoresPublicos(int matricula){
            boolean encontrou = false;
            for (ServidorPublico servidor : servidores){
                if (servidor.getMatricula() == matricula){
                    System.out.println(servidor);
                    encontrou = true;
                    break;
                }
            }
            if (!encontrou){
                JOptionPane.showMessageDialog(null,"Servidor não encontrado!!!");
            }

    }

    public void listarServidoresPublicos(String nome){
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores){
            if (servidor.getNome().equalsIgnoreCase(nome)){
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            JOptionPane.showMessageDialog(null,"Servidor não encontrado!!!");
        }

    }

      public static void main(String[] args){
            Programaa programa = new Programaa();
            programa.adicionarServidorPublico();
            programa.listarServidoresPublicos();

         programa.listarServidoresPublicos(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));

          programa.listarServidoresPublicos(JOptionPane.showInputDialog(null, "Informe o nome que deseja pesquisar"));

}

    }


