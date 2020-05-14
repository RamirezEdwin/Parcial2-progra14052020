package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_historial database table.
 * 
 */
@Entity
@Table(name="tb_historial")
@NamedQuery(name="TbHistorial.findAll", query="SELECT t FROM TbHistorial t")
public class TbHistorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idHistorial;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int idUsuario;

	public TbHistorial() {
	}

	public int getIdHistorial() {
		return this.idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}