INSERT INTO tb_atividade (nome, descricao,preco) VALUES ('Curso de HTML', 'Aprenda HTML de forma pratica', 80.00)

INSERT INTO tb_atividade (nome, descricao,preco) VALUES ('Oficina de GITHUB', 'Controle versões de seus projetos', 50.00)

INSERT INTO tb_participante (nome, email) VALUES ('Jose Silva', 'jose@gmail.com')

INSERT INTO tb_atividade_participante (participantes_id, atividades_id) VALUES (1, 1);

INSERT INTO tb_atividade_participante (participantes_id, atividades_id) VALUES (1, 2);

INSERT INTO tb_categoria(descricao) VALUES('Curso')

INSERT INTO tb_categoria(descricao) VALUES('Oficina')

UPDATE tb_atividade SET  atividades = 1 WHERE id=1

UPDATE tb_atividade SET  atividades = 2 WHERE id=2

INSERT INTO tb_bloco (fim, inicio) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z')

UPDATE tb_atividade SET  atividade = 1 WHERE id=1

INSERT INTO tb_bloco (fim, inicio) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T17:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T21:00:00Z')

UPDATE tb_atividade SET  atividade = 2 WHERE id=2





