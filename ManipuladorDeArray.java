/**
 * Um objeto desta classe é especializado em realizar diversas operações envolvendo arrays de números inteiros.
 */

public class ManipuladorDeArray
{
    /**
     * Retorna a soma dos números.
     */
    public int retorneSoma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros)
            soma = soma + numero;
        return soma;
    }

    /**
     * Retorna um array contendo os números que estão nas posições ímpares do array numeros.
     */
    public int[] retorneDePosicoesImpares(int[] numeros) {
        int[] resposta = new int[numeros.length / 2];

        for(int i = 1; i < numeros.length; i = i++) //ele vai percorrer o array
            resposta[i/2] = numeros[i];

        return resposta;
    }

    /**
     * Retorna o primeiro e o último número do array números. O método deve retornar um array
     * de tamanho zero caso o array numeros tiver menos de 2 números.
     */
    public int[] retornePrimeiroEUltimo(int[] numeros) {
        int[] resposta;

        if (numeros.length < 2)
            resposta = new int[0];
        else
            resposta  = new int [] {numeros[0], numeros[numeros.length-1]};

        return resposta;
    }

    /**
     * Retorna quantas vezes o numero aparece no array numeros.
     */
    public int retorneQuantasOcorrencias(int[] numeros, int numero) {
        int resposta = 0;

        for(int i = 0;i < numeros.length;i++)
            if (numeros[i] == numero)
                resposta++;
        return resposta;
    }

    /**
     * Retorna o maior número existente no array numeros. Considere que o 
     * array sempre tem pelo menos um número.
     */
    public int retorneMaiorNumero(int[] numeros) {
        int maior = numeros[0]; //vamos supor que o 1º num seja o q esta na primeira posicao

        for (int i = 0; i < numeros.length; i++ )
            if (numeros[i] > maior)
                maior = i;      

        return maior;
    }

    public int retorneMaiorNumero2 (int[] numeros) { 
        return numeros[retornePosicaoDoMaiorNumero(numeros)];
    }

    /**
     * Retorna a posição do maior número existente no array numeros. Se o array tiver tamanho zero
     * então o método deve retornar -1.
     */
    public int retornePosicaoDoMaiorNumero(int[] numeros) {
        int posicao;//variavel q representa a posicao do maior numero do array

        if(numeros.length == 0) //se o array numeros tiver tamanho 0
            posicao = -1; //o valor da posicao sera igual a -1
        else { 
            posicao = 0;

            for (int i = 1; i < numeros.length; i++ ) //nao é necessario testar a primeira posicao(0) pois a hipotese eh q d qo 1º numero é o maior
                if (numeros[i] > numeros[posicao])
                    posicao = i;      

        }
        return posicao;
    }

    /**
     *  Retorna quantos números do array numeros estão acima do limite.
     */
    public int retorneQuantidadeAcimaDeLimite(int[] numeros, int limite) {
        int qtd = 0;

        for(int i = 0; i < numeros.length; i++)
            if (numeros[i] > limite)
                qtd++;

        return qtd;
    }

    /**
     *  Retorna o valor médio do números do array numeros. Considere que o array sempre tem
     *  pelo menos um número.
     */
    public float retorneMedia(int[] numeros) {

        return retorneSoma(numeros) / (numeros.length * 1.0f);
    }

    /**
     * Retorna quantos números do array numeros estão dentro do intervalo
     * (maiores ou iguais a limiteInferior e menores ou iguais a limiteSuperior).
     */
    public int retorneQuantosNoIntervalo(int[] numeros, int limiteInferior, int limiteSuperior) {
        int qtd = 0;

        for (int i = 0; i < numeros.length; i++)
            if(numeros[i] >= limiteInferior && numeros[i]<= limiteSuperior)
                qtd++; 

        return qtd;
    }

    /**
     * Multiplica os números contidos no array numeros por um fator.
     */
    public void multipliquePorFator(int[] numeros, int fator) {
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = numeros[i] * fator;
    }

    /**
     * Retorna novo array contendo os números do array numeros multiplicados por um fator.
     * Exemplo: para o array for [5,2,7] e o fator for 3 então o método deve retornar
     * o array [15, 6, 21]
     */
    public int[] retorneMultiplicadoPorFator(int[] numeros, int fator) {
        int[] multiplicados = new int [numeros.length];

        for (int i = 0; i < numeros.length; i++)
            multiplicados[i] = numeros[i] * fator;

        return multiplicados;
    }

    /**
     * Retorna uma cópia dos n primeiros números do array numeros. Se n for maior
     * que a quantidade de números do array então o método deve retornar uma cópia
     * de todos os números do array.
     */
    public int[] copieNPrimeiros(int[] numeros, int n) {
        int[] copia;
        if (n > numeros.length)
            n = numeros.length;
        copia = new int [n];

        for(int i = 0; i < numeros.length; i++)
            copia[i] = numeros[i];

        return copia;
    }

    /**
     *  Retorna uma copia do array numeros.
     */
    public int[] retorneCopia(int[] numeros) {
        return copieNPrimeiros(numeros, numeros.length);
    }

    /**
     * Retorna os números do array numeros que estão dentro do intervalo
     * [limiteInferior, limiteSuperior]
     */
    public int[] retorneNumerosNoIntervalo(int[] numeros, int limiteInferior, int limiteSuperior) {
        int qtd = 0;
        int[] noIntervalo = new int [qtd];

        for(int numero : numeros)
            if(numeros[i] > limiteInferior && numeros[i] > limiteSuperior){
                noIntervalo[i] = numeros[i];
                qtd++;
            }
        return noIntervalo;
    }

    /**
     * Retorna um array contendo os numeros dos arrays a1 e a2.
     */
    public int[] unaArrays(int[] a1, int[] a2) {
        int[] unidos  = new int[a1.length + a2.length];

        for(int i = 0; i < a1.length; i++)
            unidos[i] = a1[i];// unidos[++i] = numero

        for(int i = a1.length; i < a2.length; i++)
            unidos[a1.length + i] = a2[i]; //unidos[++i] = numero

        return unidos;
    }

    /**
     * Retorna um array contendo apenas os números pares do array numeros.
     */
    public int[] retornePares(int[] numeros) { 
        int[] pares;
        int[] temp = new int[numeros.length];  
        int qtd = 0;

        for(int numero : numeros)
            if(numero % 2 == 0) //se ele for par
                temp[qtd++] = numero;//entao acrescente-o ao array temp

        if(qtd == numeros.length)
            pares = temp;
        else {
            pares = copieNPrimeiros(temp, qtd);
            /**
            pares = new int [qtd];
            for(int i = 0; i < qtd; i++)
            pares[i] = temp[i];
             */
        }   

        return pares;
    }

    /**
     * Retorna um array com os números do array numeros duplicados.
     * Exemplo: se array for [8,3,2] entao o metodo deve retornar [8,8,3,3,2,2].
     */
    public int[] dupliqueArray(int[] numeros) {
        int[] duplicados = new int [numeros.length * 2];
        int i = 0;
        for (int numero : numeros){
            duplicados[i++] = numero;
            duplicador[i++] = numero;
        }

        return duplicados;
    }

    /**
     *  Verifica se o array numeros possui pelo menos um número par.
     */
    public boolean possuiNumeroPar(int[] numeros) {
        boolean possuiOuNao = false;
        int i = 0;

        while(possuiOuNao == false && i < numeros.length)
            if(numeros[i] % 2 == 0)
                possuiOuNao = true;
            else
                i++; //se nao achou boa sorte com o prox numero
        /**
         * Ou tambem eh possivel colocar
         * numeros[i++]
         * pois dessa forma nao sera necessario usar o else
         */

        return possuiOuNao;
    }

    /**
     * Retorna a primeira posição de n no array numeros. Se n nao estiver no array deve retornar -1.
     * Exemplos: a) se numeros for [7,3,2,3,8] e n = 3 entao deve retornar 1.
     */
    public int retornePrimeiraPosicaoDeNumero(int[] numeros, int n) {
        int posicao = -1;
        int i = 0;

        while(posicao == -1 && i < numeros.length)
            if(numeros[i] == n)
                posicao = i;
            else
                i++; //se nao achou boa sorte com o prox numero
        /**
         * Ou tambem eh possivel colocar
         * numeros[i++]
         * pois dessa forma nao sera necessario usar o else
         */

        return posicao;
    }

    /**
     * Retorna um array com as posições do número n no array numeros.
     */
    public int[] retornePosicoesDeNumero(int[] numeros, int n) {
        int[] posicoes;
        int[] temp = new int[numeros.length];  
        int qtd = 0;

        for(int i = 0; i < numeros.length; i++)
            if(numeros[i] == n) 
                temp[qtd++] = i;//entao acrescente-o ao array temp

        if(qtd == numeros.length)
            posicoes = temp;
        else {
            posicoes = copieNPrimeiros(temp, qtd);
        }
        return posicoes;
    }

    /**
     * Verifica se o array possui ou não números repetidos. Deve retornar true se não tiver repetições ou false caso contrário.
     */
    public boolean semRepeticoes(int[] numeros) {
        boolean semRepeticoes = true;
        int i = 0;
        int ultimaPosicaoValida = numeros.length - 1;
        int j; //serve como comparador

        while(semRepeticoes = true && i < ultimaPosicaoValida){// so tem q testar ate o penultimo pq este sera comparado c o ultimo motivo para o qual n sera necessario testa-lo
            j = i + 1;
            while(semRepeticoes && j < numeros.length)
                if(numeros[i] == numeros[j])
                   semRepeticoes = true;
                   else
                   j++;
            i++;       
        }
            return semRepeticoes;
        }

        /**
         * Retorna um array contendo os números do array numeros sem as ocorrências do número n.
         * Exemplo: se array for [8,2,3,2] e n for 2 então deve retornar [8,3].
         */
        public int[] retorneSemOcorrencias(int[] numeros, int n) {
        int[] semN;
        int[] temp = new int[numeros.length];  
        int qtd = 0;

        for(int numero : numeros) {
            if(numero != n) //se o num do array for dif de n
                temp[qtd++] = numeros[i];//entao acrescente-o ao array temp
        }

        if(qtd == numeros.length)
            semN = temp;
        else {
            semN = copieNPrimeiros(temp, qtd);
        }

        return semN;
    }

    public void substituaOcorrencias(int[] numeros, int n1, int n2){
        for(int i = 0;i < numeros.length;i++) 
            if (numeros[i] == n1) //se o numero que estiver na posicao for igual ao numero dado pelo usuario
                numeros[i] = n2;

    }

    public void ultimaOcorrencia(int[] numeros, int n,int n2){
        int resposta = 0; //o valor da resposta sera acrescido conforme o metodo for
        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] == n)
                resposta++;
        int ultimaOcorrencia = 0;
    }
}
