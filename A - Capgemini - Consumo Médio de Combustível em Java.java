/* 3 - Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
    
    ```java*/
    public static void main(String[] args) {  
            float distânciaTotal;
            float combustívelGasto;
            Scanner leitorScanner = new Scanner(System.in);
            distânciaTotal = leitorScanner.nextInt();
            combustívelGasto = leitorScanner.nextInt();
            float divisao = distânciaTotal / combustívelGasto;
            System.out.println(divisao);
