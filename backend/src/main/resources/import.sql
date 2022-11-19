INSERT INTO tb_user (name, nick_Name, email, password) VALUES ('Felipe', 'FeUchiha', 'theflash.fera@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, nick_Name, email, password) VALUES ('Matheus', 'Gavião', 'matheusosternodev@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_anime(title, qtd_Temp, synopsis, language, productor_Or_Studio, date_Lanc, img_Url) VALUES ('Bleach: Sennen Kessen-hen',1,'Ichigo Kurosaki é um estudante normal do ensino médio, até que sua família é atacada por um Hollow, um espírito corrupto que busca devorar almas humanas. É então que ele conhece uma Soul Reaper chamada Rukia Kuchiki, que é ferida enquanto protegia a família de Ichigo do agressor. Para salvar sua família, Ichigo aceita a oferta de Rukia de tomar seus poderes e, como resultado, ele se torna um Ceifador de Almas. No entanto, como Rukia é incapaz de recuperar seu próprio poder, Ichigo se depara com a difícil tarefa de caçar Hollows que assolam sua cidade. No entanto, ele não está sozinho em sua luta, já que mais tarde se juntam a seus amigos: os colegas Orihime Inoue, Yasutora Sado e Uryuu Ishida, que possuem habilidades únicas. Conforme Ichigo e seus amigos se acostumam com suas novas responsabilidades e apoiam uns aos outros dentro e fora do campo de batalha, o jovem Soul Reaper logo descobrirá que os Hollows são o menor de seus problemas.','Japonês','Tite Kubo, Tokyo',TIMESTAMP WITH TIME ZONE '2022-10-11T03:00:00Z','https://stc.animestc.com/1665403174665-image-thumbnail.jpg');
INSERT INTO tb_anime(title, qtd_Temp, synopsis, language, productor_Or_Studio, date_Lanc, img_Url) VALUES ('Chainsaw Man',1,'Chainsaw Man acompanha a história do jovem Denji, que ficou endividado após a morte do pai. Por um acaso do destino, o protagonista salva um cão-Demônio chamado Pochita, ele passa a receber dinheiro para matar demônios para a Yakuza. O cãozinho, Pochita, tem uma peculiar motosserra atrelada ao focinho e, com isso, Denji consegue exterminar os alvos. No entanto, ele é traído pela organização e é morto pelo Zombie Devil, mas Pochita faz o maior sacrifício possível, e salva Denji. Após o incidente, o protagonista renasce como metade humano, metade demônio, capaz de criar motosserras pelo corpo ao puxar uma cordão do peito.','Japonês','Shueisha, MAPPA',TIMESTAMP WITH TIME ZONE '2022-10-11T03:00:00Z','https://stc.animestc.com/1665494620108-image-thumbnail.jpg');
INSERT INTO tb_anime(title, qtd_Temp, synopsis, language, productor_Or_Studio, date_Lanc, img_Url) VALUES ('Boku No Hero Academia 6° Temporada',6,'Por toda a sua vida, Izuku sonhou ser um heroi — um objetivo ambicioso para qualquer um, mas especialmente desafiador para um garoto sem superpoderes. Isso mesmo: em um mundo onde 80% da população tem algum tipo de Dom especial, Izuku teve a má sorte de nascer completamente normal. Mas isso não vai impedi-lo de se matricular em uma das academias de herois mais prestigiosas do mundo.','Japonês','Dentsu, TOHO animation, Shueisha',TIMESTAMP WITH TIME ZONE '2022-10-11T03:00:00Z','https://stc.animestc.com/1664632991792-image-thumbnail.jpg');


INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('01-The Blood Warfare','<iframe src="https://mega.nz/embed/xhFjWQCT#E_-O6sGN45J76E57U2S-MLqA2d3nsK_KvBoJmo653rk" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,1);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('02-Foundation Stones','<iframe src="https://mega.nz/embed/ZoljhSyB#939nxDzO86mFbAj46KcaMRQ1_bTbxasacN9_onK3cvI" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,1);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('03-March of the StarCross','<iframe src="https://mega.nz/embed/Ii5jiB7R#d9pg7Tpm9X6ZBrjDlgJd54MC9c3wdCNtP_z7yHr_EsA" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,1);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('04-Kill The Shadow','<iframe src="https://mega.nz/embed/VkdgUbhI#9yrXVULqRLTl04XflpxjQMWI3YIt1scgQZ2Z_5VBdkg" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,1);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('05-Wrath as a Lightning','<iframe src="https://mega.nz/embed/Hu4myAzK#zSvT9NPzkdl5jt1Qkzg3oKXDWwt8tSYRGp6MWkd2aFo" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,1);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('06-The Fire','<iframe src="https://mega.nz/embed/qQ42RZZR#mPJcOiIDe6jW6pRGGogNtq8bmBzZYOBqDdITFLW5vPM" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,1);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('01-Cachorro e Motosserra','<iframe src="https://mega.nz/embed/csUwXQTK#NVBDFwdofjpZMwYtL2QeJBXUhJ8fTkZBCgE1JhSNoeQ" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,2);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('02-Chegada em Tokyo','<iframe src="https://mega.nz/embed/uFpAmSJA#33q-2FPJiS4axALzPgrEq1YrN140v7DLzPj36iXtNVY" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,2);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('03-O Paradeiro de Miauzin','<iframe src="https://mega.nz/embed/E3Ym3BYK#F6sA2zMqblt8_evzowUg30mgVltb1U6RcQejwY2hi8g" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,2);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('04-Resgate P1','<iframe src="https://mega.nz/embed/Zx0RnSzB#Erj6BlKCf3jkSg1PbvwL0fqLl8Yal-bs7vJV8HtNlaM" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,2);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('05-Resgate P2','<iframe src="https://mega.nz/embed/CjhkhQJS#bQhR-xQD3Zms_5nzst5Yfy_DvWYkus9VbjzhzWnyrwc" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,2);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('06-Matem o Denji','<iframe src="https://mega.nz/embed/jMpmgIbR#_KUDiwxWHDB3nLDja4aBi7MWf4rXnU3sO7yAIWshHy0" width="640" height="360" frameborder="0" allowfullscreen></iframe>',1,2);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('114-Começo Tranquilo','<iframe src="https://drive.google.com/file/d/1sCM2jW6Qv8vTn06trEw7qJygBUbEbmPG/view?usp=sharing" width="640" height="360" frameborder="0" allowfullscreen></iframe>',6,3);
INSERT INTO tb_episode(name_Episode, video_Url, temp, anime_id) VALUES ('115-Mirko, a Número 5','<iframe src="https://drive.google.com/file/d/1sDh2NW1ouLYkV3XtHfABxlf5dsQv23tN/view?usp=sharing" width="640" height="360" frameborder="0" allowfullscreen></iframe>',6,3);




INSERT INTO tb_genre (name) VALUES ('Ação');
INSERT INTO tb_genre (name) VALUES ('Aventura');
INSERT INTO tb_genre (name) VALUES ('Artes Marciais');
INSERT INTO tb_genre (name) VALUES ('Comédia');
INSERT INTO tb_genre (name) VALUES ('Cotidiano');
INSERT INTO tb_genre (name) VALUES ('Demônio');
INSERT INTO tb_genre (name) VALUES ('Demência');
INSERT INTO tb_genre (name) VALUES ('Drama');
INSERT INTO tb_genre (name) VALUES ('Ecchi');
INSERT INTO tb_genre (name) VALUES ('Escolar');
INSERT INTO tb_genre (name) VALUES ('Espacial');
INSERT INTO tb_genre (name) VALUES ('Esportes');
INSERT INTO tb_genre (name) VALUES ('Fantasia');
INSERT INTO tb_genre (name) VALUES ('Ficção Cientifica');
INSERT INTO tb_genre (name) VALUES ('Harem');
INSERT INTO tb_genre (name) VALUES ('Histórico');
INSERT INTO tb_genre (name) VALUES ('Horror');
INSERT INTO tb_genre (name) VALUES ('Infantil');
INSERT INTO tb_genre (name) VALUES ('Isekai');
INSERT INTO tb_genre (name) VALUES ('Game');
INSERT INTO tb_genre (name) VALUES ('Josel');
INSERT INTO tb_genre (name) VALUES ('Magia');
INSERT INTO tb_genre (name) VALUES ('Militar');
INSERT INTO tb_genre (name) VALUES ('Mistério');
INSERT INTO tb_genre (name) VALUES ('Mecha');
INSERT INTO tb_genre (name) VALUES ('Musical');
INSERT INTO tb_genre (name) VALUES ('Policial');
INSERT INTO tb_genre (name) VALUES ('Paródia');
INSERT INTO tb_genre (name) VALUES ('Psicológico');
INSERT INTO tb_genre (name) VALUES ('Romance');
INSERT INTO tb_genre (name) VALUES ('Samurai');
INSERT INTO tb_genre (name) VALUES ('Selnen');
INSERT INTO tb_genre (name) VALUES ('Sci-FI');
INSERT INTO tb_genre (name) VALUES ('Shoujo');
INSERT INTO tb_genre (name) VALUES ('Shoujo-AI');
INSERT INTO tb_genre (name) VALUES ('Shounen');
INSERT INTO tb_genre (name) VALUES ('Shounen-AI');
INSERT INTO tb_genre (name) VALUES ('Slice of Life');
INSERT INTO tb_genre (name) VALUES ('Sobrenatural');
INSERT INTO tb_genre (name) VALUES ('Super Poderes');
INSERT INTO tb_genre (name) VALUES ('Terror');
INSERT INTO tb_genre (name) VALUES ('Tragédia');
INSERT INTO tb_genre (name) VALUES ('Thriller');
INSERT INTO tb_genre (name) VALUES ('Vampiros');
INSERT INTO tb_genre (name) VALUES ('Vida Escolar');
INSERT INTO tb_genre (name) VALUES ('Yaol');
INSERT INTO tb_genre (name) VALUES ('Yuri');

