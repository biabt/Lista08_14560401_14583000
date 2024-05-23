package ex05;
public class StringPerformace {
    public static void main(String[] args) {
        int contadorConcatenacao = 100000;

        // Teste com String
        long inicioTempo = System.currentTimeMillis();
        String palavraTeste = "";
        for (int i = 0; i < contadorConcatenacao; i++) {
        	palavraTeste += "a";
        }
        long fimTempo = System.currentTimeMillis();
        long duracaoConcat = fimTempo - inicioTempo;

        // Teste com StringBuffer
        inicioTempo = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < contadorConcatenacao; i++) {
            stringBuffer.append("a");
        }
        fimTempo = System.currentTimeMillis();
        long durationStringBuffer = fimTempo - inicioTempo;

        // Exibir os resultados
        System.out.println("Tempo gasto com String: " + duracaoConcat  + " ms");
        System.out.println("Tempo gasto com StringBuffer: " + durationStringBuffer  + " ms");
    }
}
