package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer numberCont;
	private Date dateContract;
	private Double totalValue;
	
	List <Installment> installments = new ArrayList<Installment>();
	
	public Contract(Integer numberContract, Date dateContract, Double totalValue) {
		this.numberCont = numberContract;
		this.dateContract = dateContract;
		this.totalValue = totalValue;
	}

	public Integer getNumberContract() {
		return numberCont;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberCont = numberContract;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
}
