# Eleicao
Mostrar votos obtidos para cada candidato em uma eleição presidencial.
##  ALGORITMO DO EXERCICIO
###  início
	pt=1,pdt=2,pl=3,psdb=4,nulo=5,bran=6
	i = 0
	Enquanto i <= 49 faça
		Digite código do candidato
		ler codigo do canditado
		se codigo 1,2,3,4,5,6
			codigo = codigo+1
			você escolheu PT,PDT,PL,PSDB.NULO,BRANCO?(1)sim (2)não
			ler opção escolhida
			se opção (1)
			exibe 'fim'
			se opção (2)
			exibe 'vote novamente'
			codigo = codigo-1
			i = i-1
			se opção diferente de (1)e(2)
			exibe 'opção invalida'
			codigo = codigo-1
			i = i-1
		se codigo maior que 6
			exibe ' opção invalida'
			i = i-1
	fim enquanto
	exibe a quantidade de votos para cada candidato
fim

![Fluxograma](https://user-images.githubusercontent.com/64235507/168447377-f7b5f419-bec5-4a75-b79b-1050ce76a6d8.png)
