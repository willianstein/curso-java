package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	private BigDecimal salario;
	
	@BeforeEach
	private void inicializar() {
		this.salario     = new BigDecimal("2500");
		this.service     = new ReajusteService();
        this.funcionario = new Funcionario("willian", LocalDate.now(), this.salario);
	}
	
	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
		Desempenho desempenho   = Desempenho.A_DESEJAR;
	    BigDecimal valorTotal   = this.salario.add(this.salario.multiply(desempenho.percentualDeReajuste()));

	    this.service.concederReajuste(this.funcionario, desempenho);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForBom(){
		Desempenho desempenho     = Desempenho.BOM;
		BigDecimal valorTotal     = this.salario.add(this.salario.multiply(desempenho.percentualDeReajuste()));

	    this.service.concederReajuste(this.funcionario, desempenho);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForOtimo(){
		Desempenho desempenho     = Desempenho.OTIMO;
		BigDecimal valorTotal     = this.salario.add(this.salario.multiply(desempenho.percentualDeReajuste()));

	    this.service.concederReajuste(this.funcionario, desempenho);
		assertEquals(valorTotal, funcionario.getSalario());
		
	}
}
