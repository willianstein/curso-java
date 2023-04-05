package loja.Desconto;

import java.math.BigDecimal;
import loja.orcamento.Orcamento;

public class DescontoValorMaiorQuinhentos extends Desconto {

	public DescontoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() >= 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}
}
