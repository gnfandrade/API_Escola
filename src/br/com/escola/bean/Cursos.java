package br.com.escola.bean;

public class Cursos {
	
	private int idCurso;
	private String nomeCurso;
	private String categoria;
	private String dias;
	private String horarios;
	private String periodo;
	
	public Cursos() {}
	
	public Cursos(String nomeCurso, String categoria, String dias, String horarios, String periodo) {
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
		this.categoria = categoria;
		this.dias = dias;
		this.horarios = horarios;
		this.periodo = periodo;
	}

	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	

}
