package loja.Desconto;

import java.math.BigDecimal;
import loja.orcamento.Orcamento;

public class DescontoMaisCincoItens extends Desconto {
	
	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}
}
