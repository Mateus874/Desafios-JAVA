    /* 3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os seguintes atributos: tipo de combustível,
    valor por litro e quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.
    a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
    b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
    c. alterarValor; //altera o valor do litro do combustível.
    d. alterarCombustivel; //altera o tipo do combustível.
    e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
    Crie uma classe que contenha um método main para testar sua classe BombaCombustível
    */
    
        public class pessoa{
               //atributos
         private String tipoCombustível = " ";
         private float valorDoLitro = 0.0f;
         private float quantidadeCombustível = 0.0f;
         private float valorPago = 0.0f;
         private float valorGasto = 0.0f;
        
         pessoa(){
             
         }
                            //a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
                            public void abastecerPorValor(float qtdGasolina){
                            quantidadeCombustível += qtdGasolina / valorDoLitro;
                            valorGasto += qtdGasolina;
                            } 
                            
     
                            // b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.    
                            public void abastecerPorLitro(){
                            this.valorPago += valorGasto * valorDoLitro;
                            System.out.println("O valor pago é: " + valorPago + " e a quantidade de combustível é: " + quantidadeCombustível);
                            }
                           //c. alterarValor; //altera o valor do litro do combustível.
                            public void alterarCombustivel(float NovoValor){
                            this.valorDoLitro = NovoValor;
                            System.out.println(this.valorDoLitro);}
                            
                            //d. alterarCombustivel; //altera o tipo do combustível.
                            public void alterarTipoC(String novoTipo){
                            this.tipoCombustível = novoTipo;}
                            
                             //e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
                            public void alterarQtdC (float novaQtdC){
                                this.quantidadeCombustível = novaQtdC;
                            }
                            
    
         
         //-----------------------------
         
         
         
    
        public String getTipoCombustível() {
            return tipoCombustível;
        }
    
        public void setTipoCombustível(String tipoCombustível) {
            this.tipoCombustível = tipoCombustível;
        }
    
        public float getValorDoLitro() {
            return valorDoLitro;
        }
    
        public void setValorDoLitro(float valorDoLitro) {
            this.valorDoLitro = valorDoLitro;
        }
    
        public float getQuantidadeCombustível() {
            return quantidadeCombustível;
        }
    
        public void setQuantidadeCombustível(float quantidadeCombustível) {
            this.quantidadeCombustível = quantidadeCombustível;
        }
    
         
        public float getsetValorPago() {
            return valorPago;
        }
    
        public void setValorPago(float valorPago) {
            this.valorPago = valorPago;}
         
     
        public float getValorGasto() {
            return valorGasto;
        }
    
        public void setValorGasto(float valorGasto) {
            this.valorGasto = valorGasto;}
     
        }
    
    //classe main
