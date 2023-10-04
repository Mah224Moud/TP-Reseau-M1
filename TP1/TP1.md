# Exo1

1. version du navigateur: 1.1
2. version du serveur: 1.1 (200 OK)
3. langage accépté par le serveur: en-US
4. ip du serveur: `128.119.245.12` et ip du navigateur: `172.31.20.53`
5. derniere modif du fichier par le serveur: `Thu 14, sep 2023`

# Exo2

1. Dans la premiere requete y'a t-il "If-Modified-Since" ? `Non`
2. Le serveur retourne t-il le contenu du fichier ? `Oui`
3. Dans la deuxième requete y'a t-il "If-Modified-Since" ? `Oui`
4. Quelle information contient t-il ? La date de modification
5. Quelle est le code response ? `304` ==> `Not Modified`

# Exo3

1. Combien de paquets renvoyer par la requête 1 HTTP GET ? `1`
2. Quel nuemro de paquet ? `38`
3. Numero paquet contenant le code et le msg du serveur `41`
4. Combien de segment TCP de données ? `4861`

# Exo4

1. Combien de requets HTTP GET ? `3`
2. A quelle adresse internet ?
   - `128.119.245.12` ==> `gaia.cs.umass.edu`
   - `178.78.137.164` ==> `kurose.cslash.net`  
     **Remarque:** 1er HTTP GET ==> `128.119.245.12` renvoie une reponse qui contient du texte brut (contenu de la page ) puis se rend compte qu'on une image à afficher et un lien à ouvrir. Il refait donc des requetes HTTP GET pour répondre au 2e et 3e
3. Est-il possible de savoir si votre navigateur a telecharge les images de facon sequentielle ou si elles ont ete telechargees en parallele ou sequentielle ? `Oui` parce que les port de réponses sont differentes

# Author

@ Mamoudou  
@ Vladislav Antoshkin
