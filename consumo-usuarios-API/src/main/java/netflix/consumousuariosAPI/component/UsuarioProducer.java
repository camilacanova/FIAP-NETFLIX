package netflix.consumousuariosAPI.component;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioProducer {
	@Output("usuarioTopic")
	MessageChannel output();
}
