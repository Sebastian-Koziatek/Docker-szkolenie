# Docker images - zadania, czyli uczymy się budować obrazy!

#### Zacznij od zapoznania się z plikiem `Dockerfile`, zwróć uwage jakie parametry są tam zdeklarowane.

1. W folderze znajduje się przygotowany plik `Dockerfile`. Stwórz teraz obraz z tego pliku o nazwie `mc`.
>Pamiętaj o wskazaniu lokalizacji z której zbudujesz obraz, w tym przypadku to folder w którym jesteś.
1. Po zbudowaniu obrazu sprawdź czy obraz jest dostępny w zasobach dockera.
2. Odszukaj swój obraz przy użyciu labela zadeklarowanego w pliku Dockerfile.
3. Skasuj stworzony przez siebie obraz.
4. Z obrazu `Dockerfile2` zbuduj ponownie obraz z tagiem `my-hello-world`. 
>Aby wskazać plik `Dockerfile2` należy podac flagę -f oraz lokalizację i nazwzę pliku.
5. Uruchom kontener i wywołaj swoje imie jako argument dla kontenera
6. Przejrzyj logi kontenera przy użyciu jego ID.
7. Skaskuj stworzone kontenery. 