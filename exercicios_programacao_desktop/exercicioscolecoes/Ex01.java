package br.com.ifmt.exercicios.main;

import br.com.ifmt.colecoes.Produtos;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        Produtos produtoss = new Produtos();
        produtoss.setNome("Notebook");
        listaProdutos.add(produtoss);


    }

    public static void adicionarProduto(){
        System.out.println("Digite o nome do produto: ");
        nome = scanner.nextLine();

    }
}
