package org.nextgenbank.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_transactions database table.
 * 
 */
@Entity
@Table(name="user_transactions")
@NamedQuery(name="UserTransaction.findAll", query="SELECT u FROM UserTransaction u")
public class UserTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="IS_DEBIT")
	private String isDebit;

	@Column(name="TRAANSACTION_SHORT_FORM")
	private String traansactionShortForm;

	@Column(name="TRANSACTION_AMOUNT")
	private int transactionAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name="TRANSACTION_DETAIL")
	private String transactionDetail;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	public UserTransaction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIsDebit() {
		return this.isDebit;
	}

	public void setIsDebit(String isDebit) {
		this.isDebit = isDebit;
	}

	public String getTraansactionShortForm() {
		return this.traansactionShortForm;
	}

	public void setTraansactionShortForm(String traansactionShortForm) {
		this.traansactionShortForm = traansactionShortForm;
	}

	public int getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDetail() {
		return this.transactionDetail;
	}

	public void setTransactionDetail(String transactionDetail) {
		this.transactionDetail = transactionDetail;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}