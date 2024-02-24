package br.com.alura.screenmatch.principal;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/*Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse
 para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título
 de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.*/

public class ApiGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome de um livro");


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=AIzaSyAo7y5ash_2LgFe72jvhpiPVpdxLng9JJo"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
