public class FluxoComError {

    public static void main(String[] args) {
    	
    	
        System.out.println("Ini do main");
        try {
            metodo1();
        // A | entre os tipos de exceção serve como um OR, ou um tipo de erro ou outro, tem a mesma trataiva
        } catch (Exception e) {
        	String msg = e.getMessage();
        	System.out.println("Exception: " + msg);
        	// Imprime o rastro do erro
        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
    	System.out.println("Ini metodo 2");
    	metodo2();
    	System.out.println("Fim do metodo 2");
    }
}