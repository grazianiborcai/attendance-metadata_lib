package br.com.gda.helper;

import java.util.ArrayList;
//Teste segundo commit3
public class Category {

	private Integer codCategory;
	private ArrayList<CategoryText> categoryText = new ArrayList<CategoryText>();

	public Integer getCodCategory() {
		return codCategory;
	}

	public void setCodCategory(Integer codCategory) {
		this.codCategory = codCategory;
	}

	public ArrayList<CategoryText> getCategoryText() {
		return categoryText;
	}

	public void setCategoryText(ArrayList<CategoryText> categoryText) {
		this.categoryText = categoryText;
	}

}
