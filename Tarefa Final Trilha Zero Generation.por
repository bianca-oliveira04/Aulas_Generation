programa
{
	
	funcao inicio()
	{
		escreva "olá mundo"
		
		inteiro vet[10]
		vet[0] = 2
		vet[1] = 5
		vet[2] = 1
		vet[3] = 3
		vet[4] = 4
		vet[5] = 9
		vet[6] = 7
		vet[7] = 8
		vet[8] = 10
		vet[9] = 6

		inteiro a,b
		
		para(inteiro i = 0; i<= 9; i++){
			escreva(vet[i] + "\n")

			se (i==9){
				escreva(vet[i])
			}
			senao{
				escreva(vet[i],"-")
			}
		}
          para (b=0; b<9; b++){
          	para(a=0; a<9; a++){
          		se(vet[a] < vet[a+1]){
          			inteiro aux = vet[a]
          			vet[a] = vet[a+1]
          			vet[a+1] = aux
          		}
          	}
          }

escreva("\nvet ordenado:")
para(inteiro i=0;i<10;i++){
	se(i==9){
		escreva(vet[i]) 
	}senao{
		escreva(vet[i],"-")
	}
   }

  }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */