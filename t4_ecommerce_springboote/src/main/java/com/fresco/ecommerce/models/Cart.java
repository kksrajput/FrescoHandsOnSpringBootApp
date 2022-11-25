package com.fresco.ecommerce.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;
	@Column(name = "totalAmount")
	private Double totalAmount;
	
	@JoinColumn(name = "userId")
	@ManyToOne
//	@Column(name = "user")
	private User user;
	
	@OneToMany()
	private List<CartProduct> cartProducts = new ArrayList<>();

	public Cart() {
		super();
	}

	public Cart(Integer cartId, Double totalAmount, User user, List<CartProduct> cartProducts) {
		super();
		this.cartId = cartId;
		this.totalAmount = totalAmount;
		this.user = user;
		this.cartProducts = cartProducts;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartProduct> getCartProducts() {
//		List<CartProduct> C= cartProducts;
		return cartProducts;
	}

	public void setCartProducts(List<CartProduct> cartProducts) {
		this.cartProducts = cartProducts;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", totalAmount=" + totalAmount + ", user=" + user.getUserId()
				+ ", cartProducts=" + cartProducts + "]";
	}
}