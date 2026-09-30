# api-mwo-profile

> Stato: archiviato. Progetto del 2017, non più mantenuto. Legge i dati facendo
> scraping delle pagine del profilo su mwomercs.com, quindi con buona
> probabilità non funziona più con il sito attuale (non verificato). Resta
> online come riferimento.

Un servizio REST che raccoglie le statistiche del tuo profilo di
**MechWarrior Online (MWO)**. Gli passi le credenziali del tuo account MWO, lui
fa login su mwomercs.com, legge le pagine del profilo e ti restituisce tutto in
JSON: dati base, mech disponibili e statistiche per mech, arma, mappa e
modalità di gioco.

## Endpoint

Tutti sotto `/api/xtremealex`, in GET, con le credenziali negli header `email`
e `password`:

| Percorso | Cosa restituisce |
|---|---|
| `/mwo/all` | tutto il profilo |
| `/mwo/info` | informazioni del profilo |
| `/mwo/base` | dati base |
| `/mwo/mech/aviable` | mech disponibili |
| `/mwo/mech/stats` | statistiche per mech |
| `/mwo/weapon/stats` | statistiche per arma |
| `/mwo/maps/stats` | statistiche per mappa |
| `/mwo/mode/stats` | statistiche per modalità |
| `/settings/` | l'elenco degli endpoint disponibili |

Da sapere, visto che è codice del 2017: le credenziali viaggiano in chiaro
negli header e il client HTTP disattiva la verifica dei certificati TLS. Va
bene per studiarlo, non per esporlo in rete.

## Stack

- Java EE 7 (JAX-RS con RESTEasy, CDI)
- jsoup per leggere le pagine, json-simple, Gson e ModelMapper
- Maven, packaging `war`

## Build

```bash
mvn clean package
```

Il `war` va rilasciato su un application server Java EE (per esempio WildFly o
JBoss). Il `Procfile` e il plugin `webapp-runner` nel `pom.xml` servivano per
il deploy su Heroku.

## Progetti collegati

- `api-mwo-profile`: questo, il servizio REST
- [`app-mwo-profile`](https://github.com/XtremeAlex/app-mwo-profile): l'applicazione desktop, che fa lo
  stesso lavoro in locale e salva il risultato in un file JSON

## Licenza
Distribuito sotto licenza MIT. Vedi il file [`LICENSE`](LICENSE). Ogni riuso deve mantenere l'attribuzione all'autore.

## Contatti

Andrei Alexandru Dabija (XtremeAlex) · [alexdabi92@gmail.com](mailto:alexdabi92@gmail.com) · [2ad.bubume.it](https://2ad.bubume.it/) · [LinkedIn](https://www.linkedin.com/in/andrei-alexandru-dabija/) · [github.com/XtremeAlex](https://github.com/XtremeAlex)
