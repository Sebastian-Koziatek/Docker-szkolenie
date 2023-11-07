<h1> Konteneryzacja bazy danych MySQL </h1>

1. Zapoznaj się z przykładową konfiguracją bazy danych w pliku `docker-compose.yml`
2. Stwóz plik `.env` zawierający zmienne potrzebne do konfiguracji
3. Połącz się teraz z bazą danych kontnera

```bash
mysql -h 127.0.0.1 -P 3306 -u root -p
```
4. Dodaj konfigurację volumenu dla tego 

```docker
    volumes:
      - dbdata:/var/lib/mysql
volumes:
  dbdata:
```