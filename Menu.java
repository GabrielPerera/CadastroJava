package com.mycompany.cadastrojava;
import java.util.Scanner;

public class Menu{
    Cadastrar cadastrar = new Cadastrar();
    Scanner opc = new Scanner(System.in);
    private int opcao;
    
    public void Men(){
            Intro();
        while(opcao != 0){
            
            
            if(opcao == 0){
                System.out.println("Ok, iremos encerrar o sistema!");
                break;
            }else if(opcao < 1 || opcao > 4){
                System.out.println("");
                System.out.println("Opção invalida, tente novamente!");
                System.out.println("");
                Intro();
            }else{
        
        switch(opcao){
            case 1 -> {
                System.out.println(" ");
                System.out.println("A opção que você selecionou foi 1.");
                System.out.println("Vamos fazer seu cadastro, um momento.");
                cadastrar.Cad();
                System.out.println("");
                Intro();
            }
            case 2 -> {
                System.out.println(" ");
                System.out.println("A opção que você selecionou foi 2.");
                System.out.println("Vamos para o menu de edição, um momento.");
                cadastrar.Edit();   
                System.out.println(" ");
                Intro();
            }
            case 3 -> {
            
            } 
            case 4 -> {
            
            }
        }    
            
            
            }
            
        }
        
    }
    
    private void Intro(){
        System.out.println("Seja bem vindo, esta eh a area de menu, em que posso ajudar?");
        System.out.println(" ");
        
        System.out.println("Escolha umas das opcoes a seguir!");
        System.out.println("Digite 1 para cadastrar-se.");
        System.out.println("Digite 2 para editar seu cadastro.");
        System.out.println("Digite 3 para listar todos os cadastros.");
        System.out.println("Digite 4 para excluir um cadastro.");
        System.out.println("Difite 0 para encerrar.");
        System.out.print("Digite aqui a opção: ");
        this.opcao = opc.nextInt();
    }
    
    
}
