1. Ściagnij obraz systemu Ubuntu i wykonaj jego skanowanie z pomoca docker scout

```
docker pull ubuntu
docker scout cves ubuntu
```

2. Utwórz kontener z obrazu Ubuntu i zapisz jego stan do pliku .tar

```bash
docker run ubuntu 
docker commit <id_container> ubuntu-test  
docker save ubuntu-test > ubuntu.tar
```

3. Za pomocą docker scout dokonaj analizy pod kątem CVES dla tego archiwum .tar


4. Zaloguj się na stronę https://hub.docker.com/ i utwórz dla swojego repozyorium skanowanie
5. W aplikacji Docker dekstop przejrzyj opcje obrazów pod kątem bezpieczeństwa