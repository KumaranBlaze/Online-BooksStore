package com.pageone.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_book")
@Getter
@Setter
@ToString
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String sku;

	private String name;

	private String description;

	@Column(name = "unit_price")
	private BigDecimal unitprice;

	@Column(name = "image_url")
	private String imageurl;

	private Boolean active;

	@Column(name = "units_in_stock")
	private int unitsInStock;

	@Column(name = "date_created")
	private Date createdon;

	@Column(name = "last_updated")
	private Date updatedon;

	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;
}
