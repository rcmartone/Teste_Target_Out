public class fourFatDistribuidora {

    public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;
        System.out.printf("O percentual de SP: %.2f%%%n", percentualSP);
        System.out.printf("O percentual de RJ: %.2f%%%n", percentualRJ);
        System.out.printf("O percentual de MG: %.2f%%%n", percentualMG);
        System.out.printf("O percentual de ES: %.2f%%%n", percentualES);
        System.out.printf("O percentual de Outros: %.2f%%%n", percentualOutros);
    }
}
