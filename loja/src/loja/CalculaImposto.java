package loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDEImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class CalculaImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));

		CalculadoraDEImpostos calculadora = new CalculadoraDEImpostos();

		System.out.println("Imposto de ISS: "  + calculadora.calcular(orcamento, new ISS()));
		System.out.println("imposto de ICMS: " + calculadora.calcular(orcamento, new ICMS()));

	}

}
