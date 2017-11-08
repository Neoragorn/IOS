Casier Sofian
TP3 IOS
Serveur Comanche

J'ai commencé par réfléchir au moyen de différencier les deux modes et j'étais parti sur une méthode utilisant un enum. J'ai fini par comprendre que ca ne permettait pas de répondre au sujet vu que le but était d'utiliser des services différents de OSGI.
J'ai donc compris qu'il fallait faire plusieurs bundles : un bundle serveur, un bundle servlet, un bundle file et un bundle "tool" qui réunit les fichiers utilisés par les autres bundles, afin d'éviter la duplication du code.

On utilisait alors le service de tracker pour savoir quand est-ce que l'interface ServletFileI, utilisé par les bundle File et Servlet, était activé sur OSGI. Le serveur recevait l'information et pouvait alors changer de mode selon le type du bundle que l'on activait.

Enfin, la dernière erreur corrigée fut celle des sockets à fermer. J'ai fini par comprendre que, malgré des close() ajoutés dans tous les cas, c'était en fait l'accept() qui semblait poser problème. 

J'ai cru comprendre que si on arretait le serveur d'un coup, tous les processus en cours étaient coupés, et cela renvoyait un RunTimeError, coupant les threads et posant en même temps un probleme de socket non-fermée.
J'ai donc permis au thread de pouvoir être fermé proprement, via le boolean qui passait à false et si jamais, il y avait une erreur de socket alors que le thread était encore en train de tourner, on renvoyait une erreur particulière pour ce cas là.
