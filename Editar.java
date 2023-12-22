package com.mycompany.cadastrojava;

import java.util.Scanner;

public class Editar {
    Cadastrar edit = new Cadastrar();
    Scanner edit2 = new Scanner(System.in);
    
    private int indice_pessoas;
    private int opcao_edit;
    
    
    public void Edicao(){
        System.out.println("Qual é o número do seu cadastro? digite de 1 a " + edit.num_pessoas);
        this.indice_pessoas = edit2.nextInt();
        
        if(indice_pessoas < 1 || indice_pessoas > edit.num_pessoas){
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
                this.opcao_edit = edit2.nextInt();
            }
        }
        
    }
    
    
}
