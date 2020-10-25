INSERT INTO tipo_ocorrencia(ativo, nome) VALUES 
(	TRUE	,	'Solicitacao de cancelamento'	)
,(	TRUE	,	'Solicitacao de alteracao email'	)
,(	TRUE	,	'Solicitacao de atendimento geral'	)
,(	TRUE	,	'Dúvida'	)
,(	TRUE	,	'falha tecnica'	)
,(	TRUE	,	'Alteracao de tipo de pagamento'	)
,(	TRUE	,	'Duvidas sobre pagamento'	)
,(	TRUE	,	'Duvidas sobre cancelamento'	)
,(	TRUE	,	'Solicitacao de cancelamento'	);


INSERT INTO tratador(ativo, nivel, nome, email) VALUES 
(TRUE,'NIVEL 1','Carol Tuani','carol@gmail.com')
,(TRUE,'NIVEL 2','Cassia Tamara','cassia@hotmail.com')
,(TRUE,'NIVEL 1','Jose da Silva','jose@gmail.com')
,(TRUE,'NIVEL 2','Joao Jose','joao@gmail.com')
,(TRUE,'NIVEL 1','Carlos Silvano','carlos@hotmail.com')
,(TRUE,'NIVEL 2','Bruna Maria','bruna.m@gmail.com')
,(TRUE,'NIVEL 1','Julia Maria','julia.m@hotmail.com');

INSERT INTO usuario(ativo, nome, email) VALUES
(TRUE,'Camila','carol@gmail.com')
,(TRUE,'Emanuela','cassia@hotmail.com')
,(TRUE,'Lucas','jose@gmail.com')
,(TRUE,'Tadeu','joao@gmail.com')
,(TRUE,'Gorette','carlos@hotmail.com')
,(TRUE,'Bruna','bruna.m@gmail.com')
,(TRUE,'Julia','julia.m@hotmail.com');

INSERT INTO ocorrencia(ativo, descricao, status, tipo_ocorrencia_id, usuario_id, usuario_tratador_id) VALUES 
(TRUE,'Não consigo acessar meus filmes favoritos','AGUARDANDO ATENDIMENTO',1,2,3)
,(TRUE,'Não consigo acessar meus filmes favoritos','AGUARDANDO ATENDIMENTO',1,1,1)
,(FALSE,'Não consigo acessar meus filmes favoritos','ATENDIDO COM SUCESSO',2,2,1)
,(TRUE,'Como marcar filmes para assistir depois?','AGUARDANDO ATENDIMENTO',3,3,1)
,(FALSE,'Não consigo acessar minha conta','ATENDIDO COM SUCESSO',1,4,1)
,(FALSE,'Não consigo acessar minha conta','ATENDIDO COM SUCESSO',2,5,2)
,(FALSE,'Como marcar filmes para assistir depois?','CANCELADO',3,6,2)
,(FALSE,'Não consigo efetuar pagamento','ATENDIDO COM SUCESSO',1,7,2)
,(FALSE,'Não consigo efetuar pagamento','ATENDIDO COM SUCESSO',2,7,2)
,(TRUE,'Não consigo efetuar pagamento','AGUARDANDO ATENDIMENTO',3,7,3)
,(TRUE,'Não consigo efetuar pagamento','AGUARDANDO ATENDIMENTO',1,1,3)
,(TRUE,'Preciso alterar meu email cadastrado','AGUARDANDO ATENDIMENTO',2,5,3)
,(TRUE,'Não consigo efetuar pagamento','AGUARDANDO ATENDIMENTO',3,2,3)
,(TRUE,'Não consigo efetuar pagamento','AGUARDANDO ATENDIMENTO',1,3,3);