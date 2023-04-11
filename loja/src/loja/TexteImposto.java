package loja;

import java.math.BigDecimal;

import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.imposto.Imposto;
import loja.orcamento.Orcamento;

public class TexteImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));

	}

}
