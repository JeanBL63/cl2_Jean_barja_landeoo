package model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cuenta {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String numeroCuenta;
	    private double saldo;
	    private boolean activa;

	    @OneToOne(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "tipo_cuenta_id")
	    private TipoCuenta tipoCuenta;

	    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.PERSIST)
	    private List<Movimiento> movimientos;

	    @ManyToOne
	    @JoinColumn(name = "cliente_id")
	    private Cliente cliente;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNumeroCuenta() {
			return numeroCuenta;
		}

		public void setNumeroCuenta(String numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public boolean isActiva() {
			return activa;
		}

		public void setActiva(boolean activa) {
			this.activa = activa;
		}

		public TipoCuenta getTipoCuenta() {
			return tipoCuenta;
		}

		public void setTipoCuenta(TipoCuenta tipoCuenta) {
			this.tipoCuenta = tipoCuenta;
		}

		public List<Movimiento> getMovimientos() {
			return movimientos;
		}

		public void setMovimientos(List<Movimiento> movimientos) {
			this.movimientos = movimientos;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
	    
	    

}
