package loja.imposto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class ICMS implements Imposto{

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
