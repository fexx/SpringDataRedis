# Projeto de demostração com spring data e redis

## inserindo dados
curl -X POST -i -H "Content-Type: application/json" 'http://localhost:8080/pessoa' --data '{"id": "1","nome": "Fernando","sobrenome": "Evangelista"}'

curl -X POST -i -H "Content-Type: application/json" 'http://localhost:8080/pessoa' --data '{"id": "1","nome": "Carlos","sobrenome": "Oliveira"}'

curl -X POST -i -H "Content-Type: application/json" 'http://localhost:8080/pessoa' --data '{"id": "1","nome": "Carmo","sobrenome": "Silveira"}'

## listando dados
curl 'http://localhost:8080/pessoa'

## atualizando dados
curl -X PUT -H "Content-Type: application/json" 'http://localhost:8080/pessoa/222' --data '{"id": "222","nome": "Fulano2","sobrenome": "Silveira"}'

## deletando dados
curl -X DELETE 'http://localhost:8080/pessoa/222'
