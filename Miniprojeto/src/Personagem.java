class Personagem { 
    String nome; 
    int energia; 
 
    public Personagem(String nome, int energia) { 
        this.nome = nome; 
        this.energia = energia; 
    } 
 
    public void alterarEnergia(int quantidade) { 
        this.energia += quantidade; 
        if (this.energia <= 0) { 
            System.out.println(this.nome + " ficou sem energia e pereceu."); 
            System.exit(0); // Encerra o jogo 
        } else if (this.energia > 100) { 
            this.energia = 100; // Limite máximo de energia 
        } 
    } 
}