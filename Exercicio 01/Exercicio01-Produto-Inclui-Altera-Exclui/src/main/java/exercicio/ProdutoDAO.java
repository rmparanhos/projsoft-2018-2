package exercicio;

import java.util.List;


public interface ProdutoDAO
{	
	public long inclui(Produto umProduto); 

	public void altera(Produto umProduto)
		throws ProdutoNaoEncontradoException; 
	
	public void exclui(long id) 
		throws ProdutoNaoEncontradoException; 
	
	public Produto recuperaUmProduto(long numero) 
		throws ProdutoNaoEncontradoException; 
	
	public List<Produto> recuperaProdutos();
}

//ProdutoDAO   <--implemnta-- JPAProdutoDAO
//	-Inclui			          -Inclui
//	-Altera                   -Altera
//	-Exclui                   -Exclui

//Primeiro cria-se uma interface e depois uma classe que implementa a interface