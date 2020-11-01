package netflix.consumousuariosAPI.cache;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import netflix.consumousuariosAPI.model.Filme;


public final class CacheManagement {
	private static final Logger LOGGER = LoggerFactory.getLogger(CacheManagement.class);
	private final static HashMap<Long, Filme> FILME_CACHE = new HashMap<Long, Filme>();

	private CacheManagement() {
	}

	public synchronized static Filme get(Long id) {
		Filme filme = FILME_CACHE.get(id);
		if (filme == null) {
			LOGGER.info("cache miss for key: " + id);
		} else {
			LOGGER.info("cache hit for key:" + id);
		}
		return filme;
	}

	public synchronized static void put(Filme filme) {
		LOGGER.info("Insert/Udate key: " + filme.getId() + " into cache");
		FILME_CACHE.put(filme.getId(), filme);
	}
}
