package loja;

import java.math.BigDecimal;

import loja.Desconto.CalculadoraDeDescontos;
import loja.orcamento.Orcamento;

public class CalculaDesconto {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 5);
		Orcamento segundo  = new Orcamento(new BigDecimal("1000"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		System.out.println("Desconto 5 itens : "  + calculadora.calcular(primeiro));
		System.out.println("Desconto valor > 500 : " + calculadora.calcular(segundo));

	}

}
