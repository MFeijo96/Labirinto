import java.util.Random;

public class Individuo {
	private final static String ESQUERDA = "10";
	private final static String DIREITA = "00";
	private final static String BAIXO = "11";
	private final static String CIMA = "01";
	
	private final static int SAIU = 100;
	private final static int PAREDE = 5;
	private final static int CERTO = 2;
	private final static int DESCONTO_FINAL = 5;
	
    private String genes = "";
    private int aptidao = 0;
    private int x, y;
    private Random r = new Random();

    //gera um indivíduo aleatório
    public Individuo(int numGenes) {
        genes = "";
        x = 0;
        y = 0;
        
        String caracteres = Algoritmo.getCaracteres();
        
        for (int i = 0; i < numGenes*2; i++) {
            genes += caracteres.charAt(r.nextInt(caracteres.length()));
        }
        
        geraAptidao();        
    }

    //cria um indivíduo com os genes definidos
    public Individuo(String genes) {    
        this.genes = genes;
        
        Random r = new Random();
        //se for mutar, cria um gene aleatório
        if (r.nextDouble() <= Algoritmo.getTaxaDeMutacao()) {
            String caracteres = Algoritmo.getCaracteres();
            String geneNovo="";
            int posAleatoria = r.nextInt(genes.length());
            for (int i = 0; i < genes.length(); i++) {
                if (i==posAleatoria){
                    geneNovo += caracteres.charAt(r.nextInt(caracteres.length()));
                }else{
                    geneNovo += genes.charAt(i);
                }
                
            }
            this.genes = geneNovo;   
        }
        geraAptidao();
    }

    //gera o valor de aptidão, será calculada pelo número de bits do gene iguais ao da solução
    private void geraAptidao() {
        for (int i = 0; i < genes.length(); i+=2) {
        	String caminho = genes.substring(i, i+2);
        	if (x < 0 || x > 9 || y < 0 || y >9) aptidao -= SAIU;
        	else {
		    	Elemento elemento = Labirinto.labirinto[y][x];
		    	if (caminho.equals(ESQUERDA)) {
		    		if ((x - 1) < 0) aptidao -= SAIU;
		    		else if (elemento.hasLeftParede()) aptidao -= PAREDE;
		    		else aptidao += CERTO;
		    		x--;
		    	} else if (caminho.equals(DIREITA)) {
		    		if ((x + 1) > 9) aptidao -= SAIU;
		    		else if (elemento.hasRightParede()) aptidao -= PAREDE;
		    		else aptidao += CERTO;
		    		x++;
		    	} else if (caminho.equals(BAIXO)) {
		    		if ((y - 1) < 0) aptidao -= SAIU;
		    		else if (elemento.hasBottomParede()) aptidao -= PAREDE;
		    		else aptidao += CERTO;
		    		y--;
		    	} else {
		    		if ((y + 1) > 9) aptidao -= SAIU;
		    		else if (elemento.hasTopParede()) aptidao -= PAREDE;
		    		else aptidao += CERTO;
		    		y++;
		    	}
        	}
        }
        
        aptidao -= (9 - y + 9 - x) * DESCONTO_FINAL;
    }

    public int getAptidao() {
        return aptidao;
    }

    public String getGenes() {
        return genes;
    }
}