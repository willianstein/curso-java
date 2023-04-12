package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentualDeReajuste() {
			return new BigDecimal("0.3");
			
		}
	},
	BOM {
		@Override
		public BigDecimal percentualDeReajuste() {
			return new BigDecimal("0.15");
			
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualDeReajuste() {
			return new BigDecimal("0.20");
			
		}
	};
	
	
	public abstract BigDecimal percentualDeReajuste();

	
	

}
