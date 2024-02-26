/*--------------------------------------------------------------------
8. Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e retorne:
i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
-----------------------------------------------------------------------*/
//class
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    public int compara(Data outraData) {
        if (this.ano < outraData.ano) {
            return -1;
        } else if (this.ano > outraData.ano) {
            return 1;
        } else {
            if (this.mes < outraData.mes) {
                return -1;
            } else if (this.mes > outraData.mes) {
                return 1;
            } else {
                if (this.dia < outraData.dia) {
                    return -1;
                } else if (this.dia > outraData.dia) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        Date data = new Date(ano - 1900, mes - 1, dia);
        return dateFormat.format(data);
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    private boolean isValidDate(int dia, int mes, int ano) {
        if (ano >= 1 && mes >= 1 && mes <= 12) {
            int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isBissexto(ano)) {
                diasPorMes[2] = 29;
            }
            return dia >= 1 && dia <= diasPorMes[mes];
        }
        return false;
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }
}

//
public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(15, 6, 2023);
        Data data2 = new Data(20, 6, 2023);

        System.out.println("Data 1: Dia " + data1.getDia() + ", Mês " + data1.getMes() + ", Ano " + data1.getAno());
        System.out.println("Mês de Data 1 por extenso: " + data1.getMesExtenso());
        System.out.println("É ano bissexto? " + data1.isBissexto());

        int comparacao = data1.compara(data2);
        if (comparacao == 0) {
            System.out.println("As datas são iguais.");
        } else if (comparacao < 0) {
            System.out.println("Data 1 é menor que Data 2.");
        } else {
            System.out.println("Data 1 é maior que Data 2.");
        }

        Data cloneData = data1.clone();
        System.out.println("Clone da Data 1: Dia " + cloneData.getDia() + ", Mês " + cloneData.getMes() + ", Ano " + cloneData.getAno());
    }
}
