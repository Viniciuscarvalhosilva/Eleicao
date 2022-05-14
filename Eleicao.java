package eleicao;
import java.util.Scanner;
public class Eleicao 
{

	public static void main(String[] args) 
	{
		
		System.out.println("***********************************************");               //Exibe caracteres na tela do usuario
		System.out.println("***          ELEICAO PRESIDENCIAL           ***");               //Exibe frase na tela do usuario
		System.out.println("***********************************************");               //Exibe caracteres na tela do usuario
		
		
		
		int menu,pt = 0,pdt = 0,pl = 0,psdb = 0,nulo = 0,bran = 0,pt1,pdt1,pl1,psdb1,nulo1,bran1;                     //variaveis do tipo inteiro
		Scanner read = new Scanner(System.in);                          	                // 'read' le entrada pelo teclado
		
		for(int i=0;i<=49;i++) //laço de repeticao For(Variavel 'i' declarada como inteiro,enquanto 'i'for menor ou igual a 49, soma 1 a variavel 'i'
		{
			System.out.println("\nDIGITE O CODIGO CORRESPONDENTE AO SEU CANDIDATO: ");
		
		
			System.out.println("\nCODIGO 1-(13)PT\nCODIGO 2-(12)PDT\nCODIGO 3-(22)PL\nCODIGO 4-(45)PSDB\nCODIGO 5-VOTO NULO\nCODIGO 6-VOTO EM BRANCO");
			menu = read.nextInt();                                                               //Grava frase acima na variavel 'menu'
		
			switch(menu)                                                                         //Estrutura condicional
			{
			case 1:                                                                          //caso 1

				pt = pt+1;                                                                     //Variavel 'pt' Recebe 'pt' + 1
				System.out.println("VOCE ESCOLHEU (13)PT ?\n");      
				System.out.println("(1) CONFIRMAR\n(2) CANCELAR");
				pt1 = read.nextInt();                                                         //Le entrada de usuario e grava na Variavel 'pt1'
				if(pt1 == 1)                                                                  //Estrutura Condicional (Se 'pt1' for igual 1
				{
					System.out.println("********************* FIM *********************\n"); // Exibe frase abaixo na tela do usuario
				}

				else if(pt1==2)                                            					//se 'pt1' for igual a 2
				{
					System.out.println("*************** VOTE NOVAMENTE ****************\n");
					pt = pt-1;                                                                 //Variavel 'pt' recebe 'pt' - 1 
					i = i-1;                                                                 //Variavel 'i' recebe 'i' - 1
				}

				else                                                                         // Se 'pt1' for diferente de 1 E 'pt1' for diferente de 2 
				{	

					System.out.println("*************** OPCAO INVALIDA ***************\n");  //Exibe frase para usuario
					pt = pt-1;                                                                 //Variavel 'pt' recebe 'pt' - 1 
					i = i-1;                                                                 //Variavel 'i' recebe 'i' - 1
				}

				break;                                                                           //Fecha caso 1

			case 2:

				pdt = pdt+1;
				System.out.println("VOCE ESCOLHEU (12)PDT ?\n");
				System.out.println("(1) CONFIRMAR\n(2) CANCELAR");
				pdt1 = read.nextInt();

				if(pdt1 == 1)                                          
				{
					System.out.println("********************* FIM *********************\n"); 
				}

				else if(pdt1==2)
				{
					System.out.println("*************** VOTE NOVAMENTE ****************\n");
					pdt = pdt-1;                                                                 
					i = i-1;                                                                 
				}

				else
				{	

					System.out.println("****************OPCAO INVALIDA ***************\n"); 
					pdt = pdt-1;                                                                  
					i = i-1;                                                                 
				}

				break;

			case 3:

				pl = pl+1;
				System.out.println("VOCE ESCOLHEU (22)PL ?\n");
				System.out.println("(1) CONFIRMAR\n(2) CANCELAR");
				pl1 = read.nextInt();
				if(pl1 == 1)                                          
				{
					System.out.println("********************* FIM *********************\n"); 
				}

				else if(pl1==2)
				{
					System.out.println("*************** VOTE NOVAMENTE ****************\n");
					pl = pl-1;                                                                 
					i = i-1;                                                                
				}

				else
				{	

					System.out.println("*************** OPCAO INVALIDA ***************\n"); 
					pl = pl-1;                                                                 
					i = i-1;                                                                
				}
				break;

			case 4:

				psdb = psdb+1;
				System.out.println("VOCE ESCOLHEU (45)PSDB ?\n");
				System.out.println("(1) CONFIRMAR\n(2) CANCELAR");
				psdb1 = read.nextInt();
				if(psdb1 == 1)                                          
				{
					System.out.println("********************* FIM *********************\n"); 
				}

				else if(psdb1==2)
				{
					System.out.println("*************** VOTE NOVAMENTE ****************\n");
					psdb = psdb-1;                                                                  
					i = i-1;                                                                 
				}

				else
				{	

					System.out.println("*************** OPCAO INVALIDA ***************\n"); 
					psdb = psdb-1;                                                                  
					i = i-1;                                                                 
				}
				break;

			case 5:

				nulo = nulo+1;
				System.out.println("VOCE ANULOU SEU VOTO ?\n");
				System.out.println("(1) CONFIRMAR\n(2) CANCELAR");
				nulo1 = read.nextInt();
				if(nulo1 == 1)                                          
				{
					System.out.println("********************* FIM *********************\n"); 
				}

				else if(nulo1==2)
				{
					System.out.println("*************** VOTE NOVAMENTE ****************\n");
					nulo = nulo-1;                                                                  
					i = i-1;                                                                 
				}

				else
				{	

					System.out.println("*************** OPCAO INVALIDA ***************\n"); 
					nulo = nulo-1;                                                                 
					i = i-1;                                                                
				}
				break;

			case 6:

				bran = bran+1;
				System.out.println("VOCE VOTOU EM BRANCO ?\n");
				System.out.println("(1) CONFIRMAR\n(2) CANCELAR");
				bran1 = read.nextInt();
				if(bran1 == 1)                                          
				{
					System.out.println("********************* FIM *********************\n"); 

				}
				else if(bran1==2)
				{
					System.out.println("*************** VOTE NOVAMENTE ****************\n");
					bran = bran-1;                                                                 
					i = i-1;                                                                 

				}
				else
				{	

					System.out.println("****************OPCAO INVALIDA ***************\n"); 
					bran = bran-1;                                                                 
					i = i-1;                                                                 
				}

				break;
			default:                                                                             // Se valor digitado for diferente dos casos acima
				System.out.println("***************** OPCAO INVALIDA ****************\n");	     // Exibe mensagem na tela do usuario
				i = i-1;

			}
	
		}
		
			System.out.println("===============================================");
			System.out.printf("| (13) PT   - %d VOTOS       %d VOTOS NULOS     |\n",pt,nulo);        //Exibe soma das variaveis 'pt' , 'nulo'
			System.out.printf("| (12) PDT  - %d VOTOS       %d VOTOS EM BRANCO |\n",pdt,bran);        //Exibe soma das variaveis 'pdt' , 'bran'
			System.out.printf("| (22) PL   - %d VOTOS                         |\n",pl);           //Exibe soma da variavel 'pl'
			System.out.printf("| (45) PSDB - %d VOTOS                         |\n",psdb);           //Exibe soma da variavel 'psdb'
			System.out.println("==============================================");
	}		
	
	
}
