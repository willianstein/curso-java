package loja.Desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);

	}
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
		
	}
		
}
