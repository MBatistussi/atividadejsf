package com.jsf.crud;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.jsf.crud.dao.SerieDao;

@ManagedBean @RequestScoped
public class SerieBean {

	private int id;  
	private String titulo;  
	private String genero;  
	private String nota;  
	private String temporadas;  
	private String inicio;

	public ArrayList seriesList;

	public int getId() {
		return id;	
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}  
	
	@PostConstruct
	public void init() {
		seriesList = SerieDao.getSeriesList();
	}

	public ArrayList seriesList() {
		return seriesList;
	}
	
	public String salvarDetalhesSerie(SerieBean newSerieObj) {
		return SerieDao.salvarDetalhesSerie(newSerieObj);
	}
	
	public String updateDetalhesSerie(SerieBean updateSerieObj) {
		return SerieDao.updateDetalhesSerie(updateSerieObj);
	}
	
	public String deletarSerie(int serieId) {
		return SerieDao.deletarSerie(serieId);
	}
}