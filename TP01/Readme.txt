Casier Sofian
TP1 IOS

Le projet semble fonctionner entièrement.
J'ai eu quelques soucis sur le checking de la modification des fichiers. Ma liste principale mise en mémoire dans une ArrayList était mis à jour à chaque boucle du thread sans que je sache pourquoi, date de modification comprise.
J'ai dû créer une HashMap secondaire pour garder en mémoire les dates correctement et pouvoir faire les comparaisons.

Les autres élèves ont dans la majorité utilisé la classe WatchService que je ne connaissais pas. Etant donné que j'étais déjà bie navancé dans mon code, j'ai préféré continuer le programme comme je l'avais imaginé, en faisant moi-même différents Check sur le dossier concerné.
