package jogoDaVelha;

import java.util.Scanner;

public class jogoDavelha {
	public static void main (String[] args) {
	
		Campo[][] jogo= new Campo[3][3];
		char simboloDaVez = 'X';
		Boolean game = true;
		String vitoria="";
		Scanner scan = new Scanner(System.in);
		
		iniciarJogo(jogo);
		
		while(game) {
			DesenhoGame(jogo);
			vitoria = verifiqueVitoria(jogo);
			if(!vitoria.equals(" ")) {
				System.out.printf("jogador %s venceu%n", vitoria);
				break;
			}
			try {
				if(verificarJogada(jogo,jogar(scan,simboloDaVez),simboloDaVez)) {
				if(simboloDaVez== 'X') {
					simboloDaVez='O';
				}else {
					simboloDaVez='X';
				}
				
				}
				}
			catch(Exception e){
				System.out.println("erro");
			}	
		}
	System.out.println("finm de jogo");
	
	}
	public static void DesenhoGame(Campo[][] jogo) {
		limparTela();
		System.out.println("0  1  2");
		System.out.printf("0 %c | %c | %c %n",jogo[0][0].getSimbolo(),jogo[0][1].getSimbolo(),jogo[0][2].getSimbolo());
		System.out.println(" -------------");
		System.out.printf("1 %c | %c | %c %n",jogo[1][0].getSimbolo(),jogo[1][1].getSimbolo(),jogo[1][2].getSimbolo());
		System.out.println(" -------------");
		System.out.printf("2 %c | %c | %c %n",jogo[2][0].getSimbolo(),jogo[2][1].getSimbolo(),jogo[2][2].getSimbolo());
	}
	public static void limparTela() {
		for(int cont=0;cont<200;cont++) {
			System.out.println("");
		}
	}
	public static int[] jogar(Scanner scan, char sout) {
		int p[]	=new int[2];
		System.out.printf("%s %c %n","quem joga?",sout);
		System.out.print("informe a linha");
		p[0]=scan.nextInt();
		System.out.print("informe a coluna: ");
		p[1]=scan.nextInt();
		return p;
	}
	public static boolean verificarJogada(Campo[][] jogo,int p[],char simboloDaVez){
		if(jogo[p[0]][p[1]].getSimbolo()==' '){
			jogo[p[0]][p[1]].setSimbolo(simboloDaVez);
			return true;
			}else {
				return false;
			}
		
	}
	public static void iniciarJogo(Campo[][] jogo) {
		for (int l=1; l<3;l++) {
			for (char c=1;c<3;c++) {
				jogo[1][c]=new Campo();
			}
		}
	}
	
	public static String verifiqueVitoria(Campo[][] jogo) {
		return " ";
	}
	
	
}
