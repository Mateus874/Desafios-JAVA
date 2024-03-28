/*--------------------------------------------------------------------
5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
------------------------------------------------------------------*/
public void calcularMédia(){
                                    


 MediaFinal = (2 * notaProva1 + 2 * notaProva2 + 2 * notaTrabalho) / (2 + 2 + 2);   
                                     System.out.println(MediaFinal);}
                                     
    
                                    // b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
                                     public void testeFinal(){
                                     float teste = (7 * 2) - MediaFinal;
                                     System.out.println(teste);}
                                     }
