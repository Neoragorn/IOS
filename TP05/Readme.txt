Casier Sofian
M2 MIAGE

TP05 IOS


Au niveau de l'architecture, j'avais opté pour mettre la majorité du code dans le fichier qui implémentait les méthodes de l'interface. J'ai pu me rendre compte que cela faisait beaucoup trop de ligne au niveau des méthodes. J'ai donc séparé les conditions des exceptions dans un fichier appelé ManageException.java. De plus, j'ai transféré le lancement des exceptions, innitialement placées dans BankImpl.java dans un Bank.java, pour éviter que le lancement des exceptions se fasse dans la partie "front" du serveur.

L'architecture est donc la suivante : 

  Client => interface  <=    BankImpl/Bank => Database
	 			   ^
				   ||
		            ManageException


L'impléméntation de la banque reçoit, traite et renvoie les données via l'interface au client et transmet à la DataBase les modfications via le singleton mis en place dans cette même DataBase. (Il s'agit juste d'add et remove, étant donné que nous n'avons pas une véritable base de données. J'imagine qu'avec une véritable BDD, on aurait des méthodes pour les CREATE, UPDATE, REMOVE ou autre à l'intérieur de la Database et qu'on les appellerait depuis l'implémentation)

La difficulté fut surtout dans le choix d'une bonne architecture pour ce projet et de la bonne mise à jour des données de la DataBase. J'ai dû repasser sur mon code pour le rendre plus léger, notamment avec la création du ManageException.java puis en repassant sur certaines méthodes, leur fonctionnement sous certaines conditions ne répondant pas à ce que j'attendais.

J'ai donc 2 fichiers Main pour tester à partir du client. Le fichier Main.java est une suite d'opérations sur deux comptes, le cheminement y est expliqué en commentaire.
Le fichier  mainTest.java s'occupe de tester les différentes exceptions dans des scénarios simples.	  






