# Massyl_Site_E_Commerce
# Goal : 
- Authentification user
- Lister les articles disponibles / Recherche par nom de l'article 
- Passer une commande sur le site 
- Code promo 
# Micro Services : 
- Service user 
- Service commande
- Service catalogue
- Service stock 
#Détails : 

| Micro Service    |                                                                           Régles à respecter                                                                           |                                                                                                           Fonctionalités attendues |
|:-----------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|-----------------------------------------------------------------------------------------------------------------------------------:|
| Catalogue        |                                                                  On affiche que les produits en stock                                                                  |                                                                                  Ajout / Modif / Suppr / Liste / Recherche par nom |
| Clients          |                                                                                                                                                                        |                                                                                  Ajout / Modif / Suppr / Liste / Recherche par nom |
| Stocks           |                                                          Le stock est diminué à la validation de la commande                                                           |                                                                                  Ajout / Modif / Suppr / Liste / Recherche par nom |
| Coupons Reduc    |                un coupon est attribuer a des utilisateurs<br/> il a une % de reduction <br/>   ce pourcentage s'applique sur le total de la commande  <br/>un coupon ne peut etre utilise qu'une fois par commande<br/>    un utilisateur ne peut utiliser un coupon que deux fois             |                                                                                Ajout / Modif / Suppr / Liste / Recherche par nom |
| Commande         |                                                                           une commande a des articles et des quantites <br/>une commande a un prix en fonction des articles et de leur quantités                                                                           |                                                                                                                          Ajout / Modif / Suppr / Liste / Recherche par nom |
| Authentification |                                                                             Le catalogue et la creation d'un Client est publique<br/>   Le reste des actions est soumis à authentification                                                                         |                                                                                                                          Ajout / Modif / Suppr / Liste / Recherche par nom |