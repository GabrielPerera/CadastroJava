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
    private String nacionalidade;
    
    public int num_pessoas = 0, max_pessoas = 500;

    
    private void preencherCadastro(Scanner cad){
        if(num_pessoas <= max_pessoas){
            System.out.println("Vamos começar o seu cadastro! Você é a pessoa número " + num_pessoas++);
            
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
        
        System.out.print("Nacionalidade: ");
        this.nacionalidade = cad.next();
        
        num_pessoas++;
        }
    }
    public void Cad(){
        preencherCadastro(cad);
    }
    /*public void Contagem(){
        for(int numPessoas = 0, numPessoas <= 500, numPessoas++){
            preencherCadastro(cad);
        }
    }*/
    
}
