package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioSalarioMuitoAuto() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("willian", LocalDate.now(), new BigDecimal("25000")));
		
		
		assertEquals(BigDecimal.ZERO, bonus);
	}
	
	@Test
	void SalarioDeveriaSEr10PorcentoDoSalario() {
		BonusService service      = new BonusService();
		BigDecimal salario        = new BigDecimal("2500");
        BigDecimal bunusCalculado = salario.multiply(new BigDecimal("0.1"));
		BigDecimal bonus = service.calcularBonus(new Funcionario("willian", LocalDate.now(), salario));
				
		assertEquals(bunusCalculado, bonus);
	}
	
	@Test
	void bonusMaximo() {
		BonusService service      = new BonusService();
		BigDecimal salario        = new BigDecimal("10000");
        BigDecimal bunusCalculado = salario.multiply(new BigDecimal("0.1"));
		BigDecimal bonus = service.calcularBonus(new Funcionario("willian", LocalDate.now(), salario));
				
		assertEquals(bunusCalculado, bonus);
	}

}
