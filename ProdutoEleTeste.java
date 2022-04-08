public class ProdutoEletTeste {

	public static void main(String[] args) {


	
	
		ProdutoEletronico Produto = new ProdutoEletronico("Xbox","Series S",2020,"Sem opcionais");
	
	
	
	Produto.InfoProduto();
	
	
	Produto.setOpcionais("Dois controles e 1 jogo a escolha");
	
	Produto.setModelo("Serios X");
	System.out.println("\n\n");
	Produto.InfoProduto();
	
	
	}

}
