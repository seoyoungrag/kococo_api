package kr.co.dwebss.kococo.api.entities;
// Generated 2019. 5. 23 ���� 7:09:58 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.hateoas.ResourceSupport;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin", catalog = "kococo")
public class Admin extends ResourceSupport implements java.io.Serializable {

	private String adminId;
	private String adminPw;
	private Set<Record> records = new HashSet<Record>(0);

	public Admin() {
	}

	public Admin(String adminId) {
		this.adminId = adminId;
	}

	public Admin(String adminId, String adminPw, Set<Record> records) {
		this.adminId = adminId;
		this.adminPw = adminPw;
		this.records = records;
	}

	@Id

	@Column(name = "ADMIN_ID", unique = true, nullable = false, length = 15)
	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	@Column(name = "ADMIN_PW", length = 64)
	public String getAdminPw() {
		return this.adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
	public Set<Record> getRecords() {
		return this.records;
	}

	public void setRecords(Set<Record> records) {
		this.records = records;
	}

}
