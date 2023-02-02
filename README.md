# MicroservicesBootcampDayOneChallenge
 Daily Microservices Challenge of the Bootcamp - Day 1

What I've done:

- Part 1
Dado un nuevo microservicio incompleto llamado priceservice, cumplir con los siguientes requisitos:
▪ Registrar el servicio en Eureka (pista: revisar el fichero pom.xml y la configuración).
▪ Revisar qué falla en los métodos del controlador y corregirlo para que funcionen los endpoints

- Part 2
Crear ahora un nuevo proyecto reto-config-service desde cero y cumplir con los siguientes requisitos:
Añadir en nuestro repositorio Git un fichero reto-config-service.yml con al menos una propiedad.
▪ Configurar el proyecto config-server visto anteriormente para que, al llamar desde el navegador a
http://localhost:8888/reto-config-service/default muestre el contenido de reto-config-service.yml.
▪ Configurar reto-config-service para que importe la configuración del config-server. A continuación,
crear un endpoint en el controlador de reto-config-service que permita visualizar desde el navegador
el valor de alguna propiedad definida en el fichero reto-config-service.yml del repositorio Git.
