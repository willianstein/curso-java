package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
		ReajusteService service = new ReajusteService();
		BigDecimal reajuste     = new BigDecimal("0.3");
		BigDecimal salario      = new BigDecimal("2500");
	    BigDecimal valorTotal   = salario.add(salario.multiply(reajuste));
		Funcionario funcionario = new Funcionario("willian", LocalDate.now(), salario);
		
	    service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
}
