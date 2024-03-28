/* 6 - Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
trocados;*/
    
    System.out.print("Valor A: ");
            float valorA = leitorScanner.nextFloat();
            
             System.out.print("Valor B: ");
            float valorB = leitorScanner.nextFloat();
            
            float valorC = valorA;
            valorA = valorB;
            valorB = valorC;
            System.out.println("O valor de A é: " + valorA + "e B tem o valor de: " + valorB);
            }

