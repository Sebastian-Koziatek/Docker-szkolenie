## Docker sock 

> Po pierwsze należy zrozumiec czym jest docker.sock. Jest to domyślny socket systemu unix który odpowiada za komunikację pomiędzy proecasami na hoście. Docker deamon domyślnie nasłuchuje docker.sock, jeżeli jesteś na systemie Linux/Unix to możesz użyć /var/run/docker.sock do zarządzania kontenerami. 

Możemy sobie podejrzeć te sockety:

```
curl --unix-socket /var/run/docker.sock http://localhost/version
```
> Reasumując jeżli kontenerowi dockera umożliwimy komunikację z socketem demona dockera to możemy uruchomić dockera w dockerze np tak:

```
docker run -ti --rm -v /var/run/docker.sock:/var/run/docker.sock docker /bin/sh
```

> UWAGA! - jeżeli przekażesz kontenerowi docker.sock to pamiętaj że kontener będzie miał więcej uprawnień nad demonem dockera na twoim hoście. Więc kiedy chcesz tego użyć w celach produkcyjnych to miej to na uwadze `(ale lepiej unikaj)`!

![docker socket](/grafiki/docker-socket.png) 

### Dla testu się zabawmy

1.  Uruchom docker container w interaktywnym trybie z zamontowaniem docker.sock jako volumenu. Dla bezpiczeńśtwa użyjemy domyślnego docker image

```
docker run -ti --rm -v /var/run/docker.sock:/var/run/docker.sock docker /bin/sh
```
2. Kiedy jesteś już w kontenerze możesz zaoberwować że masz tu wszystko to co u siebie na hośćie, spradź odpowiednio uruchomione kontenery i obrazy. 