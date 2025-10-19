# Spring Cloud Stream - Kafka Streams

## Docker 
###  le fichier docker-compose.yml
![alt text](images/image.png)
### Démarrer les conteneurs docker : zookeeper et kafka-broker
![alt text](images/run_containers.png)

### Tester avec Kafka-console-producer et kafka-console-consumer
![alt text](images/test_message.png)


## KAFKA et Stpring Cloud Streams

### Service Producer KAFKA via RestController
![alt text](images/rest_controller.png)

### Service Consumer KAFKA
![alt text](images/consumer.png)
![alt text](images/consumer_result.png)

### Service Supplier KAFKA
#### properties ( avec un delay to 5s )
![alt text](images/app_proprties.png)
#### resultat dans consumer A2
![alt text](images/supplier.png)
