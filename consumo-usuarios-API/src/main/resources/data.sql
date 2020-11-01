
INSERT INTO usuario(ativo, email, login, nome)
	VALUES (TRUE, 'lucas@example.com', 'lucaslima', 'Lucas Lima'),
	(TRUE, 'camilac@example.com', 'camilac', 'Camila Canova'),
	(TRUE, 'camilat@example.com', 'camilat', 'Camila Tainá'),
	(TRUE, 'manu@example.com', 'manu', 'Emanuela Amorim');
	

INSERT INTO public.favorito_usuario(
	ativo, id_filme, usuario_id)
	VALUES (TRUE, 1, 1),
	(TRUE, 2, 1),
	(TRUE, 3, 1),
	(TRUE, 4, 1),
	(TRUE, 5, 1),
	(TRUE, 6, 1);
	
INSERT INTO public.lista_usuario(
	ativo, id_filme, usuario_id)
	VALUES (TRUE, 1, 1),
	(TRUE, 2, 1),
	(TRUE, 3, 1),
	(TRUE, 4, 1),
	(TRUE, 5, 1),
	(TRUE, 6, 1),
	(TRUE, 13, 1),
	(TRUE, 12, 1),
	(TRUE, 11, 1),
	(TRUE, 28, 1),
	(TRUE, 23, 1);
	
INSERT INTO public.historico_usuario(
	ativo, id_filme, usuario_id)
	VALUES (TRUE, 1, 1),
	(TRUE, 2, 1),
	(TRUE, 3, 1),
	(TRUE, 4, 1),
	(TRUE, 5, 1),
	(TRUE, 6, 1);
