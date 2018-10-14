package org.mycompany;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="camel_test")
@NamedQuery(name = "selectQuery", query = "select m from CamelTest m")
public class CamelTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2423601607415310104L;

	@Id
	private Integer seq_no ; 
	private String status ;
	private String column1 ;
	private String column2;
	private Integer column3 ;
	private Date column4;
	
	public Integer getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(Integer seq_no) {
		this.seq_no = seq_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getColumn1() {
		return column1;
	}
	public void setColumn1(String column1) {
		this.column1 = column1;
	}
	public String getColumn2() {
		return column2;
	}
	public void setColumn2(String column2) {
		this.column2 = column2;
	}
	public Integer getColumn3() {
		return column3;
	}
	public void setColumn3(Integer column3) {
		this.column3 = column3;
	}
	public Date getColumn4() {
		return column4;
	}
	public void setColumn4(Date column4) {
		this.column4 = column4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq_no == null) ? 0 : seq_no.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CamelTest other = (CamelTest) obj;
		if (seq_no == null) {
			if (other.seq_no != null)
				return false;
		} else if (!seq_no.equals(other.seq_no))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CamelTest [seq_no=" + seq_no + ", status=" + status + ", column1=" + column1 + ", column2=" + column2
				+ ", column3=" + column3 + ", column4=" + column4 + "]";
	}

}
