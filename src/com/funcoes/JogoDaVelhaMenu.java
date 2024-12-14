package com.funcoes;
public class JogoDaVelhaMenu {

    public static void nome(){
        System.out.println("""
                                                                                                             
     ██╗ ██████╗  ██████╗  ██████╗     ██████╗  █████╗     ██╗   ██╗███████╗██╗     ██╗  ██╗ █████╗ 
     ██║██╔═══██╗██╔════╝ ██╔═══██╗    ██╔══██╗██╔══██╗    ██║   ██║██╔════╝██║     ██║  ██║██╔══██╗
     ██║██║   ██║██║  ███╗██║   ██║    ██║  ██║███████║    ██║   ██║█████╗  ██║     ███████║███████║
██   ██║██║   ██║██║   ██║██║   ██║    ██║  ██║██╔══██║    ╚██╗ ██╔╝██╔══╝  ██║     ██╔══██║██╔══██║
╚█████╔╝╚██████╔╝╚██████╔╝╚██████╔╝    ██████╔╝██║  ██║     ╚████╔╝ ███████╗███████╗██║  ██║██║  ██║
 ╚════╝  ╚═════╝  ╚═════╝  ╚═════╝     ╚═════╝ ╚═╝  ╚═╝      ╚═══╝  ╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝
                                                                                                     
                """);
    }

    public static void menu(){
        System.out.println("╔══════════════════════╗");
        System.out.println("║        MENU          ║");
        System.out.println("║                      ║");
        System.out.println("║ 1 - INICIAR          ║");
        System.out.println("║ 2 - COMO JOGAR       ║");
        System.out.println("║ 3 - SAIR             ║");
        System.out.println("║                      ║");
        System.out.println("╚══════════════════════╝");
        System.out.print("Digite a opção desejada: ");
    }
}