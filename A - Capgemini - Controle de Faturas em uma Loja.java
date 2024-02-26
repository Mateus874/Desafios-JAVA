/*-----------------------------------------------------------
6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
 representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for
positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois
retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
-----------------------------------------------------------------*/


//class método
public class pessoa{
           //atributos
     private String itemFturado;
     private String descriçãoItem;
     private float quantidadeComprada;
     private float preçoUnitárioItem;
  
     
         pessoa(float quantidadeComprada,float preçoUnitárioItem, String itemFturado, String descriçãoItem){
         this.quantidadeComprada = quantidadeComprada; 
         this.preçoUnitárioItem = preçoUnitárioItem;  
         this.itemFturado = itemFturado;
         this.descriçãoItem = descriçãoItem;}

     
     
     
     
                                    //metodo = a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
                                      public void getInvoiceAmount(){
                                          double valotTotal = quantidadeComprada * preçoUnitárioItem;
                                          System.out.println("O valor total é: " + valotTotal);
                                      }


//class main
pessoa ObjetoPessoa = new pessoa(0.0f, 0.0f, "", "") ;
         
         ObjetoPessoa.setQuantidadeComprada(0.0f);
         
         
         //entradas
         ObjetoPessoa.setItemFturado(leitor.next());
         ObjetoPessoa.setDescriçãoItem(leitor.next());
         ObjetoPessoa.setQuantidadeComprada(leitor.nextFloat());
         ObjetoPessoa.setPreçoUnitárioItem(leitor.nextFloat());

         
         
       
         System.out.println("O id: "+ ObjetoPessoa.getItemFturado() + ", " + "Produto: " +ObjetoPessoa.getDescriçãoItem()+", " + "Qtd: "+ ObjetoPessoa.getQuantidadeComprada() + ", " + "valor und: " + ObjetoPessoa.getPreçoUnitárioItem());
         ObjetoPessoa.getInvoiceAmount();
