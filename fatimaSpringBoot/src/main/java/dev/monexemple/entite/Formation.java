package dev.monexemple.entite;

import org.springframework.data.annotation.Id;

public class Formation {
	@Id
	private String id;
	private String formaName;
	private String Number;

	public void Customer() {
	}

	public void Costumer(String formaName, String Number) {
		this.formaName = formaName;
		this.Number = Number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormaName() {
		return formaName;
	}

	public void setFormaName(String formaName) {
		this.formaName = formaName;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", formaName=" + formaName + ", Number=" + Number + "]";
	}
}