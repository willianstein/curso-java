package loja.Desconto;

import java.math.BigDecimal;
import loja.orcamento.Orcamento;

public class DescontoMaisCincoItens extends Desconto {
	
	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
