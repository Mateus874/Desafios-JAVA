/*----------------------------------------------------
Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
Curso de Lógica para Programação III
Instrutor: Marcio Michelluzzi
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os
dados do jogador. Crie um método para calcular a idade
----------------------------------------------------------------*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Extra{


    private String nome ; 
    private String posicao ;
    private Date dataNascimento; 
    private String nacionalidade;
    private float altura; 
    private float peso;
    

  public Extra() {
  
     
            this.nome = nome;
            this.posicao = posicao;
            this.dataNascimento = dataNascimento;
            this.nacionalidade = nacionalidade;
            this.altura = altura;
            this.peso = peso ;}


                                                // Metodo 1
                                                   public void ImprimirDados(){
                                                    System.out.println(getNome());
                                                    System.out.println(getPosicao());
                                                    System.out.println(getDataNascimento());
                                                    System.out.println(getNacionalidade());       
                                                    System.out.println(getAltura());
                                                    System.out.println(getPeso());
                                                   }
  
  
                                                 // Idade
						  Date dataHoje = new Date(); 
                                                  Calendar calendar = Calendar.getInstance();
                                                  calendar.setTime(dataHoje, getDataNascimento());
                                                  int ano = calendar.get(Calendar.YEAR);
                                                  System.out.println(ano);
                                                  
                                                  calendar.setTime(getDataNascimento());
                                                  int anoNascimento = calendar.get(Calendar.YEAR);
                                                  System.out.println(anoNascimento);
                                                  
                                                  
                                                  int data = anoNascimento - ano;
                                                  return data;                
                                        

  // get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

 
}
