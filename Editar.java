package com.mycompany.cadastrojava;

import java.util.Scanner;

public class Editar {
    Cadastrar edit = new Cadastrar();
    Scanner edit2 = new Scanner(System.in);
    
    private int indice_pessoas;
    private int opcao_edit;
    private int sair = 0;
    
    public void Edicao(){
        System.out.println("Qual é o número do seu cadastro? digite de 1 a " + edit.num_pessoas);
        this.indice_pessoas = edit2.nextInt();
        
        if(indice_pessoas < 1 || indice_pessoas > edit.num_pessoas){
            System.out.println("Número invalido!");
            
        }else{
            while(sair != 0){
                
            }
        }
        
    }
    
    
}
