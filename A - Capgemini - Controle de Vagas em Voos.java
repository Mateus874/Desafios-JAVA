/*--------------------------------------------------------------
9. Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em
determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a ocupação das vagas. A classe deve ter os seguintes métodos:
a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para
armazenar a data utilize um objeto da classe Data, criada na questão anterior);
b. ProximoLivre: retorna o número da próxima cadeira livre
c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna
verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso
contrário
e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
f. GetVoo: retorna o número do vôO
--------------------------------------------------------------*/

package Exercecios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Extra {


    private int codVoo; 
    private Date data;
    private boolean[] cadeiras;


  public Extra(int codVoo) {
            this.codVoo = codVoo;
            this.data = data;
            this.cadeiras = new boolean[100];} // Inicialmente, todas as cadeiras estão desocupadas.

       
  
                                // Metodo 1 para indicar a próxima cadeira diponivel 
                                                public int proximoLivre() {
                                                    for (int i = 0; i < cadeiras.length; i++) {
                                                        if (!cadeiras[i]) {
                                                            return i + 1;
                                                        }
                                                    }
                                                    return 0;
                                                }

    
                                // Método 2 Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
                                                
                                                public boolean verifica(int numeroCadeira){
                                                    if (!cadeiras[numeroCadeira]){
                                                        return true;
                                                    } else {
                                                        return false; 
                                                    }
                                                }                                                                             
                                           
                                          
                                    // Método 3 ocupar uma cadeira
                                    
                                         /* public boolean ocuparCadeira(int ocupar){     
                                          int numeroLivre = proximoLivre();
                                          this.cadeiras[numeroLivre] = cadeiras[numeroLivre];
                                          return true;*/
                                                
                                                
                                                public boolean ocuparCadeira(int numeroCadeira) {
                                            if (verifica(numeroCadeira)) { // Verifica se a cadeira está vazia
                                                this.cadeiras[numeroCadeira - 1] = true; // Marca a cadeira como ocupada
                                                return true;
                                            }
                                            return false; // A cadeira já está ocupada
                                        }

                                          

                                           
                                      //metodo 4 e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
                                           public int retornarNcadeirasVazias(){  // void 
                                            int contadorOcupadas = 0;                         //contador
                                            int contadorVazias = 0;                           //contador
                                                for (int i = 0; i < cadeiras.length; i++){  //for 
                                                 if (!cadeiras[i]){                        //if para saber se tem algo dentro da variavel cadeira
                                                     contadorVazias += 1;                  //Se tiver: +1
                                                 }else{                                   //else para saber o numero de cadeira ocupadas
                                                     contadorOcupadas += 1;}
                                               } 
                                                return contadorOcupadas;} 
                                                                                        
                                                
                                            
  
  
  
  // get e set
public int getCodVoo() {
        return codVoo;
    }

    public void setCodVoo(int codVoo) {
        this.codVoo = codVoo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(boolean[] cadeiras) {
        this.cadeiras = cadeiras;
    }
 
}

///

System.out.println("a próxima cadeira livre é a: " + voos.proximoLivre());
            
            System.out.println(" ");
            

            System.out.println("");
            //System.out.println("testecadiras" + voos.getCadeira);
            //teste 3 3 ocupar uma cadeira
           voos.ocuparCadeira(1);
           System.out.println(voos.ocuparCadeira(0));
           
           System.out.println("");
           
            //Teste dois verifica se a cadeira está ocupada
            voos.verifica(1);
            System.out.println(voos.verifica(0));
            
            // teste 3
            voos.retornarNcadeirasVazias();
            System.out.println(voos.retornarNcadeirasVazias());
        }
    }
