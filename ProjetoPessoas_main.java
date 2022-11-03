package projetopessoas;
public class ProjetoPessoas_main {

          public static void main(String[] args) {
                 Pessoa p1 = new Pessoa();
                 Aluno p2 = new Aluno();
                 Professor p3 = new Professor();
                 Funcionario p4 = new Funcionario();
                 
                 p1.setNome("pedro");
                 p2.setNome("maria");
                 p3.setNome("claudio");
                 p4.setNome("fabiana");
                 
                 p2.setSexo("feminino");
                 p4.setSexo("feminino");
                 
                 p1.setIdade(25);
                 p3.setIdade(35);
                 
                    System.out.println(p1.status());
                    System.out.println(p2.status());
                    System.out.println(p3.status());
                    System.out.println(p4.status());
                   
          
          }
          
}
