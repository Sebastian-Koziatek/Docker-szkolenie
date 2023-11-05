# Docker scout

![scout]](/Nowe/grafiki/docker_scout.png)

Docker scout to nowe narzędzie (i polecenie jednocześnie) pozwalające na przeprowadzenie testu bezpieczeńśtwa obrazów oraz plików konfiguracyjnych kontenerów (dockerfile). 
Docker Scout wyróżnia się tym, że oferuje zarówno wgląd w zależności wywoływane w określonych warstwach obrazów.  W szczególności zaawansowana analiza obrazu nie tylko pozwala analizować luki w zależnościach, ale także zapewnia opcje zaradcze, które pomagają szybko działać.

Jeśli w obrazie podstawowym występuje luka, Docker Scout sprawdzi, czy obrazy podstawowe są zaktualizowane lub załatane i przedstawi zalecenia dotyczące zastąpienia obrazu podstawowego. Jeśli luka występuje w innych warstwach, Docker Scout wskaże dokładnie, gdzie luka została wprowadzona i odpowiednio przedstawi zalecenia.

https://www.docker.com/products/docker-scout/
___


Jakie problemy rozwiązuje docker scout ?

1. Zalecenia dotyczące napraw kontekstowych
2. Zrozumienie zależności konteneryzowanej aplikacji i analiza luk w zabezpieczeniach
3. Ujednolicony wgląd w analizę składu oprogramowania
4. Integracja sztuczna
4. Aktualizacje luk w zabezpieczeniach sterowane zdarzeniami

![scout_1_docker](/Nowe/grafiki/scout_1.png)

___
Włączanie docker scout w repozytorium / registry.

1. Wejdź na stronę https://hub.docker.com
2. Zaloguj się do swojego konta
3. Przejdź do swojego repozyorium
4. Wejdz w zakładkę "Settings"
5. Włącz "Docker Scout image analysis"

![scout_1_docker](/Nowe/grafiki/scout_2.png)
___

# Docker scout CLI

Polecenie

```bash
docker scout

Usage:  docker scout COMMAND
```

Przykładowe użycie:

Skanowanie obrazu pod kątem CVES (Common Vulnerabilities and Exposures)

```bash
docker scout cves <obraz>
```

Skanowanie podatności z zapisu kontenera

```bash
docker run redis
docker save redis > redis.tar
docker scout cves archive://redis.tar 
```