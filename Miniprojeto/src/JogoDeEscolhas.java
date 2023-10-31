import java.util.Scanner; 
 
public class JogoDeEscolhas { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Criando personagens 
        Personagem personagem1 = new Personagem("Herói", 100); 
        Personagem personagem2 = new Personagem("Aventureiro", 80); 
 
        // Capítulos da história 
        String capitulo1 = "Você está em uma floresta misteriosa. Você vê uma trilha à esquerda e uma caverna à direita."; 
        String capitulo2a = "Você segue a trilha à esquerda e encontra um rio. Você pode nadar pelo rio ou voltar para a floresta."; 
        String capitulo2b = "Você entra na caverna e encontra uma passagem escura. Você pode continuar ou voltar para a floresta."; 
        String capitulo3a1 = "Você nada pelo rio e encontra um tesouro. Você é rico agora!"; 
        String capitulo3a2 = "Você nada pelo rio, mas é arrastado pela correnteza. O jogo acabou."; 
        String capitulo3b1 = "Você continua na caverna e encontra um dragão. Você morre."; 
        String capitulo3b2 = "Você volta para a floresta e encontra uma vila amigável. Você é bem-vindo."; 
 
        // Exibindo o primeiro capítulo 
        System.out.println("Personagem: " + personagem1.nome); 
        System.out.println("Energia: " + personagem1.energia); 
        System.out.println(capitulo1); 
        System.out.println("Escolha 1: Seguir a trilha à esquerda"); 
        System.out.println("Escolha 2: Entrar na caverna à direita"); 
        String escolha = scanner.nextLine(); 
 
        if (escolha.equals("1")) { 
            personagem1.alterarEnergia(-10); // Perde 10 de energia 
            System.out.println("Personagem: " + personagem1.nome); 
            System.out.println("Energia: " + personagem1.energia); 
            System.out.println(capitulo2a); 
            System.out.println("Escolha 1: Nadar pelo rio"); 
            System.out.println("Escolha 2: Voltar para a floresta"); 
            escolha = scanner.nextLine(); 
            if (escolha.equals("1")) { 
                personagem1.alterarEnergia(20); // Ganha 20 de energia 
                System.out.println("Personagem: " + personagem1.nome); 
                System.out.println("Energia: " + personagem1.energia); 
                System.out.println(capitulo3a1); 
            } else if (escolha.equals("2")) { 
                System.out.println(capitulo3a2); 
            } 
        } else if (escolha.equals("2")) { 
            personagem2.alterarEnergia(-20); // Perde 20 de energia 
            System.out.println("Personagem: " + personagem2.nome); 
            System.out.println("Energia: " + personagem2.energia); 
            System.out.println(capitulo2b); 
            System.out.println("Escolha 1: Continuar na caverna"); 
            System.out.println("Escolha 2: Voltar para a floresta"); 
            escolha = scanner.nextLine(); 
            if (escolha.equals("1")) { 
                System.out.println(capitulo3b1); 
            } else if (escolha.equals("2")) { 
                personagem2.alterarEnergia(30); // Ganha 30 de energia 
                System.out.println("Personagem: " + personagem2.nome); 
                System.out.println("Energia: " + personagem2.energia); 
                System.out.println(capitulo3b2); 
            } 
        } 
 
        // Fechando o scanner 
        scanner.close(); 
    } 
}