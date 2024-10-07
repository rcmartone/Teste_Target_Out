public class threeFaturamento {

    public static void main(String[] args) {
        double[] faturamento = {1200.0, 1500.0, 800.0, 950.0, 0.0, 0.0, 2000.0, 1800.0, 1000.0, 3000.0,
                                0.0, 0.0, 2500.0, 1400.0, 1700.0, 3000.0, 2100.0, 0.0, 1800.0, 2200.0};

        double menorValor = calMenorFat(faturamento);
        double maiorValor = calMaiorFat(faturamento);
        double mediaMensal = calMediaMensal(faturamento);
        int diasAcimaMedia = contDiasAcimaMedia(faturamento, mediaMensal);

        System.out.printf("Menor valor de faturamento: %.2f%n", menorValor);
        System.out.printf("Maior valor de faturamento: %.2f%n", maiorValor);
        System.out.printf("Número de dias com faturamento acima da média mensal: %d%n", diasAcimaMedia);
    }

    public static double calMenorFat(double[] faturamento) {
        double menor = Double.MAX_VALUE;

        // O array
        for (int i = 0; i < faturamento.length; i++) {
            // Evita dias com faturamento zero
            if (faturamento[i] > 0 && faturamento[i] < menor) {
                menor = faturamento[i];
            }
        }

        return menor;
    }

    public static double calMaiorFat(double[] faturamento) {
        double maior = 0; // Valor inicial muito baixo

        // O array
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > maior) {
                maior = faturamento[i];
            }
        }

        return maior;
    }

    public static double calMediaMensal(double[] faturamento) {
        double soma = 0;
        int diasComFaturamento = 0;

        // O array
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > 0) {
                soma += faturamento[i];
                diasComFaturamento++;
            }
        }

        // Evita divisão por zero
        if (diasComFaturamento > 0) {
            return soma / diasComFaturamento;
        } else {
            return 0;
        }
    }

    public static int contDiasAcimaMedia(double[] faturamento, double mediaMensal) {
        int diasAcima = 0;

        // O array
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaMensal) {
                diasAcima++;
            }
        }

        return diasAcima;
    }
}
