/*--------------------------------------------------------------------------
- 10.Crie uma classe chamada Ingresso, que possui um valor em reais e um mé
todo imprimirValor. Crie uma
classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um mé
todo que retorne o
valor do ingresso VIP (com o adicional incluído). Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.
    
    1 - Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimir Valor.
    2 - Crie umaclasse Ingresso VIP, que herda de Ingresso e possui um valor adicional.
    3 - Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
    4- Crie um programa para criar as instâncias de Ingresso e Ingresso VIP, mostrando a diferença de preços.
-----------------------------------------------------------------------------*/


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Extra{


    private String nome; 
    private String posicao;
    //private float valortotalingresso;
    private Date dataNascimento; 
    private String nacionalidade;
    private float altura; 
    private float peso;
    ingresso parateste = new ingresso();

  public Extra() {
 
            this.nome = nome;
            this.posicao = posicao;
            this.dataNascimento = dataNascimento;
            this.nacionalidade = nacionalidade;
            this.altura = altura;
            this.peso = peso;}
   
                                                // Metodo 1
                                                    public float CalculoCOMdesconto(float valorIngresso){
                                                      float valortotalingresso = valorIngresso + parateste.getValorAdicional();
                                                    return valortotalingresso;}
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
-------------------------------------------------
// ingresso:

public class ingresso extends Ingressovip{
    
                            private float valor ;
                            private String tipo;
        

        public ingresso(){
             super();
            
                            this.valor = valor;
                            this.tipo = tipo;}

    

                                            
                                        public float mostrarValorDOingresso(){  
                                           return getValor();
                                        }
                                        
   
                                        
     public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
-------------------------------------------------
//extensão ingresso vip

	public class Ingressovip {
      private float valorAdicional = 588.00f;

                   
      public Ingressovip(){
                                     this.valorAdicional = valorAdicional;}
               

                   
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
-------------------------------------------------
//class main

public class Ingressovip {
      private float valorAdicional = 588.00f;

                   
      public Ingressovip(){
                                     this.valorAdicional = valorAdicional;}
               

                   
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
