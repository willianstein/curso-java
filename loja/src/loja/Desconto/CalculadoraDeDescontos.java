package loja.Desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisCincoItens(
				new DescontoValorMaiorQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	};
}
