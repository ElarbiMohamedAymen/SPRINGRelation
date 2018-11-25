# SPRINGRelation
SpringBoot Application with different relations <br>

OneToOne : person -> Address <br>

ManyToMany(sans porteuse de données) : produit(*) -> magasin(*) <br>

OneToMany : client(1) -> compte(*) <br>

Reflexive(oneToMany) : categorie <br>

MySQL database configuration (default configuration): 
username = root
password = 

database Schema = relations
database url=jdbc:mysql://localhost:3306/relations?useSSL=false

Travis build status [![Build Status](https://travis-ci.org/ElarbiMohamedAymen/SPRINGRelation.svg?branch=master)](https://travis-ci.org/ElarbiMohamedAymen/SPRINGRelation)
