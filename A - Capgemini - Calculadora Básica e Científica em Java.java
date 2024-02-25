------------------------------------
13. Crie uma classe Calculadora. Esta classe deve implementar as operações básicas (soma, subtração, divisão
e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que
implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote
java.lang.
---------------------------------

public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
   pessoa P = new pessoa();
   
    float numbA = leitor.nextFloat();
    String sinal = leitor.next();
    float numbB = leitor.nextFloat();
    
    P.calcular(numbA, sinal , numbB);
   
  // P.armazenarPessoa("mateus");,

//classe

public class pessoa {
    private String sinal;

    Scanner leitor = new Scanner(System.in);      
            

    public pessoa() {
        this.sinal = sinal;

    }
    
    
                                           //1
                                           public void calcular(float numbA,String sinal,  float numbB){
                                               if(sinal.equals("+")){
                                              float resultado = numbA + numbB;
                                              System.out.println(resultado);
                                               }else{ System.out.println("erro");
                                           }}
