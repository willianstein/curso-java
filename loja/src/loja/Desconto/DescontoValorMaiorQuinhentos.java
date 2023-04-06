package loja.Desconto;

import java.math.BigDecimal;
import loja.orcamento.Orcamento;

public class DescontoValorMaiorQuinhentos extends Desconto {

	public DescontoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
