import java.util.ArrayList;
import java.util.List;

public class LongestMountain {
    public int longestMountain(int[] arr) {
        int i = 0;
        int maxLength = 0; // Armazenará o tamanho da maior montanha
        List<Integer> actualMountain = new ArrayList<>();

        // Verifica se o array tem pelo menos 3 elementos para formar uma montanha
        if (arr.length >= 3) {
            for (int j = 1; j < arr.length - 1; j++) { // Começa do segundo elemento e vai até o penúltimo

                // Verifica se o elemento j é o pico da montanha (maior que os vizinhos)
                if (arr[j] > arr[j - 1] && arr[j] > arr[j + 1]) {
                    actualMountain.clear(); // Limpa a lista a cada novo pico
                    actualMountain.add(arr[j - 1]); // Adiciona o valor à esquerda
                    actualMountain.add(arr[j]);     // Adiciona o pico
                    actualMountain.add(arr[j + 1]); // Adiciona o valor à direita

                    int left = j - 2; // Expande para a esquerda
                    while (left >= 0 && arr[left] < arr[left + 1]) {
                        actualMountain.add(0, arr[left]); // Adiciona à esquerda
                        left--;
                    }

                    int right = j + 2; // Expande para a direita
                    while (right < arr.length && arr[right] < arr[right - 1]) {
                        actualMountain.add(arr[right]); // Adiciona à direita
                        right++;
                    }

                    // Verifica se a montanha tem pelo menos 3 elementos
                    if (actualMountain.size() >= 3) {
                        maxLength = Math.max(maxLength, actualMountain.size());
                    }
                }
            }
        }
        System.out.println(actualMountain);

        return maxLength;
    }
}
