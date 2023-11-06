package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nombres;
	    private String apellidoPaterno;
	    private String apellidoMaterno;
	    
	    @OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
	    private List<Cuenta> cuentas;

	    @ManyToMany
	    @JoinTable(name = "cliente_rol",
	        joinColumns = @JoinColumn(name = "cliente_id"),
	        inverseJoinColumns = @JoinColumn(name = "rol_id")
	    )
	    private List<Rol> roles;


	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidoPaterno() {
			return apellidoPaterno;
		}

		public void setApellidoPaterno(String apellidoPaterno) {
			this.apellidoPaterno = apellidoPaterno;
		}

		public String getApellidoMaterno() {
			return apellidoMaterno;
		}

		public void setApellidoMaterno(String apellidoMaterno) {
			this.apellidoMaterno = apellidoMaterno;
		}

		public List<Cuenta> getCuentas() {
			return cuentas;
		}

		public void setCuentas(List<Cuenta> cuentas) {
			this.cuentas = cuentas;
		}

		public List<Rol> getRoles() {
			return roles;
		}

		public void setRoles(List<Rol> roles) {
			this.roles = roles;
		}   

}
