package kr.co.dwebss.kococo.api.entities.home;
// Generated 2019. 5. 23 ���� 7:09:58 by Hibernate Tools 4.3.1.Final

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import kr.co.dwebss.kococo.api.entities.Record;

/**
 * Home object for domain model class Record.
 * @see kr.co.dwebss.kococo.api.entities.Record
 * @author Hibernate Tools
 */
public class RecordHome {

	private static final Log log = LogFactory.getLog(RecordHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Record transientInstance) {
		log.debug("persisting Record instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Record persistentInstance) {
		log.debug("removing Record instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Record merge(Record detachedInstance) {
		log.debug("merging Record instance");
		try {
			Record result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Record findById(Integer id) {
		log.debug("getting Record instance with id: " + id);
		try {
			Record instance = entityManager.find(Record.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
