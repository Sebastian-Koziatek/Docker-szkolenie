# Izolacja kontnerów - izolacja danych

1.  Uruchom dwa terminale i kazżdym z nich uruchom kontener z obrazu busybox i wejdz do shella.

```   
docker run -it busybox sh
```

2. Na pierwszym `terminalu/kontenerze` stwórz plik szkolenie - 
```bash
touch szkolenie
ls
```
3. Sprawdź na drugim `temrinalu/konterze` czy plik istnieje.
```bash
ls
```

# Izolacja kontnerów - izolacja sieci
1. Używając docker-compose.yml w głownym katalogu, stwórz kontenery na obrazie ubuntu.  

```docker
docker compose up -d
```
2. Pobierz informacje na temat adresu IP z kontenera o nazwie `ubuntunet2`
```bash
docker inspect <container_id>
```
3. Wejdz do shella kontenera `ubuntunet1` 

```
docker exec -it <container_id> bash
```

4. Zainstaluj pakiet potrzebny do wykonania polecenia `ping` (pakiet: **iputils-ping**)

```bash
apt update
apt install iputils-ping
```

5. Wykonaj ping poadając adres IP `ubuntunet2`