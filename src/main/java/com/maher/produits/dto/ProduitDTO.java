package com.maher.produits.dto;

import java.util.Date;

import com.maher.produits.entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {
	
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateCreation;
	 Categorie categorie;
	private String nomCat;


}
