import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    /*
Dado um vetor desordenado de inteiros, retorne os índices de dois elementos que, somados,
resultam no valor alvo fornecido. Assuma que cada entrada tem uma e apenas uma solução e que
não é permitido utilizar o mesmo elemento do vetor mais de uma vez.
Pode retornar os índices em qualquer ordem.
Exemplo:
• Vetor: 2,7,11,15, alvo: 9;
• Resultado: 0,1 (ou 1,0);
• Explicação: os elementos zero e um (2 e 7) são os únicos cuja soma é 9 (o valor alvo).
Você pode criar uma implementação que tenha complexidade de tempo menor que O(n*n)?
  */
    public static void main(String[] args) {
        //Solução simples 1, porém ruim, BIG O Quadratica

        Solution1BigOnAoQuadrado solution1 = new Solution1BigOnAoQuadrado();

        /*System.out.println(Arrays.toString(solution1.solution1(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(solution1.solution1(new int[]{3,2,4},6)));

        Solution2BigOconstante solution2 = new Solution2BigOconstante();
        System.out.println(Arrays.toString(solution2.solution2(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(solution2.solution2(new int[]{3,2,4},6)));*/

        Solution3StreamApi solution3 = new Solution3StreamApi();
        System.out.println(Arrays.toString(solution3.solution3(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(solution3.solution3(new int[]{3,2,4},6)));

    }
}