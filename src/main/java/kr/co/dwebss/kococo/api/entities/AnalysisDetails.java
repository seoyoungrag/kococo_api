package kr.co.dwebss.kococo.api.entities;
// Generated 2019. 5. 23 ���� 7:09:58 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AnalysisDetails generated by hbm2java
 */
@Entity
@Table(name = "analysis_details", catalog = "kococo")
public class AnalysisDetails implements java.io.Serializable {

	private Integer analysisDetailsId;
	private Analysis analysis;
	private Integer termTypeCd;
	private Date termStartDt;
	private Date termEndDt;

	public AnalysisDetails() {
	}

	public AnalysisDetails(Analysis analysis, Integer termTypeCd, Date termStartDt, Date termEndDt) {
		this.analysis = analysis;
		this.termTypeCd = termTypeCd;
		this.termStartDt = termStartDt;
		this.termEndDt = termEndDt;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ANALYSIS_DETAILS_ID", unique = true, nullable = false)
	public Integer getAnalysisDetailsId() {
		return this.analysisDetailsId;
	}

	public void setAnalysisDetailsId(Integer analysisDetailsId) {
		this.analysisDetailsId = analysisDetailsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ANALYSIS_ID")
	public Analysis getAnalysis() {
		return this.analysis;
	}

	public void setAnalysis(Analysis analysis) {
		this.analysis = analysis;
	}

	@Column(name = "TERM_TYPE_CD")
	public Integer getTermTypeCd() {
		return this.termTypeCd;
	}

	public void setTermTypeCd(Integer termTypeCd) {
		this.termTypeCd = termTypeCd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TERM_START_DT", length = 19)
	public Date getTermStartDt() {
		return this.termStartDt;
	}

	public void setTermStartDt(Date termStartDt) {
		this.termStartDt = termStartDt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TERM_END_DT", length = 19)
	public Date getTermEndDt() {
		return this.termEndDt;
	}

	public void setTermEndDt(Date termEndDt) {
		this.termEndDt = termEndDt;
	}

}
