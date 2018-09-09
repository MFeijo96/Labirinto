import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class Quadro extends JPanel {
	private final static String ESQUERDA = "10";
	private final static String DIREITA = "00";
	private final static String BAIXO = "11";
	private final static String CIMA = "01";
	
    private static final int CLUSTER = Labirinto.labirinto.length;
    private static final int GAP = 7;
    private static final Color BG = Color.BLACK;
    public static final int TIMER_DELAY = 2 * 1000;

    public Quadro() {
        JPanel mainPanel = new JPanel(new GridLayout(CLUSTER, CLUSTER));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
        mainPanel.setBackground(BG);
        JPanel[][] panels = new JPanel[CLUSTER][CLUSTER];
        for (int i = 0, a = panels.length - 1; i < panels.length; i++, a--) {
            for (int j = 0; j < panels[i].length; j++) {
                JPanel panel = new JPanel(new GridLayout(CLUSTER, CLUSTER, 0, 0));
                panel.setPreferredSize(new Dimension(100, 50));
                panel.setBackground(BG);
                Elemento elemento = Labirinto.labirinto[a][j];
                int top = elemento.hasTopParede() ? 3 : 0;
                int left = elemento.hasLeftParede() ? 3 : 0;
                int right = elemento.hasRightParede() ? 3 : 0;
                int bottom = elemento.hasBottomParede() ? 3 : 0;
                panel.setBorder(BorderFactory.createMatteBorder(top,left,bottom, right, Color.WHITE));
                mainPanel.add(panel);
                panels[i][j] = panel;
            }
        }
        
      //Define os caracteres existentes
        Algoritmo.setCaracteres("01");
        //taxa de crossover de 60%
        Algoritmo.setTaxaDeCrossover(0.6);
        //taxa de mutação de 3%
        Algoritmo.setTaxaDeMutacao(0);
        //elitismo
        boolean elitismo = true;
        //tamanho da população
        int tamPop = 3000;
        //numero máximo de gerações
        int numMaxGeracoes = 2000;

        //define o número de genes do indivíduo baseado na solução
        int numGenes = 26;

        //cria a primeira população aleatérioa
        Populacao populacao = new Populacao(numGenes, tamPop);

        boolean temSolucao = false;
        int geracao = 0;

        System.out.println("Iniciando... Aptidão da solução: " + numGenes);
        
        //loop até o critério de parada
        while (!temSolucao && geracao < numMaxGeracoes) {
            geracao++;

            Individuo melhor =  populacao.getIndividuo(0);
            //cria nova populacao
            populacao = Algoritmo.novaGeracao(populacao, elitismo);

            System.out.println("Geração " + geracao + " | Aptidão: " + melhor.getAptidao() + " | Melhor: " + melhor.getGenes());
            
            //verifica se tem a solucao
//            temSolucao = populacao.temSolucao(Algoritmo.getSolucao());
        }

        if (geracao == numMaxGeracoes) {
            System.out.println("Número Maximo de Gerações | " + populacao.getIndividuo(0).getGenes() + " " + populacao.getIndividuo(0).getAptidao());
        }

        if (temSolucao) {
            System.out.println("Encontrado resultado na geração " + geracao + " | " + populacao.getIndividuo(0).getGenes() + " (Aptidão: " + populacao.getIndividuo(0).getAptidao() + ")");
        }
        
        String genes = populacao.getIndividuo(0).getGenes();
        
        int y = 9;
        int x = 0;
        for (int i = 0; i < genes.length(); i+=2) {
        	try {
	    		panels[y][x].setBackground(Color.RED);
	    	} catch (Exception e) {
				break;
			}
        	
        	String caminho = genes.substring(i, i+2);
	    	if (caminho.equals(ESQUERDA)) {
	    		x--;
	    	} else if (caminho.equals(DIREITA)) {
	    		x++;
	    	} else if (caminho.equals(BAIXO)) {
	    		y++;
	    	} else {
	    		y--;
	    	}
        }
        
        try {
    		panels[y][x].setBackground(Color.RED);
    	} catch (Exception e) {
			
		}
        
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    private static void createAndShowGui() {
        Quadro mainPanel = new Quadro();

        JFrame frame = new JFrame("Labirinto");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGui();
        });
    }
}