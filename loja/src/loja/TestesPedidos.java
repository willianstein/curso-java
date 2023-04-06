package loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import loja.orcamento.Orcamento;
import loja.pedido.Pedido;

public class TestesPedidos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
		String cliente = "willian dev";
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(cliente, data, orcamento);
		
		System.out.println("salvar");
		System.out.println("email");

	}

}
