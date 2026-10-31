# Rapport — Couche Controller REST AutoLoc

**Étudiant :** Mayssem Mannai  
**Projet :** AutoLoc  
**Date :** 31 octobre 2026

## 1. Objectif

Implémenter une couche REST pour chaque entité du domaine, documenter les endpoints avec Swagger/OpenAPI et vérifier les cinq opérations CRUD avec Postman et Swagger UI.

## 2. Contrôleurs réalisés

| Entité | Base URL | Controller |
|---|---|---|
| Agence | `/api/agences` | `AgenceRestController` |
| Client | `/api/clients` | `ClientRestController` |
| Contrat | `/api/contrats` | `ContratRestController` |
| Employe | `/api/employes` | `EmployeRestController` |
| Equipement | `/api/equipements` | `EquipementRestController` |
| Maintenance | `/api/maintenances` | `MaintenanceRestController` |
| Paiement | `/api/paiements` | `PaiementRestController` |
| Reservation | `/api/reservations` | `ReservationRestController` |
| Vehicule | `/api/vehicules` | `VehiculeRestController` |

Chaque contrôleur expose :

- `GET /resource` — findAll
- `GET /resource/{id}` — findById
- `POST /resource` — create
- `PUT /resource/{id}` — update
- `DELETE /resource/{id}` — deleteById

Chaque classe possède `@Tag` et chaque méthode possède `@Operation`.

## 3. Documentation Swagger

L’application est configurée avec Springdoc OpenAPI.

```text
Swagger UI : http://localhost:8085/api/swagger-ui/index.html
OpenAPI    : http://localhost:8085/api/v3/api-docs
```

## 4. Tests Postman

La collection importable se trouve ici :

`postman/AutoLoc-All-Entities.postman_collection.json`

Elle contient cinq requêtes exécutables dans cet ordre :

1. `POST /api/vehicules` — création d’un véhicule.
2. `GET /api/vehicules` — récupération de la liste complète.
3. `GET /api/vehicules/{id}` — récupération par identifiant.
4. `PUT /api/vehicules/{id}` — modification du véhicule.
5. `DELETE /api/vehicules/{id}` — suppression par identifiant.

La première requête enregistre automatiquement l’identifiant créé dans la variable `vehiculeId`. Les scripts Postman vérifient les codes HTTP, le type de réponse et la modification du modèle.

## 5. Vérification technique

Le projet compile avec Maven :

```text
./mvnw.cmd test -DskipTests
BUILD SUCCESS
```

La base de données configurée est MySQL (`autoloc_db`) et le serveur utilise le port `8085` avec le contexte `/api`.

## 6. Captures à joindre au rendu

Insérer dans ce dossier les captures suivantes :

```text
docs/captures/
  01-agence-controller.png
  02-client-controller.png
  03-contrat-controller.png
  04-employe-controller.png
  05-equipement-controller.png
  06-maintenance-controller.png
  07-paiement-controller.png
  08-reservation-controller.png
  09-vehicule-controller.png
  10-postman-create.png
  11-postman-findAll.png
  12-postman-findById.png
  13-postman-update.png
  14-postman-delete.png
  15-swagger-findAll-vehicules.png
  16-swagger-findAll-clients.png
```

Les captures Swagger recommandées pour satisfaire explicitement la consigne sont `findAll` pour `Vehicule` et `Client`.

