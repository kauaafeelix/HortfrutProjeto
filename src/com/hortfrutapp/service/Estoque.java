package com.hortfrutapp.service;
import com.hortfrutapp.model.Fruta;

import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Fruta>estoqueFruta;
	
	public Estoque () {
		estoqueFruta = new ArrayList<>();
		
	}
	
	public List<Fruta> getEstoqueFruta(){
		return estoqueFruta;
	}
	
	public void setEstoqueFruta (List<Fruta>estoqueFruta) {
		this.estoqueFruta = estoqueFruta;
	}
}
