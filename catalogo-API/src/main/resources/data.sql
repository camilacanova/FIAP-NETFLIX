insert into genero (ativo, nome) VALUES
(TRUE,'Ação')
,(TRUE,'Animação')
,(TRUE,'Aventura')
,(TRUE,'Cinema de arte')
,(TRUE,'Comédia')
,(TRUE,'Comédia de ação')
,(TRUE,'Comédia de terror')
,(TRUE,'Comédia dramática')
,(TRUE,'Comédia romântica')
,(TRUE,'Dança')
,(TRUE,'Documentário')
,(TRUE,'Docuficção')
,(TRUE,'Drama')
,(TRUE,'Espionagem')
,(TRUE,'Faroeste')
,(TRUE,'Fantasia científica')
,(TRUE,'Ficção científica')
,(TRUE,'Filmes com truques')
,(TRUE,'Filmes de guerra')
,(TRUE,'Musical')
,(TRUE,'Filme policial')
,(TRUE,'Romance')
,(TRUE,'Seriado')
,(TRUE,'Suspense')
,(TRUE,'Terror')
,(TRUE,'Thriller');

insert into categoria (ativo, nome) VALUES
(TRUE,'Oscar 2020')
,(TRUE,'Oscar 2019')
,(TRUE,'Originais Netflix')
,(TRUE,'Originais Netflix')
,(TRUE,'Originais Netflix')
,(TRUE,'Marvel')
,(TRUE,'Marvel');

insert into tag (ativo, nome) VALUES
(TRUE,'Oscar 2020')
,(TRUE,'Oscar 2019')
,(TRUE,'Originais Netflix')
,(TRUE,'Marvel')
,(TRUE,'Disney');

INSERT INTO filme (ano_lancamento, ativo, classificacao_indicativa, data_disponibilidade_final, data_disponibilidade_inicial, descricao, nome, relevancia) VALUES
(2020,TRUE,'L','2022-01-01', '2020-01-01','O Irlandês','O Irlandês',100),
(2020,FALSE,'L','2022-01-01', '2020-01-01','Coringa','Coringa',100),
(2020,TRUE,'L','2022-01-01', '2020-01-01','1917','1917',100),
(2020,FALSE,'L','2022-01-01', '2020-01-01','Parasita','Parasita',100),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Cafarnaum','Cafarnaum',100),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Guerra Fria','Guerra Fria',100),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Nunca Deixe de Lembrar','Nunca Deixe de Lembrar',100),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Roma','Roma',100),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Assunto de Família','Assunto de Família',90),
(2019,TRUE,'16','2022-01-01', '2020-01-01','A Favorita','A Favorita',90),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Green Book - O Guia','Green Book - O Guia',90),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Vice','Vice',90),
(2020,FALSE,'L','2022-01-01', '2020-01-01','História de um Casamento','História de um Casamento',90),
(2020,TRUE,'L','2022-01-01', '2020-01-01','JoJo Rabbit','JoJo Rabbit',90),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Adoráveis Mulheres','Adoráveis Mulheres',100),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Era Uma Vez Em... Hollywood','Era Uma Vez Em... Hollywood',100),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Ford vs Ferrari' ,'Ford vs Ferrari' ,100),
(2019,FALSE,'16','2022-01-01', '2020-01-01','Infiltrado na Klan','Infiltrado na Klan',100),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Pantera Negra','Pantera Negra',100),
(1977,TRUE,'L','2022-01-01', '2020-01-01','Star Wars - Uma Nova Esperança','Star Wars - Uma Nova Esperança',80),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Bohemian Rhapsody','Bohemian Rhapsody',80),
(2019,TRUE,'16','2022-01-01', '2020-01-01','Nasce Uma Estrela','Nasce Uma Estrela',80),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Como Treinar Seu Dragão 3','Como Treinar Seu Dragão 3',80),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Perdi Meu Corpo','Perdi Meu Corpo',80),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Klaus','Klaus',80),
(2020,TRUE,'L','2022-01-01', '2020-01-01','Link Perdido','Link Perdido',80),
(2019,TRUE,'L','2022-01-01', '2020-01-01','Os Incríveis 2','Os Incríveis 2',100),
(2019,TRUE,'L','2022-01-01', '2020-01-01','Ilha dos Cachorros','Ilha dos Cachorros',40),
(2019,TRUE,'L','2022-01-01', '2020-01-01','Mirai','Mirai',100),
(2019,TRUE,'L','2022-01-01', '2020-01-01','WiFi Ralph: Quebrando a Internet','WiFi Ralph: Quebrando a Internet',20),
(2019,TRUE,'L','2022-01-01', '2020-01-01','Homem-Aranha no Aranhaverso','Homem-Aranha no Aranhaverso',100);

insert into categoria_filme (filme_id, categoria_id) VALUES
(1,1),
(2,1),
(3,1),
(4,1),
(5,2),
(6,2),
(7,2),
(8,2),
(9,2),
(10,2),
(11,2),
(12,2),
(13,1),
(14,1),
(15,1),
(16,1),
(17,1),
(18,2),
(19,2),
(20,5),
(21,2),
(22,2),
(23,1),
(24,1),
(25,1),
(26,1),
(27,2),
(28,2),
(29,2),
(30,2),
(31,2),
(19,5);

insert into genero_filme (filme_id, genero_id) values
(1,13),
(2,13),
(3,13),
(4,13),
(5,13),
(6,13),
(7,13),
(8,13),
(9,13),
(10,13),
(11,13),
(12,13),
(13,13),
(14,8),
(15,8),
(16,1),
(17,1),
(18,1),
(19,1),
(20,16),
(21,20),
(22,20),
(23,2),
(24,2),
(25,2),
(26,2),
(27,2),
(28,2),
(29,2),
(30,2),
(31,2);