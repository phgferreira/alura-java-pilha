
public class TesteConexao {

	public static void main(String[] args) {
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (Exception e) {
			System.out.println("Deu erro na conexao");
		} finally {
			con.fecha();
		}
	}

}
