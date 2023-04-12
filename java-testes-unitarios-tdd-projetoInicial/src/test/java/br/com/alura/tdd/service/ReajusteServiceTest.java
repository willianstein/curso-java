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
		Desempenho desempenho   = Desempenho.A_DESEJAR;
		BigDecimal salario      = new BigDecimal("2500");
	    BigDecimal valorTotal   = salario.add(salario.multiply(desempenho.percentualDeReajuste()));
		Funcionario funcionario = new Funcionario("willian", LocalDate.now(), salario);
		
	    service.concederReajuste(funcionario, desempenho);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForBom(){
		ReajusteService service = new ReajusteService();
		Desempenho desempenho     = Desempenho.BOM;
		BigDecimal salario      = new BigDecimal("2500");
	    BigDecimal valorTotal   = salario.add(salario.multiply(desempenho.percentualDeReajuste()));
		Funcionario funcionario = new Funcionario("willian", LocalDate.now(), salario);
		
	    service.concederReajuste(funcionario, desempenho);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForOtimo(){
		ReajusteService service = new ReajusteService();
		Desempenho desempenho     = Desempenho.OTIMO;
		BigDecimal salario      = new BigDecimal("2500");
	    BigDecimal valorTotal   = salario.add(salario.multiply(desempenho.percentualDeReajuste()));
		Funcionario funcionario = new Funcionario("willian", LocalDate.now(), salario);
		
	    service.concederReajuste(funcionario, desempenho);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
}
