package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.DomainException;
import loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}
}
