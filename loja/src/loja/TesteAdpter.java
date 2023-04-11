package loja;

import java.math.BigDecimal;

import loja.http.ApacheHttpAdapter;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroDeOrcamento;

public class TesteAdpter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroDeOrcamento registro = new RegistroDeOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);

	}

}
