package netflix.catalogoAPI.components;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface CatalogoProducer {
	@Output("catalogoTopic")
	MessageChannel output();
}
