package kr.co.dwebss.kococo.api.entities.home;
// Generated 2019. 5. 23 ���� 7:09:58 by Hibernate Tools 4.3.1.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import kr.co.dwebss.kococo.api.entities.Analysis;

/**
 * Home object for domain model class Analysis.
 * @see kr.co.dwebss.kococo.api.entities.Analysis
 * @author Hibernate Tools
 */
public class AnalysisHome {

	private static final Log log = LogFactory.getLog(AnalysisHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Analysis transientInstance) {
		log.debug("persisting Analysis instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Analysis persistentInstance) {
		log.debug("removing Analysis instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Analysis merge(Analysis detachedInstance) {
		log.debug("merging Analysis instance");
		try {
			Analysis result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Analysis findById(Integer id) {
		log.debug("getting Analysis instance with id: " + id);
		try {
			Analysis instance = entityManager.find(Analysis.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
