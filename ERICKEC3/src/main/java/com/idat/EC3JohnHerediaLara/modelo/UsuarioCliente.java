package com.idat.EC3JohnHerediaLara.modelo;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name="usuarios")
public class UsuarioCliente {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String usuario;
	private String password;
	private String rol;
	
	@JoinColumn(name = "id_cliente", 
			nullable = false, 
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clientes(id_cliente)"))
	@OneToOne(mappedBy = "Cliente")
	private Cliente Cliente;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
