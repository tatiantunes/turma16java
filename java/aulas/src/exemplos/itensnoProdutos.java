package exemplos;
import entidades.Produto;
public class itensnoProdutos {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Produto item1 = new Produto("Touca");
		Produto item2 = new Produto(01,"Cachecol");
		Produto item3 = new Produto(02, "Almofada", 10.00);
		
		System.out.println(item1.descricao +"\t\t"+ item2.codigo + "\t\t" + item3.valorUnitario);
	}

}
