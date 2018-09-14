package com.jsf.crud.dao;

import java.util.ArrayList;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.jsf.crud.SerieBean;

public class SerieDao {

	static ArrayList<SerieBean> seriesList = new ArrayList<SerieBean>();  
	
	public static ArrayList getSeriesList() {
		return seriesList;
	}

	public static String salvarDetalhesSerie(SerieBean newSerieObj) {
		String navigationResult = "";
		seriesList.add(newSerieObj);
		navigationResult = "studentsList.xhtml?faces-redirect=true";
		return navigationResult;
	}

	public static String updateDetalhesSerie(SerieBean updateSerieObj) {
		
		for (int i = 0; i < seriesList.size(); i++) {
			SerieBean thisSerie = seriesList.get(i);
			if (thisSerie.getId() == updateSerieObj.getId()) {
				thisSerie = updateSerieObj;
				seriesList.remove(i);
				seriesList.add(thisSerie);
			}
		}
		return "/editElement.xhtml?faces-redirect=true";
	}

	public static String deletarSerie(int serieId){
		
		for (int i = 0; i < seriesList.size(); i++) {
			SerieBean thisSerie = seriesList.get(i);
			if (thisSerie.getId() == serieId) {
				seriesList.remove(i);
			}
		}
		return "/list.xhtml?faces-redirect=true";
	}
}