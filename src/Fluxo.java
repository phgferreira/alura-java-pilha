public class Fluxo {

    public static void main(String[] args) {
    	
    	
        System.out.println("Ini do main");
        try {
            metodo1();
        // A | entre os tipos de exceção serve como um OR, ou um tipo de erro ou outro, tem a mesma trataiva
        } catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
        	String msg = e.getMessage();
        	System.out.println("Exception: " + msg);
        	// Imprime o rastro do erro
        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
         new MinhaExcecao("deu muito errado");
        
//        System.out.println("Fim do metodo2");
    }
}