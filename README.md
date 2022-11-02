# Laboratoriska vezba #1 po Veb Programiranje na Dimitar Jovanovski

## Kratko objasnuvanje
Balloon selection veb aplikacija vo koja se sostoi od 4 servleti za prikaz na HTML strani za izbor na baloni i ushte eden servlet za logout.
Isto taka e primenet najbazicen filter.

## Isprateni parametri
### BalloonOrder servlet:
Preku post baranje na /selectBalloon se isprakja goleminata na balonot(ex. Medium)
### ConfirmationInfo servlet:
Preku post baranje na /BalloonOrder.do se isprakjaat imeto na klientot i negovata adresa(ex. "Dimitar", "ul. Partizanski Odredi, Skopje")
 
## Cookies
### Prvo aktiviranje na aplikacijata
Ako se pretpostavi deka korisnikot prethodno ne pristapil do aplikacijata t.e. nema cookie vo kesh mem., togash na GET baranjeto na klientot serverot mu odgovara so inicijaliziranje na cookie(jsessionid).  
ex. Prvicno GET baranje
```
GET / HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Accept-Encoding: gzip, deflate, br
Accept-Language: en-US,en;q=0.9
Cache-Control: no-cache
Connection: keep-alive
```

ex. Prvicen GET odgovor
```
HTTP/1.1 200
Set-Cookie: JSESSIONID=69F5C67E10AD2DC6CF2F6981490745C0; Path=/; HttpOnly
Transfer-Encoding: chunked
Date: Wed, 02 Nov 2022 21:39:31 GMT
Keep-Alive: timeout=60
Connection: keep-alive
```

### Ponatamu
Vekje vo sekoe sledno baranje(GET/POST...) klientot go vklucuva i dadenoto cookie so koe ja identifikuva svojata sesija i atributite asocirani so nea.  
ex. GET baranje na klient so dodeleno cookie
```  
GET /BalloonOrder.do HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Accept-Encoding: gzip, deflate, br
Accept-Language: en-US,en;q=0.9
Cache-Control: no-cache
Connection: keep-alive
Cookie: JSESSIONID=69F5C67E10AD2DC6CF2F6981490745C0
```
