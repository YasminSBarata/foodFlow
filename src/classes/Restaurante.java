/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author yasmi
 */
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String endereco;
    private String categoria;
    private List<Produto> produtos;

    public Restaurante(String nome, String endereco, String categoria) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String getCategoria(){
        return categoria;
    }
    

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
    
}
