package com.mycompany.cadastrojava;
import java.util.Scanner;

public class Cadastrar {
    Scanner cad = new Scanner(System.in);
    private String nome;
    private int idade;
    private int telefone;
    private int cpf;
    private String email;
    private String estCivil;
    private int cep;
    private String endereco;
    private int numeroCasa;
    //private String nacionalidade;

    
    private void preencherCadastro(Scanner cad){
        System.out.print("Nome: ");
        this.nome = cad.next();
        
        System.out.print("Idade: ");
        this.idade = cad.nextInt();
        
        System.out.print("Telefone: ");
        this.telefone = cad.nextInt();
        
        System.out.print("CPF: ");
        this.cpf = cad.nextInt();
        
        System.out.print("Email: ");
        this.email = cad.next();
        
        System.out.print("Estado Cívil: ");
        this.estCivil = cad.next();
        
        System.out.print("Cep: ");
        this.cep = cad.nextInt();
        
        System.out.print("Endereço: ");
        this.endereco = cad.next();
        
        System.out.print("Número da casa: ");
        this.numeroCasa = cad.nextInt();
        
        //System.out.print("Nacionalidade: ");
        //this.nacionalidade = cad.next();
        
    }
/*
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public int getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
*/    
    public void Cad(){
        preencherCadastro(cad);
    }
    
}
