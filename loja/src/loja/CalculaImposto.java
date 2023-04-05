package loja;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDEImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

public class CalculaImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);

		CalculadoraDEImpostos calculadora = new CalculadoraDEImpostos();

		System.out.println("Imposto de ISS: "  + calculadora.calcular(orcamento, new ISS()));
		System.out.println("imposto de ICMS: " + calculadora.calcular(orcamento, new ICMS()));

	}

}
