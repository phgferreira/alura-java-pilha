public class FluxoComTratamento {

    public static void main(String[] args) {
    	
    	
        System.out.println("Ini do main");
        try {
            metodo1();
        // A | entre os tipos de exceção serve como um OR, ou um tipo de erro ou outro, tem a mesma trataiva
        } catch (ArithmeticException | NullPointerException e) {
        	String msg = e.getMessage();
        	System.out.println("ArithmeticException: " + msg);
        	// Imprime o rastro do erro
//        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            Conta conta = null;
            conta.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}