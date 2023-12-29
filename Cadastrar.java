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
    private int indice_pessoas;
    private int opcao_edit;
    
    public int num_pessoas = 1, max_pessoas = 500;

    
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
        
        }
    }
    public void Cad(){
        preencherCadastro(cad);
    }

    private void Edicao(){
        System.out.println("Qual é o número do seu cadastro? digite de 1 a " + this.num_pessoas);
        this.indice_pessoas = cad.nextInt();
        
        if(indice_pessoas < 1 || indice_pessoas > num_pessoas){
            System.out.println("Número invalido!");
            
        }else{
            while(opcao_edit == 0){
                System.out.println("Qual dos dados você deseja editar!");
                System.out.println("");
                
                System.out.println("Digite 1 para Nome.");
                System.out.println("Digite 2 para Idade.");
                System.out.println("Digite 3 para Telefone.");
                System.out.println("Digite 4 para CPF.");
                System.out.println("Digite 5 para Email.");
                System.out.println("Digite 6 para Estado civil.");
                System.out.println("Digite 7 para CEP.");
                System.out.println("Digite 8 para Endereço.");
                System.out.println("Digite 9 para Número da casa");
                System.out.println("Digite 10 para Nacionalidade");
                System.out.println("Digite 0 para sair da edição.");
                System.out.print("Digite aqui: ");
                this.opcao_edit = cad.nextInt();
                
                switch (opcao_edit) {
                    case 1:
                        System.out.println("O nome que está é: " + this.nome);
                        System.out.println("Digite o novo nome: ");
                        this.nome = cad.next();
                        break;
                    case 2:
                        System.out.println("A idade que está é: " + this.idade);
                        System.out.println("Digite a nova idade: ");
                        this.idade = cad.nextInt();
                        break;
                    case 3:
                        System.out.println("O telefone que está é: " + this.telefone);
                        System.out.println("Digite o novo telefone: ");
                        this.telefone = cad.nextInt();
                        break;
                    case 4:
                        System.out.println("O cpf que está é: " + this.cpf);
                        System.out.println("Digite o novo cpf: ");
                        this.cpf = cad.nextInt();
                        break;
                    case 5:
                        System.out.println("O email que está é: " + this.email);
                        System.out.println("Digite o novo email: ");
                        this.email = cad.next();
                        break;
                    case 6:
                        System.out.println("O estado cívil que está é: " + this.estCivil);
                        System.out.println("Digite o novo estado cívil: ");
                        this.estCivil = cad.next();
                        break;
                    case 7:
                        System.out.println("O cep que está é: " + this.cep);
                        System.out.println("Digite o novo cep: ");
                        this.cep = cad.nextInt();
                        break;
                    case 8:
                        System.out.println("O endereço que está é : " + this.endereco);
                        System.out.println("Digite o novo endereço: ");
                        this.endereco = cad.next();
                        break;
                    case 9:
                        System.out.println("O número da casa que está é: " + this.numeroCasa);
                        System.out.println("Digite o novo numero da casa: ");
                        this.numeroCasa = cad.nextInt();
                        break;
                    case 10:
                        System.out.println("A nacionalidade que está é: " + this.nacionalidade);
                        System.out.println("Digite a nova nacionalidade: ");
                        this.nacionalidade = cad.next();
                        break;
                        
                        
                        
                }
        }
    }
    
    
}
    public void Edit(){
        Edicao();
    }
}
