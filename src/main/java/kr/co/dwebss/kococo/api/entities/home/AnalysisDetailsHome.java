package kr.co.dwebss.kococo.api.entities.home;
// Generated 2019. 5. 23 ���� 7:09:58 by Hibernate Tools 4.3.1.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import kr.co.dwebss.kococo.api.entities.AnalysisDetails;

/**
 * Home object for domain model class AnalysisDetails.
 * @see kr.co.dwebss.kococo.api.entities.AnalysisDetails
 * @author Hibernate Tools
 */
public class AnalysisDetailsHome {

	private static final Log log = LogFactory.getLog(AnalysisDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(AnalysisDetails transientInstance) {
		log.debug("persisting AnalysisDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(AnalysisDetails persistentInstance) {
		log.debug("removing AnalysisDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AnalysisDetails merge(AnalysisDetails detachedInstance) {
		log.debug("merging AnalysisDetails instance");
		try {
			AnalysisDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AnalysisDetails findById(Integer id) {
		log.debug("getting AnalysisDetails instance with id: " + id);
		try {
			AnalysisDetails instance = entityManager.find(AnalysisDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
