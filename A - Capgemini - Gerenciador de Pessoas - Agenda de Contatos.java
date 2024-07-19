/*---------------------------------------------
12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
operações:
a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda. 
-----------------------------------------------------------*/
package AtividadePOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class pessoa {
    private String nome;
    private int idade;
    private float altura;
    List<String> lista = new ArrayList<String>();
    Scanner leitor = new Scanner(System.in);      
            
            
    public pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
                                           //1
                                           public boolean armazenarPessoa(){
                                           for(int n = 0; n <10; n++){
                                           lista.add(leitor.next());
                                           System.out.println("O nome foi adicionado com sucesso: " + lista.size());}
                                           return true;  }
                                           
                                           //2
                                           public boolean RemoverPessoa(){
                                           lista.remove(0);
                                           System.out.println("O nome foi removido com sucesso: " + lista.get(0));
                                           return true;}
                                           
                                           //3
                                           public boolean ProcurarPosição(String procurar){
                                               int procurarNomeProcurado = lista.indexOf(procurar);
                                           System.out.println("O nome está na posição: " + procurarNomeProcurado);
                                           return true;}
                                           
                                           //4 d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
                                           public boolean mostarAgenda(){
                                           lista.toString();
                                           return true;}
    
    
      public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
    
    public String toString() {
    return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;}
