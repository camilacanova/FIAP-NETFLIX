package netflix.atendimentoAPI.cache;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import netflix.atendimentoAPI.model.Usuario;

public final class CacheManagement {
	private static final Logger LOGGER = LoggerFactory.getLogger(CacheManagement.class);
	private final static HashMap<Long, Usuario> USUARIO_CACHE = new HashMap<Long, Usuario>();

	private CacheManagement() {
	}

	public synchronized static Usuario get(Long id) {
		Usuario usuario = USUARIO_CACHE.get(id);
		if (usuario == null) {
			LOGGER.info("cache miss for key: " + id);
		} else {
			LOGGER.info("cache hit for key:" + id);
		}
		return usuario;
	}

	public synchronized static void put(Usuario usuario) {
		LOGGER.info("Insert/Udate key: " + usuario.getId() + " into cache");
		USUARIO_CACHE.put(usuario.getId(), usuario);
	}
}
