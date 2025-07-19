# Random bible verse
You simply get a random verse from the Bible.

# How to run:
```shell
sudo docker compose up --build
```
# How to run without backend (for backend development):
```shell
sudo docker compose up postgres frontend --build
```
Then you can debug java backend in VSCode using [launch.json](/backend/.vscode/launch.json)

# Credits
File [CzeCSP.sql](CzeCSP.sql) was downloaded from https://github.com/scrollmapper/bible_databases/tree/master

# Tech stack
* React
* Java 21
* Gradle
* Spring Boot REST API
* Docker
* PostgreSQL
